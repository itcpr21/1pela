import java.awt.Color;
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
public class register extends javax.swing.JFrame {
reg_class user = new reg_class();
    /**
     * Creates new form register
     */
    public register() {
        initComponents();this.setLocationRelativeTo(null);
    }
public void clearReg(){
        fnfld.setText("");
        lnfd.setText("");
        unfd.setText("");
        pwpwfld.setText("");
        cpwfld.setText("");
    }

public void getPass(){
   String passw = new String (pwpwfld.getPassword());
   String cpassw = new String (cpwfld.getPassword());
   
if(passw.equals(cpassw)){
    resultlbl.setText("Password required Matched"); resultlbl.setForeground(Color.gray);
}   else{
    resultlbl.setText("Password required not Matched!"); resultlbl.setForeground(Color.orange);
}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        unfld = new javax.swing.JTextField();
        lnfld = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fnfld = new javax.swing.JTextField();
        pwpwfld = new javax.swing.JPasswordField();
        cpwfld = new javax.swing.JPasswordField();
        cancelbtn = new javax.swing.JButton();
        enterbtn = new javax.swing.JButton();
        lnfd = new javax.swing.JTextField();
        unfd = new javax.swing.JTextField();
        resultlbl = new javax.swing.JLabel();

        jLabel8.setText("REGISTER");

        unfld.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N

        lnfld.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        lnfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnfldActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel7.setText("REGISTER");

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel9.setText("              First Name:");

        jLabel10.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel10.setText("              Last Name:");

        jLabel11.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel11.setText("                Username:");

        jLabel12.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel12.setText("                Password:");

        jLabel13.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        jLabel13.setText("Confirm Password:");

        fnfld.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        fnfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnfldActionPerformed(evt);
            }
        });

        pwpwfld.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        pwpwfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwpwfldActionPerformed(evt);
            }
        });
        pwpwfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwpwfldKeyReleased(evt);
            }
        });

        cpwfld.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        cpwfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpwfldKeyReleased(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        enterbtn.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        enterbtn.setText("ENTER");
        enterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbtnActionPerformed(evt);
            }
        });

        lnfd.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        lnfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnfdActionPerformed(evt);
            }
        });

        unfd.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        unfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unfd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpwfld)
                            .addComponent(pwpwfld)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnfld)
                            .addComponent(lnfd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 270, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(resultlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(enterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwpwfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpwfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(resultlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnfldActionPerformed

    private void enterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterbtnActionPerformed
   String fn = fnfld.getText();
   String ln = lnfd.getText();
   String un = unfd.getText();
   String passw = new String (pwpwfld.getPassword());
   String cpassw = new String (cpwfld.getPassword());
   
   if(fn.equals("")||ln.equals("")||un.equals("")||passw.equals("")||cpassw.equals("")){
    JOptionPane.showMessageDialog(rootPane, "Don't leave a blank field!","message",JOptionPane.WARNING_MESSAGE);   
   }else{
   if(passw.equals(cpassw)){
    int x = user.reg(fn, ln, un, cpassw);  
    
    if(x==0){
      JOptionPane.showMessageDialog(rootPane, "Cannot connect to the Database!","message",JOptionPane.WARNING_MESSAGE);
    }
    else if(x==-1){
      JOptionPane.showMessageDialog(rootPane, "Username already exists!","message",JOptionPane.WARNING_MESSAGE); 
    }
    else{
       JOptionPane.showMessageDialog(rootPane, "Succesfully Registered!"); new login().setVisible(true); this.setVisible(false);clearReg();
    }
   }else{
     JOptionPane.showMessageDialog(rootPane, "Password required aren't matched!","message",JOptionPane.WARNING_MESSAGE); 
   }
   }
  
   
             
    }//GEN-LAST:event_enterbtnActionPerformed

    private void lnfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnfldActionPerformed

    private void lnfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnfdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnfdActionPerformed

    private void unfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unfdActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
clearReg();  this.setVisible(false); new login().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void pwpwfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwpwfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwpwfldActionPerformed

    private void pwpwfldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwpwfldKeyReleased
        // TODO add your handling code here:
        getPass();
    }//GEN-LAST:event_pwpwfldKeyReleased

    private void cpwfldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpwfldKeyReleased
        // TODO add your handling code here:
        getPass();
    }//GEN-LAST:event_cpwfldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JPasswordField cpwfld;
    private javax.swing.JButton enterbtn;
    private javax.swing.JTextField fnfld;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lnfd;
    private javax.swing.JTextField lnfld;
    private javax.swing.JPasswordField pwpwfld;
    private javax.swing.JLabel resultlbl;
    private javax.swing.JTextField unfd;
    private javax.swing.JTextField unfld;
    // End of variables declaration//GEN-END:variables

}
