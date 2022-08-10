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
public class HrAddNewJobFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrAddNewJobFrame
     */
    public HrAddNewJobFrame() {
        initComponents();
          this.setLocationRelativeTo(null);
         lblName.setText(CurrentUser.getName());
         loadData();
    }
     private void loadData(){
         try{
         lblJobId.setText("Job-"+JobDao.getNewJobId());
         if(jtxtCompanyName.getText().trim().isEmpty())
         jtxtCompanyName.setText(HrDAO.getCompanyNameById(CurrentUser.getId()));
         }
           catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB ","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
     }
     private boolean validateInputs(){
   if(jtxtJobTitle.getText().isEmpty() || jtxtCompanyName.getText().isEmpty() || jtxtSkill1.getText().isEmpty()||jtxtSkill2.getText().isEmpty()||jtxtSkill3.getText().isEmpty()||jtxtSkill4.getText().isEmpty()){
       return false;
      
   }
    return true;
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtJobTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtCompanyName = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtxtSkill1 = new javax.swing.JTextField();
        jtxtSkill2 = new javax.swing.JTextField();
        jtxtSkill3 = new javax.swing.JTextField();
        jtxtSkill4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jbtnBack = new javax.swing.JButton();
        jbtnAddNewJob = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 790, 110));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("WELCOME ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 530, 10));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel3.setText("JOB ID :-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, 30));

        lblJobId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 220, 30));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel4.setText("Job Title ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 30));

        jtxtJobTitle.setBackground(new java.awt.Color(173, 192, 234));
        jtxtJobTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtJobTitle.setBorder(null);
        jtxtJobTitle.setOpaque(false);
        jPanel1.add(jtxtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, 40));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel6.setText("Company Name ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, 30));

        jtxtCompanyName.setEditable(false);
        jtxtCompanyName.setBackground(new java.awt.Color(173, 192, 234));
        jtxtCompanyName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtCompanyName.setBorder(null);
        jtxtCompanyName.setOpaque(false);
        jPanel1.add(jtxtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 230, 20));

        lblCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 260, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 530, 10));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel7.setText("Skills Required :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 30));

        jtxtSkill1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(jtxtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 175, 30));

        jtxtSkill2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(jtxtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 175, 30));

        jtxtSkill3.setBackground(java.awt.SystemColor.activeCaption);
        jtxtSkill3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSkill3ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 175, 30));

        jtxtSkill4.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.add(jtxtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 175, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JobPng_1.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 220, 230));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 850, 10));

        jbtnBack.setBackground(java.awt.SystemColor.activeCaption);
        jbtnBack.setText("BACK");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, 25));

        jbtnAddNewJob.setBackground(java.awt.SystemColor.activeCaption);
        jbtnAddNewJob.setText("ADD JOB");
        jbtnAddNewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddNewJobActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAddNewJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 220, 30));

        jbtnLogout.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogout.setText("LOGOUT");
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSkill3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSkill3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSkill3ActionPerformed

    private void jbtnAddNewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddNewJobActionPerformed
       if(validateInputs()==false){
           JOptionPane.showMessageDialog(null,"Please Fill All The Fields ","Message",JOptionPane.INFORMATION_MESSAGE);
           return;
                   }      
       JobsPojo job=new JobsPojo();
       job.setJobId(lblJobId.getText().trim());
       job.setJobTitle(jtxtJobTitle.getText().trim());
       job.setHrId(CurrentUser.getId());
       job.setTags(jtxtSkill1.getText().trim()+","+jtxtSkill2.getText().trim()+","+jtxtSkill3.getText().trim()+","+jtxtSkill4.getText().trim());
       job.setStatus(0);
       
       try{
           boolean result=JobDao.AddNewJob(job);
           if(result){
               JOptionPane.showMessageDialog(null,"JOB ADDED SUCCESSFULLY ","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
               clearText();
               loadData();
               
           }
           else{
               JOptionPane.showMessageDialog(null,"Could not add the JOB !","Message",JOptionPane.ERROR_MESSAGE);
           }
          
           
       }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB ","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }//GEN-LAST:event_jbtnAddNewJobActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
         new HrJobOptionsFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
       new LoginFrame().setVisible(true);
       this.dispose();

    }//GEN-LAST:event_jbtnLogoutActionPerformed
     private void clearText(){
         jtxtSkill1.setText("");
         jtxtSkill2.setText("");
         jtxtSkill3.setText("");
         jtxtSkill4.setText("");
         jtxtJobTitle.setText("");
     }
   
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
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrAddNewJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtnAddNewJob;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JTextField jtxtCompanyName;
    private javax.swing.JTextField jtxtJobTitle;
    private javax.swing.JTextField jtxtSkill1;
    private javax.swing.JTextField jtxtSkill2;
    private javax.swing.JTextField jtxtSkill3;
    private javax.swing.JTextField jtxtSkill4;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
