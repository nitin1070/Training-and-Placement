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
import tnandpl.dao.JobDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.JobsPojo;

/**
 *
 * @author Dell
 */
public class HrEditJobFrame extends javax.swing.JFrame {
 
   private JobsPojo job;
    public HrEditJobFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         lblName.setText(CurrentUser.getName());
    }
    public HrEditJobFrame(JobsPojo job){
        this();
        this.job=job;
        showJobDetails(); 
    }
   private void showJobDetails(){
      String CompanyName=" ";
      try{
          CompanyName=HrDAO.getCompanyNameById(job.getHrId());
          
      }
       catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR while load companyName !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              return;
          }
      lblJobId.setText(job.getJobId());
      jtxtTitle.setText(job.getJobTitle());
      jtxtCompanyName.setText(CompanyName);
      String allSkills[]=job.getTags().split(",");
      jtxtSkill1.setText(allSkills[0]);
      jtxtSkill2.setText(allSkills[1]);
      jtxtSkill3.setText(allSkills[2]);
      jtxtSkill4.setText(allSkills[3]);
   }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtxtSkill1 = new javax.swing.JTextField();
        jtxtSkill2 = new javax.swing.JTextField();
        jtxtSkill3 = new javax.swing.JTextField();
        jtxtSkill4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtxtCompanyName = new javax.swing.JTextField();
        getCompanyName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 720, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel3.setText("WELCOME ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 540, 10));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel4.setText("Job ID -");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 30));
        jPanel1.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 220, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel5.setText("Job Title ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 40));

        jtxtTitle.setBackground(new java.awt.Color(173, 195, 234));
        jtxtTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtTitle.setBorder(null);
        jtxtTitle.setOpaque(false);
        jPanel1.add(jtxtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 20));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 40));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel6.setText("Company Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 180, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 560, 10));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel7.setText("Skills Required ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 30));

        jtxtSkill1.setBackground(java.awt.SystemColor.activeCaption);
        jtxtSkill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSkill1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 25));

        jtxtSkill2.setBackground(java.awt.SystemColor.activeCaption);
        jtxtSkill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSkill2ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 200, 25));

        jtxtSkill3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(jtxtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 200, 25));

        jtxtSkill4.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(jtxtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 200, 25));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 550, 10));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 140, 30));

        btnSaveChanges.setBackground(java.awt.SystemColor.activeCaption);
        btnSaveChanges.setText("Sava Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 200, 30));

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 140, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JobPng_1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 180, 200));

        jtxtCompanyName.setEditable(false);
        jtxtCompanyName.setBackground(new java.awt.Color(173, 195, 234));
        jtxtCompanyName.setBorder(null);
        jtxtCompanyName.setOpaque(false);
        jPanel1.add(jtxtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 230, 20));

        getCompanyName.setBackground(new java.awt.Color(173, 195, 234));
        getCompanyName.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        getCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getCompanyName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(getCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSkill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSkill2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSkill2ActionPerformed
     private boolean validateFields(){
       if(jtxtTitle.getText().trim().isEmpty()||jtxtSkill1.getText().trim().isEmpty()||jtxtSkill2.getText().trim().isEmpty()
                                              ||jtxtSkill3.getText().trim().isEmpty()||jtxtSkill4.getText().trim().isEmpty())
           return false;
       return true;
   }
    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
           if(validateFields()==false){
               JOptionPane.showMessageDialog(null,"Please fill all the fields ","Message",JOptionPane.INFORMATION_MESSAGE);
               return;
           }
           job.setJobTitle(jtxtTitle.getText().trim());
           job.setTags(jtxtSkill1.getText().trim()+","+jtxtSkill2.getText().trim()+","+jtxtSkill3.getText().trim()+","+jtxtSkill4.getText().trim());
           job.setJobId(lblJobId.getText().trim());
          try{
              boolean result=JobDao.editJobByJobId(job);
              if(result){
                  JOptionPane.showMessageDialog(null,"Job Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
              }
              else
              JOptionPane.showMessageDialog(null,"Job NOT UPDATED","FAILD",JOptionPane.INFORMATION_MESSAGE);
          }
          
              
           catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR while EDIT THE JOB!","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              return;
          }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         new LoginFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new HrChooseJobForEditFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtSkill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSkill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSkill1ActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel getCompanyName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jtxtCompanyName;
    private javax.swing.JTextField jtxtSkill1;
    private javax.swing.JTextField jtxtSkill2;
    private javax.swing.JTextField jtxtSkill3;
    private javax.swing.JTextField jtxtSkill4;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
