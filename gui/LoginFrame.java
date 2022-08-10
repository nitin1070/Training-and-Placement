

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import tnandpl.dao.UserDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.UserPojo;

/**
 *
 * @author Dell
 */
public class LoginFrame extends javax.swing.JFrame {
    
    private String userId;
    private String password;
   
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jp1.setSize(800, 500);
        jtxtUserId.setBackground(new java.awt.Color(0,0,0,1));
        jtxtPassword.setBackground(new java.awt.Color(0,0,0,1));
       
           
    }
    private boolean validateInputs(){
        userId=jtxtUserId.getText().trim();
        char []pwd=jtxtPassword.getPassword();
        if(userId.isEmpty()||pwd.length==0)
            return false;
            password=String.valueOf(pwd);
            return true;
        
    }
    private String validateUser(){
        if(jbtnAdmin.isSelected()){
            return "Admin";
        }
        else if(jbtnHr.isSelected()){
            return "Hr";
        }
        else if(jbtnStudent.isSelected()){
            return "Student";
                   
        }
        else 
            return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtxtIDlbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUserChoice = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtUserId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jbtnAdmin = new javax.swing.JRadioButton();
        jbtnHr = new javax.swing.JRadioButton();
        jbtnStudent = new javax.swing.JRadioButton();
        jbtnLogin = new javax.swing.JButton();
        jbtnSignup = new javax.swing.JButton();
        jlblLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jtxtIDlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        jLabel1.setText("Email or UserId :");
        jp1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 35));

        jtxtUserId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtUserId.setBorder(null);
        jtxtUserId.setOpaque(false);
        jtxtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserIdActionPerformed(evt);
            }
        });
        jp1.add(jtxtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 30));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        jLabel2.setText("Password :");
        jp1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 220, 35));

        jtxtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtPassword.setBorder(null);
        jtxtPassword.setOpaque(false);
        jp1.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Select User Type :-");
        jp1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 30));

        buttonGroup1.add(jbtnAdmin);
        jbtnAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnAdmin.setText("Admin");
        jbtnAdmin.setBorder(null);
        jp1.add(jbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 30));

        buttonGroup1.add(jbtnHr);
        jbtnHr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnHr.setText("Company Hr");
        jbtnHr.setBorder(null);
        jp1.add(jbtnHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        buttonGroup1.add(jbtnStudent);
        jbtnStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnStudent.setText("Student");
        jbtnStudent.setBorder(null);
        jp1.add(jbtnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 100, 30));

        jbtnLogin.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jp1.add(jbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 30));

        jbtnSignup.setBackground(java.awt.SystemColor.activeCaption);
        jbtnSignup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnSignup.setText("Signup");
        jbtnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignupActionPerformed(evt);
            }
        });
        jp1.add(jbtnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 150, 30));

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homelogo.jpg"))); // NOI18N
        jp1.add(jlblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 370, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jp1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jp1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 209, 250, 30));
        jp1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 360, -1));
        jp1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 10));
        jp1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 380, -1));

        jLabel10.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mylogo3.png"))); // NOI18N
        jLabel10.setOpaque(true);
        jp1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 80));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
       if(validateInputs()==false){
           JOptionPane.showMessageDialog(null,"Please fill all the fields","Message",JOptionPane.ERROR_MESSAGE);
           return;          
       } 
       String type=validateUser();
       if(type==null){
           JOptionPane.showMessageDialog(null,"Please select UserType","Message",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
      
           UserPojo user=new UserPojo();
           user.setUserid(userId.toUpperCase());
           user.setPassword(password);
          user.setType(type);
        try{
            boolean result=UserDao.validateUser(user);
            if(result){
                if(CurrentUser.getType().equals("Admin")){
                     JOptionPane.showMessageDialog(null,"Welcome Admin  "+CurrentUser.getName(),"Welcome",JOptionPane.INFORMATION_MESSAGE);
                    new AdminOptionsFrame().setVisible(result);
               
                this.dispose();
                }
                else if(CurrentUser.getType().equals("Hr")){
                     JOptionPane.showMessageDialog(null,"Welcome HR "+CurrentUser.getName(),"Welcome",JOptionPane.INFORMATION_MESSAGE);
                     new HrOptionsFrame().setVisible(true);
                     this.dispose();
                }
                else if(CurrentUser.getType().equals("Student")){
                   JOptionPane.showMessageDialog(null,"Welcome "+CurrentUser.getName(),"WELCOME",JOptionPane.INFORMATION_MESSAGE);
                   new StudentOptionsFrame().setVisible(true);
                   this.dispose();
                   
                }       
            }
                 else {
                     JOptionPane.showMessageDialog(null, "Invalid UserId or Password! or Type","Error",JOptionPane.ERROR_MESSAGE);
                     jtxtUserId.setText("");
                     jtxtPassword.setText("");
                     return;
                 }
                        
            }
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "DB Error ","Error",JOptionPane.ERROR_MESSAGE);
           jtxtUserId.setText("");
            jtxtPassword.setText("");
          ex.printStackTrace();
      }    
       
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jtxtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUserIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignupActionPerformed
        new SignupFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSignupActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton jbtnAdmin;
    private javax.swing.JRadioButton jbtnHr;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnSignup;
    private javax.swing.JRadioButton jbtnStudent;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JPanel jp1;
    private javax.swing.JLabel jtxtIDlbl;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUserId;
    private javax.swing.JLabel lblUserChoice;
    // End of variables declaration//GEN-END:variables
}
