/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tnandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tnandpl.dao.JobDao;
import tnandpl.dao.ResultDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.ParticipantJobPojo;

/**
 *
 * @author Dell
 */
public class StudentViewAllAppliedJobsFrame extends javax.swing.JFrame {

    private List<ParticipantJobPojo> allAppliedJobs;
    DefaultTableModel model;
    public StudentViewAllAppliedJobsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllAppliedJobs.getModel();
         loadAppliedJobs();
    }

   private  void loadAppliedJobs(){
        try{
             List<ParticipantJobPojo> allAppliedJobs=ResultDao.getAllAppliedJobs(CurrentUser.getId());
             for(ParticipantJobPojo job:allAppliedJobs){
                 Vector<String> row=new Vector<>();
                 row.add(job.getJobId());
                 row.add(job.getJobTitle());
                 row.add(job.getCompanyName());
                 row.add(job.getTags());
                 model.addRow(row);      
             }
             if(allAppliedJobs.isEmpty()){
                 JOptionPane.showMessageDialog(null,"No Jobs Available for Take a Test","Message",JOptionPane.INFORMATION_MESSAGE);
                 
             }
            
             
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR while load applied jobs!","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            ex.getMessage();
              
          }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllAppliedJobs = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnTakeQuiz = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 709, 120));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("WELCOME ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/job (2).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 200));

        tblAllAppliedJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", "CompanyName", "Skills Required"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllAppliedJobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 580, 190));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel5.setText("All Applied Jobs ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 840, 20));

        btnBack.setBackground(java.awt.SystemColor.activeCaption);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 120, 25));

        btnTakeQuiz.setBackground(java.awt.SystemColor.activeCaption);
        btnTakeQuiz.setText("Take Quiz");
        btnTakeQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeQuizActionPerformed(evt);
            }
        });
        jPanel1.add(btnTakeQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 200, 30));

        btnLogout.setBackground(java.awt.SystemColor.activeCaption);
        btnLogout.setText("Logout");
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            new StudentOptionsFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTakeQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeQuizActionPerformed
           int row=tblAllAppliedJobs.getSelectedRow();
           if(row==-1){
               JOptionPane.showMessageDialog(null, "Please Select Job For Take Quiz","Message",JOptionPane.INFORMATION_MESSAGE);
               return;
           }
           String jobId=tblAllAppliedJobs.getValueAt(row,0).toString().trim();
           String jobTitle=tblAllAppliedJobs.getValueAt(row,1).toString().trim();
           new StudentTakeQuizFrame(jobId,jobTitle).setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnTakeQuizActionPerformed

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
            java.util.logging.Logger.getLogger(StudentViewAllAppliedJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllAppliedJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllAppliedJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllAppliedJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewAllAppliedJobsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTakeQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllAppliedJobs;
    // End of variables declaration//GEN-END:variables

}
