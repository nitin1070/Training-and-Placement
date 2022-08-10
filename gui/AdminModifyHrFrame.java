/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import tnandpl.gui.*;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import tnandpl.dao.HrDAO;
import tnandpl.dao.UserDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.HrPojo;

/**
 *
 * @author Dell
 */
public class AdminModifyHrFrame extends javax.swing.JFrame {
   private String password;
   private String repeatpassword;
   Map<String,HrPojo> allHrList;
    public AdminModifyHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
        loadHrDetails();
      
    }
public boolean MatchPassword(){
       if(Password.equals(ConfrmPassword))
           return true;
       return false;
   }
private boolean validateInputs(){
    char []pwd=Password.getPassword();
    char[]repeatpwd=ConfrmPassword.getPassword();
    if(pwd.length<4||repeatpwd.length<4){
        JOptionPane.showMessageDialog(null,"Password must be atleast 4 char");
    }
     password=String.valueOf(pwd);
     repeatpassword=String.valueOf(repeatpwd);
    if(password.equals(repeatpassword)==false){
     JOptionPane.showMessageDialog(null,"Password not matching!" );
     return false;
    }
    return true;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcAllHrList = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtxtHrid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ConfrmPassword = new javax.swing.JPasswordField();
        Password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblHrName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnBack = new javax.swing.JButton();
        jbtnModifyHr = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 760, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mylogo3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify-emp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 150));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel5.setText("      HR UserId ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, 30));

        jcAllHrList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAllHrListActionPerformed(evt);
            }
        });
        jPanel1.add(jcAllHrList, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, -1));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel6.setText("     HR Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 120, 30));

        jtxtHrid.setBackground(new java.awt.Color(173, 192, 234));
        jtxtHrid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtHrid.setBorder(null);
        jtxtHrid.setOpaque(false);
        jPanel1.add(jtxtHrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 190, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 220, 40));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel8.setText("      HR Name ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 110, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 250, 10));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel9.setText("        Password ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 200, 30));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel11.setText("Confirm Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 230, 30));

        ConfrmPassword.setBackground(new java.awt.Color(173, 192, 234));
        ConfrmPassword.setBorder(null);
        ConfrmPassword.setOpaque(false);
        jPanel1.add(ConfrmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 230, 20));

        Password.setBackground(new java.awt.Color(173, 192, 234));
        Password.setBorder(null);
        Password.setOpaque(false);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 230, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 250, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 260, 40));

        jlblHrName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jlblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 190, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 442, 830, 10));

        jbtnBack.setBackground(java.awt.SystemColor.activeCaption);
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, 25));

        jbtnModifyHr.setBackground(java.awt.SystemColor.activeCaption);
        jbtnModifyHr.setText("Modigy HR Details");
        jbtnModifyHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModifyHrActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnModifyHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 493, 200, 30));

        jbtnLogout.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogout.setText("Logout");
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAllHrListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAllHrListActionPerformed
      String userId=(String)jcAllHrList.getSelectedItem();
      HrPojo hr=allHrList.get(userId);
      jtxtHrid.setText(hr.getHrId());
      jlblHrName.setText(hr.getHrName());
    }//GEN-LAST:event_jcAllHrListActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
      new AdminHrModuleFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
       new LoginFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

    private void jbtnModifyHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModifyHrActionPerformed
              if(!validateInputs()){
                  return;
              }
              try{
                  boolean result=UserDao.updatePassword(jcAllHrList.getSelectedItem().toString(), password);
                  if(result){
                     JOptionPane.showMessageDialog(null,"Password Change Successfully ","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Sorry Could not change the password now","Problem",JOptionPane.ERROR_MESSAGE);
                  }
                  clearText();
              }
              
               catch(SQLException ex){
                            JOptionPane.showMessageDialog(null, "Error in DB","Error",JOptionPane.ERROR_MESSAGE);
                            ex.printStackTrace();
        }
              
              
    }//GEN-LAST:event_jbtnModifyHrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModifyHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfrmPassword;
    private javax.swing.JPasswordField Password;
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
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnModifyHr;
    private javax.swing.JComboBox<String> jcAllHrList;
    private javax.swing.JLabel jlblHrName;
    private javax.swing.JTextField jtxtHrid;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    private void loadHrDetails() {
        try{
    
       allHrList=UserDao.getAllHrList();
       Set <String> keys=allHrList.keySet();
       for(String userid:keys){
          jcAllHrList.addItem(userid);
       }
           
       }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while Add item in all Hr tables","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        
    }
    }
   private void clearText(){
       jtxtHrid.setText("");
       jlblHrName.setText("");
       jcAllHrList.setSelectedIndex(0);
       Password.setText("");
       ConfrmPassword.setText("");
   }
}
