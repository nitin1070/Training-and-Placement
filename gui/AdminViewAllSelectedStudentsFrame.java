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
import tnandpl.dao.ParticipantDao;
import tnandpl.pojo.AllSelectedStudentsPojo;
import tnandpl.pojo.CurrentUser;

/**
 *
 * @author Dell
 */
public class AdminViewAllSelectedStudentsFrame extends javax.swing.JFrame {

    private List<AllSelectedStudentsPojo> AllStudentsList;
    DefaultTableModel model;
    public AdminViewAllSelectedStudentsFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
         lblAdminName.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllJobs.getModel();
         getAllSelectedStudents();
    }

    private void getAllSelectedStudents(){
         try{
       AllStudentsList=ParticipantDao.getAllSelectedStudents();
       for(AllSelectedStudentsPojo student:AllStudentsList){
           Vector<String> row=new Vector<String>();
           row.add(student.getName());
           row.add(student.getUserId());
           row.add(student.getpId());
           row.add(student.getJobid());
           row.add(student.getJobtitle());
           row.add(student.getComapnyname());
           model.addRow(row);
       }
       if(AllStudentsList.isEmpty()){
                 JOptionPane.showMessageDialog(null,"No Students Available ","Message",JOptionPane.INFORMATION_MESSAGE);
                 
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

        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jobParticipant (2).png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 510, 150));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        jLabel13.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel13.setText("WELCOME ,");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        lblAdminName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel3.add(lblAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 30));

        jLabel15.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel15.setText("All Jobs :-");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 100, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 810, 10));

        btnBack.setBackground(java.awt.SystemColor.activeCaption);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 25));

        btnLogout.setBackground(java.awt.SystemColor.activeCaption);
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 120, 25));

        tblAllJobs.setBackground(new java.awt.Color(173, 195, 234));
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "UserID", "ID", "Job ID", "Job Title", "Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllJobs.setFillsViewportHeight(true);
        tblAllJobs.setOpaque(false);
        tblAllJobs.setRequestFocusEnabled(false);
        tblAllJobs.setRowHeight(20);
        tblAllJobs.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblAllJobs.setSelectionForeground(new java.awt.Color(0, 204, 102));
        jScrollPane2.setViewportView(tblAllJobs);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 790, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewAllSelectedStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllSelectedStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllSelectedStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewAllSelectedStudentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewAllSelectedStudentsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}
