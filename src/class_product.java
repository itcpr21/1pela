import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class class_product {
   String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/hannadb";
   String user = "root";
   String pass ="";
   
 public void addProd(String product,int quantity,String price){
          try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,user,pass);
              PreparedStatement ps = con.prepareStatement("insert into tblproduct values(null,?,?,?)");
              ps.setString(1, product);
              ps.setInt(2, quantity);
              ps.setString(3, price);
              ps.executeUpdate();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          }
   }
   
 public void remove(int id){
         try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,user,pass);
              PreparedStatement ps = con.prepareStatement("delete from tblproduct where item_id =?");
              ps.setInt(1, id);
              
              ps.executeUpdate();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          }
   }
 
public void editProduct(int id, String product, int quantity, String price){
          try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,"root","");
              PreparedStatement ps = con.prepareStatement("update tblproduct set item_name = ?,item_quantity = ?, item_price = ? where item_id =?");
              ps.setString(1,product);
              ps.setInt(2,quantity);
              ps.setString(3,price);
              ps.setInt(4,id);
              ps.executeUpdate();
              
          } catch (SQLException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          }
   }

 public void addqty(int id,int qty){
           try {
           Class.forName(forname);
           Connection con = DriverManager.getConnection(driver,user,pass);
           PreparedStatement ps = con.prepareStatement("update tblproduct set item_quantity= (item_quantity+?) where item_id = ?");
           ps.setInt(1, qty);
           ps.setInt(2, id);
           
           ps.executeUpdate();
           
          
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(class_product.class.getName()).log(Level.SEVERE, null, ex);
          } 
           
   }
}
         