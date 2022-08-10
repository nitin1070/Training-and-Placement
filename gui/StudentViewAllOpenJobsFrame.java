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
import tnandpl.pojo.JobsPojo;
import tnandpl.pojo.ParticipantJobPojo;
import tnandpl.pojo.ResultPojo;

/**
 *
 * @author Dell
 */
public class StudentViewAllOpenJobsFrame extends javax.swing.JFrame {
    JobsPojo job;
    private List<ParticipantJobPojo> AllOpenJobs;
    DefaultTableModel model;
    public StudentViewAllOpenJobsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         lblName.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllOpenJobs.getModel();
         loadAllOpenJobs();
    }

    private  void loadAllOpenJobs(){
        try{
             List<ParticipantJobPojo> allOpenjobList=JobDao.ShowAllOpenJobsForStudents();
             for(ParticipantJobPojo job:allOpenjobList){
                 Vector<String> row=new Vector<>();
                 row.add(job.getJobId());
                 row.add(job.getJobTitle());
                 row.add(job.getCompanyName());
                 row.add(job.getTags());
              
                 model.addRow(row);      
             }
             if(allOpenjobList.isEmpty()){
                 JOptionPane.showMessageDialog(null,"No Jobs Available","Message",JOptionPane.INFORMATION_MESSAGE);
                 
             }
            
             
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR in loadjobs!","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
    
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
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnApplyJob = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllOpenJobs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 680, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, 30));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New/viewAllJob (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 120));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel5.setText("All Jobs :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 820, 10));

        btnBack.setBackground(java.awt.SystemColor.activeCaption);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 120, 25));

        btnApplyJob.setBackground(java.awt.SystemColor.activeCaption);
        btnApplyJob.setText("Apply ");
        btnApplyJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnApplyJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 210, 30));

        btnLogout.setBackground(java.awt.SystemColor.activeCaption);
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 120, 25));

        tblAllOpenJobs.setBackground(new java.awt.Color(173, 195, 234));
        tblAllOpenJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", "Company Name", "Skills Required"
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
        tblAllOpenJobs.setFillsViewportHeight(true);
        tblAllOpenJobs.setOpaque(false);
        tblAllOpenJobs.setRequestFocusEnabled(false);
        tblAllOpenJobs.setRowHeight(20);
        tblAllOpenJobs.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblAllOpenJobs.setSelectionForeground(new java.awt.Color(0, 204, 102));
        jScrollPane2.setViewportView(tblAllOpenJobs);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 590, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            new StudentOptionsFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
          new LoginFrame().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnApplyJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyJobActionPerformed
         int row=tblAllOpenJobs.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null,"Please select an row first","Message",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       ResultPojo result=new ResultPojo();
       result.setPid(CurrentUser.getId());
       result.setPercentge(-1.0);
       result.setJobid(tblAllOpenJobs.getValueAt(row,0).toString().trim());
       result.setSelectedbyHr("NO");
      String title= tblAllOpenJobs.getValueAt(row,1).toString().trim();
          try{
              boolean response=ResultDao.ApplyForJob(result);
              if(response){
              JOptionPane.showMessageDialog(null,"You Have Applied FOR "+title,"Congratulations",JOptionPane.INFORMATION_MESSAGE); 
              return;
              }   
        
          JOptionPane.showMessageDialog(null,"You have Already  Applied for this Job ! ","Message",JOptionPane.INFORMATION_MESSAGE);
      }
       catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
    }//GEN-LAST:event_btnApplyJobActionPerformed

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
            java.util.logging.Logger.getLogger(StudentViewAllOpenJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllOpenJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllOpenJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewAllOpenJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewAllOpenJobsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllOpenJobs;
    // End of variables declaration//GEN-END:variables
}
