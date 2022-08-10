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
import tnandpl.dao.ResultDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.StudentTestResultPojo;

/**
 *
 * @author Dell
 */
public class HrViewTestResultFrame extends javax.swing.JFrame {

   private List<StudentTestResultPojo> AllStudentsList;
    DefaultTableModel model;
    public HrViewTestResultFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         lblAdminName2.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllOpenJobs.getModel();
         allStudentsTestResult();
    }
     private void allStudentsTestResult(){
           try{
       AllStudentsList=ResultDao.getAllTestResult();
       for(StudentTestResultPojo student:AllStudentsList){
           Vector<String> row=new Vector<>();
           row.add(student.getName());
           row.add(student.getUserid());
           row.add(student.getPid());
           row.add(student.getJobid());
           row.add(String.valueOf(student.getPercentge()));
           
           model.addRow(row);
       }
       if(AllStudentsList.isEmpty()){
                 JOptionPane.showMessageDialog(null,"The Test is not given by any Students","Message",JOptionPane.INFORMATION_MESSAGE);
                 
             }
            
             
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR in Test Result Frame!","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblAdminName2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnBack2 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllOpenJobs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jobParticipant (2).png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 510, 150));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        jLabel21.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel21.setText("WELCOME ,");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        lblAdminName2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel5.add(lblAdminName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 30));

        jLabel22.setFont(new java.awt.Font("Noteworthy", 0, 14)); // NOI18N
        jLabel22.setText("All Students Test Result :-");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 100, 30));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 770, 10));

        btnBack2.setBackground(java.awt.SystemColor.activeCaption);
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 25));

        btnLogout.setBackground(java.awt.SystemColor.activeCaption);
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel5.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 120, 25));

        tblAllOpenJobs.setBackground(new java.awt.Color(173, 195, 234));
        tblAllOpenJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "UserID", "ID", "Job ID", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 700, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        new HrOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack2ActionPerformed

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
            java.util.logging.Logger.getLogger(HrViewTestResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrViewTestResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrViewTestResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrViewTestResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrViewTestResultFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblAdminName2;
    private javax.swing.JTable tblAllOpenJobs;
    // End of variables declaration//GEN-END:variables
}
