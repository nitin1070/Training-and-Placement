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
import tnandpl.dao.UserDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.ParticipantPojo;

/**
 *
 * @author Dell
 */
public class StudentEditProfileFrame extends javax.swing.JFrame {

    private File file;
    private String oldpwd,newpwd,confirmpwd;
    public StudentEditProfileFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        ChangePasswordPanel.setVisible(false);
        ResumePanel.setVisible(false);
        loadData();
    }
    private void loadData(){
        try{
        ParticipantPojo pt=ParticipantDao.getParticipantById(CurrentUser.getId());
        txtName.setText(pt.getName());
        txtMail.setText(pt.getUserId().toLowerCase());
        txtPhone.setText(pt.getPhone());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error while loading Student DATA","Problem in DB",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
     private boolean validateInputs(){
         oldpwd=String.valueOf(txtPWD.getPassword());
         newpwd=String.valueOf(txtNewpwd.getPassword());
         confirmpwd=String.valueOf(txtConfirmpwd.getPassword());
         if(oldpwd.isEmpty()||newpwd.isEmpty()||confirmpwd.isEmpty())
         return  false;
         return true;
     }
     private boolean matchPassword(){
         if(newpwd.equals(confirmpwd))
             return true;
         return false;
     }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        changePwd = new javax.swing.JCheckBox();
        ChangePasswordPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPWD = new javax.swing.JPasswordField();
        lblCpwd = new javax.swing.JLabel();
        txtNewpwd = new javax.swing.JPasswordField();
        lblNpwd = new javax.swing.JLabel();
        txtConfirmpwd = new javax.swing.JPasswordField();
        lblConfirmpwd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        ChangeResume = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        btnDiscard = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        ResumePanel = new javax.swing.JPanel();
        txtResume = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 710, 130));

        jLabel2.setText(" Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, 20));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(173, 195, 234));
        txtName.setBorder(null);
        txtName.setOpaque(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 230, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 270, 40));

        txtMail.setEditable(false);
        txtMail.setBackground(new java.awt.Color(173, 195, 234));
        txtMail.setBorder(null);
        txtMail.setOpaque(false);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 230, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, 40));

        txtPhone.setEditable(false);
        txtPhone.setBackground(new java.awt.Color(173, 195, 234));
        txtPhone.setBorder(null);
        txtPhone.setOpaque(false);
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 230, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 260, 40));

        jLabel6.setText("User Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 140, 20));

        jLabel7.setText("Mobile No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, 40));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 130));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 20, 230));

        jLabel8.setText("Want to change Password ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 140, 20));

        changePwd.setText("Change Password");
        changePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePwdActionPerformed(evt);
            }
        });
        jPanel1.add(changePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 130, -1));

        ChangePasswordPanel.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        ChangePasswordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Current Password");
        ChangePasswordPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        txtPWD.setBackground(new java.awt.Color(173, 195, 234));
        txtPWD.setBorder(null);
        txtPWD.setOpaque(false);
        ChangePasswordPanel.add(txtPWD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, 20));

        lblCpwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        ChangePasswordPanel.add(lblCpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 40));

        txtNewpwd.setBackground(new java.awt.Color(173, 195, 234));
        txtNewpwd.setBorder(null);
        txtNewpwd.setOpaque(false);
        ChangePasswordPanel.add(txtNewpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 230, 20));

        lblNpwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        ChangePasswordPanel.add(lblNpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 40));

        txtConfirmpwd.setBackground(new java.awt.Color(173, 195, 234));
        txtConfirmpwd.setBorder(null);
        txtConfirmpwd.setOpaque(false);
        ChangePasswordPanel.add(txtConfirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 20));

        lblConfirmpwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        ChangePasswordPanel.add(lblConfirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, 40));

        jLabel10.setText("Enter New Password");
        ChangePasswordPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));

        jLabel11.setText("Confirm Password");
        ChangePasswordPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        jPanel1.add(ChangePasswordPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 460, 190));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 770, 10));

        jLabel12.setText("Want to change Resume ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, 20));

        ChangeResume.setText("Change Resume");
        ChangeResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeResumeActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 790, 10));

        btnDiscard.setText("Discard Changes");
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 160, -1));

        btnSaveChanges.setText("SaveChanges");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 150, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 120, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 120, -1));

        ResumePanel.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        ResumePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ResumePanel.add(txtResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, -1));

        jButton1.setText("Brows");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ResumePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 20));

        jPanel1.add(ResumePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 580, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void changePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePwdActionPerformed
         if(changePwd.isSelected()){
             ChangePasswordPanel.setVisible(true);
         }
         else{
             ChangePasswordPanel.setVisible(false);
         }
    }//GEN-LAST:event_changePwdActionPerformed

    private void ChangeResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeResumeActionPerformed
        if(ChangeResume.isSelected()){
            ResumePanel.setVisible(true);
        }
        else{
        ResumePanel.setVisible(false);
    }
    }//GEN-LAST:event_ChangeResumeActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        boolean changepwd=false,updateResume=false;
        if(changePwd.isSelected()){
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please fill all the fields","Message",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(matchPassword()==false){
             JOptionPane.showMessageDialog(null,"Password Miss Match !","Message",JOptionPane.ERROR_MESSAGE);
             return;
        }
        try{
            boolean res = UserDao.checkOldPassword(CurrentUser.getId(), oldpwd);
                    if(res==true){
                       UserDao.updateStudentPassword(CurrentUser.getId(),newpwd);
                       changepwd=true;
                    }
                    else{
                         JOptionPane.showMessageDialog(null,"Your old Password is wrong !","Message",JOptionPane.ERROR_MESSAGE);
                    }
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error while loading Student DATA","Problem in DB",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
        if(ChangeResume.isSelected()){
           if(txtResume.getText().trim()!=""){
                try{
                     ParticipantDao.updateResume(CurrentUser.getId(), file);
                     updateResume=true;     
                   
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error while loading Student DATA","Problem in DB",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
          catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Resume is invalid ","Problem in DB",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
           }
        }
        if(changepwd && updateResume){
            JOptionPane.showMessageDialog(null,"Password and Resume Change Successfully  ","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(changepwd){
            JOptionPane.showMessageDialog(null,"Password Change Successfully ","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(updateResume){
            JOptionPane.showMessageDialog(null,"Resume Updated  ","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Record Not Updated ! ","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser FileChooser=new JFileChooser();
        FileChooser.setDialogTitle("Select Your Resume");
        FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result =FileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            file=FileChooser.getSelectedFile();
            txtResume.setText(file.getName());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new StudentOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
           new LoginFrame().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
     int res= JOptionPane.showConfirmDialog(null,"ARE YOU SURE ?","QUIT",JOptionPane.YES_NO_OPTION);
      if(res==JOptionPane.YES_OPTION){
          new StudentOptionsFrame().setVisible(true);
          this.dispose();
      }else{
        this.setVisible(true);
    }
    }//GEN-LAST:event_btnDiscardActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEditProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JCheckBox ChangeResume;
    private javax.swing.JPanel ResumePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox changePwd;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lblCpwd;
    private javax.swing.JLabel lblNpwd;
    private javax.swing.JPasswordField txtConfirmpwd;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewpwd;
    private javax.swing.JPasswordField txtPWD;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtResume;
    // End of variables declaration//GEN-END:variables
}
