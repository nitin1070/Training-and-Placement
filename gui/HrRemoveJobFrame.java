/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import tnandpl.gui.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tnandpl.dao.JobDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.JobsPojo;

/**
 *
 * @author Dell
 */
public class HrRemoveJobFrame extends javax.swing.JFrame {

   DefaultTableModel model;
    public HrRemoveJobFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
         lblName.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllHrJobs.getModel();
         loadHrJobs();
    }
      private void loadHrJobs(){
          try{
              List<JobsPojo> allHrJobs=JobDao.getAllJobByCurrentHr(CurrentUser.getId());
              for(JobsPojo job:allHrJobs){
                  Vector<String> row=new Vector<>();
                  row.add(job.getJobId());
                  row.add(job.getJobTitle());
                  row.add(job.getTags());
                  row.add(String.valueOf(job.getStatus()));
                  model.addRow(row);
              }
              if(allHrJobs.isEmpty()){
                  JOptionPane.showMessageDialog(null,"NO Jobs Present !","Message",JOptionPane.INFORMATION_MESSAGE);
              }
              
      }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
              
          }
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllHrJobs = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnBack = new javax.swing.JButton();
        jbtnRemoveJob = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 770, 120));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        lblName.setText("WELCOME ,");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New/removeJob (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 170));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel4.setText("All JOBS :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 130, 30));

        tblAllHrJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JOB ID", "JOB TITLE", "SKILLS", "STATUS"
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
        jScrollPane1.setViewportView(tblAllHrJobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 570, 200));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 850, 10));

        jbtnBack.setBackground(java.awt.SystemColor.activeCaption);
        jbtnBack.setText("BACK");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 120, 25));

        jbtnRemoveJob.setBackground(java.awt.SystemColor.activeCaption);
        jbtnRemoveJob.setText("REMOVE JOB");
        jbtnRemoveJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveJobActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRemoveJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 210, 30));

        jbtnLogout.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogout.setText("LOGOUT");
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 120, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
       new HrJobOptionsFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
         new LoginFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

    private void jbtnRemoveJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveJobActionPerformed
       int row=tblAllHrJobs.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null,"Please select an row first","Message",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       String jobId=(String)tblAllHrJobs.getValueAt(row,0);
      int resp= JOptionPane.showConfirmDialog(null,"Are You Sure ? to Delete "+jobId+"?","Delete",JOptionPane.OK_CANCEL_OPTION);
      if(resp==JOptionPane.OK_OPTION)
          try{
              boolean result=JobDao.removeJobByJobId(jobId);
              if(result){
                  model.removeRow(row);
              JOptionPane.showMessageDialog(null,"JOB Deleted ","Success",JOptionPane.INFORMATION_MESSAGE);
              
              if(tblAllHrJobs.getRowCount()==0){
                jbtnRemoveJob.setEnabled(false);
              }   
              return;
          }
          JOptionPane.showMessageDialog(null,"JOB Not  Deleted ","Message",JOptionPane.INFORMATION_MESSAGE);
      }
       catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
              
          }
    }//GEN-LAST:event_jbtnRemoveJobActionPerformed

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
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrRemoveJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnRemoveJob;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllHrJobs;
    // End of variables declaration//GEN-END:variables
}
