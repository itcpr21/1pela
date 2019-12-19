import java.awt.Component;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class message_me {
     public void message(Component component,String message,String icon){int x=0;
        switch(icon){
            case "Information": x=1; break;
            case "Warning": x=2; break;
            case "Error": x=0;break;
            case "Plain": x=-1;break;
            default: x=1;break;
        
    }
    
        JOptionPane.showMessageDialog(component, message,"message",x);
    }
    
}


