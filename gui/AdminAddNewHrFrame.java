/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import tnandpl.gui.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tnandpl.dao.HrDAO;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.HrPojo;

/**
 *
 * @author Dell
 */
public class AdminAddNewHrFrame extends javax.swing.JFrame {

   private String Password;
   private String ConfnrmPassword;
    public AdminAddNewHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblName.setText(CurrentUser.getName());
        
        jtxtName.setBackground(new java.awt.Color(0,0,0,1));
        jtxtPassword.setBackground(new java.awt.Color(0,0,0,1));
        jtxtCompanyName.setBackground(new java.awt.Color(0,0,0,1));
        jlblHrid.setBackground(new java.awt.Color(0,0,0,1));
        jtxtMobile.setBackground(new java.awt.Color(0,0,0,1));
        jtxtMail.setBackground(new java.awt.Color(0,0,0,1));
        jtxtConfrmPassword.setBackground(new java.awt.Color(0,0,0,1));
        jlblName.setText(CurrentUser.getName());
        jlblName.setText(CurrentUser.getName());
        LoadId();
    }
    private void LoadId(){
        try{
            int hrid=HrDAO.getNewHrId();
            jlblHrid.setText("Hr-"+hrid);
            
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while generating HR ID","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
        
    }
     public boolean validProfession(){
       
     String str=String.valueOf(jComboProfession.getSelectedItem());
     if(str.equalsIgnoreCase("Choose Profession"))
     {
         
         return false;
     }
     return true;
   }

   public boolean validateInputs(){
       Password=String.valueOf(jtxtPassword.getPassword());
       ConfnrmPassword=String.valueOf(jtxtConfrmPassword.getPassword());
  if(jtxtName.getText().isEmpty()|| jtxtMail.getText().isEmpty()|| jtxtMobile.getText().isEmpty()||Password.isEmpty()||ConfnrmPassword.isEmpty()||jtxtCompanyName.getText().isEmpty()){
     return false; 
  }
 return true;
      }
   public boolean MatchPassword(){
       if(Password.equals(ConfnrmPassword))
           return true;
       return false;
   }
   public void clearAll(){
                jtxtMail.setText("");
                jtxtMobile.setText("");
                jtxtName.setText("");
                jtxtCompanyName.setText("");
                jtxtPassword.setText("");
                jtxtConfrmPassword.setText("");
                jComboProfession.setSelectedIndex(0);
                
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtCompanyName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jtxtMail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtMobile = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JPasswordField();
        jComboProfession = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jtxtConfrmPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jbtnBack = new javax.swing.JButton();
        jbtnAddHR = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();
        jlblHrid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jp1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 780, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mylogo3.png"))); // NOI18N
        jp1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addNewEmp.png"))); // NOI18N
        jp1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 273, -1, 153));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setText("WELCOME,");
        jp1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 107, 29));

        jlblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jp1.add(jlblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 248, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel5.setText("HR id :-");
        jp1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 50, 30));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel6.setText("Company Name");
        jp1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 120, 30));

        jtxtCompanyName.setBorder(null);
        jtxtCompanyName.setOpaque(false);
        jp1.add(jtxtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel7.setText("Name");
        jp1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, 30));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel8.setText("Email");
        jp1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 250, 30));

        jtxtName.setBorder(null);
        jtxtName.setOpaque(false);
        jp1.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 200, 30));

        jtxtMail.setBorder(null);
        jtxtMail.setOpaque(false);
        jp1.add(jtxtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 200, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel9.setText("Mobile no");
        jp1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 250, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel10.setText("Password");
        jp1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 250, 30));

        jtxtMobile.setBorder(null);
        jtxtMobile.setOpaque(false);
        jp1.add(jtxtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 200, 30));

        jtxtPassword.setBorder(null);
        jtxtPassword.setOpaque(false);
        jp1.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 200, 30));

        jComboProfession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Profession", "Web Development", "Flutter ", "React Development", "Digital Marketing", "Blockchain", "Artificial Intelligence", "Cyber Security", "Software Development", "Database Management", " " }));
        jp1.add(jComboProfession, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 220, 20));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel11.setText("Confirm Password");
        jp1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 240, 30));

        jtxtConfrmPassword.setBorder(null);
        jtxtConfrmPassword.setOpaque(false);
        jp1.add(jtxtConfrmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 200, 30));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel12.setText("Profession in");
        jp1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 250, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jp1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 240, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jp1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 260, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jp1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 250, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jp1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 260, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phnNoBtnPic.png"))); // NOI18N
        jp1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 250, 30));
        jp1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 160, -1));
        jp1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 200, 10));
        jp1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 600, 10));
        jp1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 820, 20));

        jbtnBack.setBackground(java.awt.SystemColor.activeCaption);
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jp1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 120, 25));

        jbtnAddHR.setBackground(java.awt.SystemColor.activeCaption);
        jbtnAddHR.setText("Add New HR");
        jbtnAddHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddHRActionPerformed(evt);
            }
        });
        jp1.add(jbtnAddHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 210, 25));

        jbtnLogout.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogout.setText("Logut");
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        jp1.add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 120, 25));
        jp1.add(jlblHrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
     new AdminHrModuleFrame().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
       new LoginFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

    private void jbtnAddHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHRActionPerformed
         if(validateInputs()==false){
             JOptionPane.showMessageDialog(null,"Please Fill All The Fields!","Error",JOptionPane.ERROR_MESSAGE);
             return;
         }
         if(MatchPassword()==false){
             JOptionPane.showMessageDialog(null,"Confirm Password do not match !","Error",JOptionPane.ERROR_MESSAGE);
             jtxtPassword.setText("");
             jtxtConfrmPassword.setText("");
             return;
         }
        if(validProfession()==false){
            
            JOptionPane.showMessageDialog(null,"Please Select an Valid Profession","Message",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         
         try{
             HrPojo hr=new HrPojo();
            hr.setHrName(jtxtName.getText().trim());
            hr.setHrId(jlblHrid.getText().trim());
            hr.setMobile(jtxtMobile.getText().trim());
            hr.setPassword(Password.trim());
            hr.setProfession(jComboProfession.getSelectedItem().toString());
            hr.setCompanyName(jtxtCompanyName.getText().trim());
            hr.setUsserId(jtxtMail.getText().trim());
            hr.setType("Hr");
            int result=HrDAO.AddNewHr(hr);
            if(result==-1){
                JOptionPane.showMessageDialog(null,"This Email id is Alreay Registered","Message",JOptionPane.INFORMATION_MESSAGE);
                jtxtMail.setText("");
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Record Added","Success",JOptionPane.INFORMATION_MESSAGE);
               clearAll();
                try{
            int hrid=HrDAO.getNewHrId();
            jlblHrid.setText("Hr-"+hrid);
            
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while generating HR ID","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
        
                
                
            }
            else if(result==0){
                JOptionPane.showMessageDialog(null,"Record Not Added ","Error!",JOptionPane.ERROR_MESSAGE);
               clearAll();
            
              
            }
         }
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"DB Error while insert the Record !","ERROR",JOptionPane.ERROR_MESSAGE);
               jtxtMail.setText("");
                jtxtMobile.setText("");
                jtxtName.setText("");
                jtxtCompanyName.setText("");
                jtxtPassword.setText("");
                jtxtConfrmPassword.setText("");
             ex.printStackTrace();
                     }
    }//GEN-LAST:event_jbtnAddHRActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboProfession;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtnAddHR;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JLabel jlblHrid;
    private javax.swing.JLabel jlblName;
    private javax.swing.JPanel jp1;
    private javax.swing.JTextField jtxtCompanyName;
    private javax.swing.JPasswordField jtxtConfrmPassword;
    private javax.swing.JTextField jtxtMail;
    private javax.swing.JTextField jtxtMobile;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JPasswordField jtxtPassword;
    // End of variables declaration//GEN-END:variables
}
