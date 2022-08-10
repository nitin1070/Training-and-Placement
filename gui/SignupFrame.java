/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import tnandpl.dao.ParticipantDao;
import tnandpl.pojo.ParticipantPojo;

/**
 *
 * @author Dell
 */
public class SignupFrame extends javax.swing.JFrame {

     File File;
     private String password;
     private String confirmpassword;
    public SignupFrame() {
        initComponents();
       this.setLocationRelativeTo(null);
       LoadId();
    }
    private void LoadId(){
        try{
            int pid=ParticipantDao.getNewParticipantId();
            lblpId.setText("P-"+pid);
            
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while generation PID","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }
    private boolean MatchPassword(){
        if(txtPassword.getText().trim().equals(txtConfirmpwd.getText().trim())){
            return true;
        }
        return false;
    }
    public boolean validateInput(){
        password=String.valueOf(txtPassword.getPassword());
        confirmpassword=String.valueOf(txtConfirmpwd.getPassword());
        
        if(txtName.getText().trim().isEmpty()||txtMail.getText().trim().isEmpty()
                  ||txtSkill1.getText().trim().isEmpty()
                  ||txtSkill2.getText().trim().isEmpty()
                  ||txtSkill3.getText().trim().isEmpty()
                  ||txtSkill4.getText().trim().isEmpty()
                  ||password.isEmpty()
                  ||confirmpassword.isEmpty()){   
            return false;
    }
        return true;
}
    public void clearAllText(){
        txtName.setText("");
        txtMail.setText("");
        txtPhone.setText("");
        txtResume.setText("");
        txtQualification.setText("");
        txtSkill1.setText("");
        txtSkill2.setText("");
        txtSkill3.setText("");
        txtSkill4.setText("");
        txtPassword.setText("");
        txtConfirmpwd.setText("");
       
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblpId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtResume = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBrowsFile = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtSkill1 = new javax.swing.JTextField();
        txtSkill2 = new javax.swing.JTextField();
        txtSkill3 = new javax.swing.JTextField();
        txtSkill4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtConfirmpwd = new javax.swing.JPasswordField();
        lblConfirmpwd = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 700, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 30));

        jLabel3.setText("Participant ID :-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 10));
        jPanel1.add(lblpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, 30));

        jLabel4.setText("Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 30));

        txtName.setBackground(new java.awt.Color(173, 195, 234));
        txtName.setBorder(null);
        txtName.setOpaque(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 40));

        jLabel6.setText("Email ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 170, 20));

        txtMail.setBackground(new java.awt.Color(173, 195, 234));
        txtMail.setBorder(null);
        txtMail.setOpaque(false);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 230, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 260, 40));

        jLabel8.setText("Mobile No.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 20));

        txtPhone.setBackground(new java.awt.Color(173, 195, 234));
        txtPhone.setBorder(null);
        txtPhone.setOpaque(false);
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 40));

        jLabel10.setText("Upload Resume");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, 20));

        txtResume.setBackground(new java.awt.Color(173, 195, 234));
        txtResume.setBorder(null);
        txtResume.setOpaque(false);
        jPanel1.add(txtResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 230, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 260, 40));

        btnBrowsFile.setBackground(java.awt.SystemColor.activeCaption);
        btnBrowsFile.setText("Browse File");
        btnBrowsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnBrowsFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 110, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 750, 10));

        jLabel12.setText("Skills");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 20));

        txtSkill1.setBackground(java.awt.SystemColor.activeCaption);
        txtSkill1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 25));

        txtSkill2.setBackground(java.awt.SystemColor.activeCaption);
        txtSkill2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 150, 25));

        txtSkill3.setBackground(java.awt.SystemColor.activeCaption);
        txtSkill3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 150, 25));

        txtSkill4.setBackground(java.awt.SystemColor.activeCaption);
        txtSkill4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSkill4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkill4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 150, 25));

        jLabel13.setText("Qualifications ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 30));

        txtQualification.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 380, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 770, -1));

        jLabel14.setText("Password ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 90, 20));

        txtPassword.setBackground(new java.awt.Color(173, 195, 234));
        txtPassword.setBorder(null);
        txtPassword.setOpaque(false);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 230, 20));

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 260, 40));

        jLabel16.setText("Confirm Password");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 110, 20));

        txtConfirmpwd.setBackground(new java.awt.Color(173, 195, 234));
        txtConfirmpwd.setBorder(null);
        txtConfirmpwd.setOpaque(false);
        jPanel1.add(txtConfirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 230, 20));

        lblConfirmpwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(lblConfirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 250, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 790, 10));

        btnLogin.setBackground(java.awt.SystemColor.activeCaption);
        btnLogin.setText("Login ");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 120, 25));

        btnCreateAccount.setBackground(java.awt.SystemColor.activeCaption);
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSkill4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkill4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkill4ActionPerformed

    private void btnBrowsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsFileActionPerformed
        JFileChooser FileChooser=new JFileChooser();
        FileChooser.setDialogTitle("Select Your Resume");
        FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result =FileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File=FileChooser.getSelectedFile();
            txtResume.setText(File.getName());
        }
        
    }//GEN-LAST:event_btnBrowsFileActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
           if(validateInput()==false){
               JOptionPane.showMessageDialog(null,"Please Fill All The Fields","Message",JOptionPane.WARNING_MESSAGE);
               return;
           }
          if(MatchPassword()==false){
              JOptionPane.showMessageDialog(null,"Password is Not Match With Confirm Password !","Try Again ?",JOptionPane.INFORMATION_MESSAGE);  
              return;
          }
         try{
             ParticipantPojo pt=new ParticipantPojo();
             pt.setpId(lblpId.getText().trim());
             pt.setName(txtName.getText().trim());
             pt.setUserId(txtMail.getText().toUpperCase().trim());
             pt.setPhone(txtPhone.getText().trim());
             pt.setPassword(password);
             pt.setResume(File);
             pt.setSkills(txtSkill1.getText().trim()+","+txtSkill2.getText().trim()+","+txtSkill3.getText().trim()+","+txtSkill4.getText().trim());
             pt.setQualification(txtQualification.getText().trim());
             pt.setType("Student");             
   
         int result=ParticipantDao.addNewParticipant(pt);
         if(result==-1){
             JOptionPane.showMessageDialog(null,"Email Id is Already Registered","Message",JOptionPane.WARNING_MESSAGE);
             txtMail.setText(" ");
         }
         else if(result==1){
             JOptionPane.showMessageDialog(null,"Account Registered Successfully","Successs",JOptionPane.INFORMATION_MESSAGE);
             LoadId();
             clearAllText();
                 
    }
         
         else if(result==0){
             JOptionPane.showMessageDialog(null,"Could Not Registered Account Now !","Problem",JOptionPane.INFORMATION_MESSAGE);
         }
         }
          catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while P-ID","Error",JOptionPane.ERROR_MESSAGE);
           clearAllText();
           ex.printStackTrace();
        }
         catch(FileNotFoundException f){
           JOptionPane.showMessageDialog(null, "Error in DB","Error",JOptionPane.ERROR_MESSAGE);
           clearAllText();
           f.printStackTrace();
         }   
    }//GEN-LAST:event_btnCreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowsFile;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblConfirmpwd;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblpId;
    private javax.swing.JPasswordField txtConfirmpwd;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtResume;
    private javax.swing.JTextField txtSkill1;
    private javax.swing.JTextField txtSkill2;
    private javax.swing.JTextField txtSkill3;
    private javax.swing.JTextField txtSkill4;
    // End of variables declaration//GEN-END:variables
}
