
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class reg_class {
   String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/hannadb";
   String user = "root";
   String pass ="";
   
public int reg(String firstname, String lastname, String username, String password ){
       int res =0;
       try {
           Class.forName(forname);
           Connection con = DriverManager.getConnection(driver,user,pass);
           PreparedStatement pss = con.prepareStatement("Select * from user where username = ?");
           pss.setString(1, username);
           ResultSet rs = pss.executeQuery();
           if(rs.next()){
               res =-1;
           }else{
           PreparedStatement ps = con.prepareStatement("insert into user values(null,?,?,?,md5(?))");
           ps.setString(1,firstname);
           ps.setString(2, lastname);
           ps.setString(3, username);
           ps.setString(4, password);
           
          res =  ps.executeUpdate();
           }
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(reg_class.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(reg_class.class.getName()).log(Level.SEVERE, null, ex);
       }return res;
   }
   
}
