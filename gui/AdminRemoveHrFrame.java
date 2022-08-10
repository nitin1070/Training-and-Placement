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
import tnandpl.dao.HrDAO;
import tnandpl.dao.UserDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.HrPojo;

/**
 *
 * @author Dell
 */
public class AdminRemoveHrFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    public AdminRemoveHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
        model=(DefaultTableModel)jtblAllHr.getModel();
        LoadHrDetails();
    }

    private void LoadHrDetails(){
         try{
            List<HrPojo> allHrList=HrDAO.getAllHr();
            for(HrPojo hr:allHrList){
                Vector<String> row=new Vector<>();
                row.add(hr.getHrId());
                row.add(hr.getUsserId());
                row.add(hr.getHrName());
                row.add(hr.getMobile());
                row.add(hr.getCompanyName());
                model.addRow(row);   
            }
            if(allHrList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No HR Present !","Message",JOptionPane.INFORMATION_MESSAGE);
            }
       }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while Fetching the all HR","Error",JOptionPane.ERROR_MESSAGE);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAllHr = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnBack = new javax.swing.JButton();
        jbtnRemoveHr = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 750, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 40));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 170));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        jLabel5.setText("Select HR:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, 30));

        jtblAllHr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hr id", "UserId", "Name", "Phone no", "Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblAllHr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 610, 210));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 860, 20));

        jbtnBack.setBackground(java.awt.SystemColor.activeCaption);
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 120, -1));

        jbtnRemoveHr.setBackground(java.awt.SystemColor.activeCaption);
        jbtnRemoveHr.setText("Remove HR");
        jbtnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveHrActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRemoveHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 170, -1));

        jbtnLogout.setBackground(java.awt.SystemColor.activeCaption);
        jbtnLogout.setText("Logout");
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveHrActionPerformed
       int row=jtblAllHr.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null,"Please Select an row first","Message",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       String hrid=(String)jtblAllHr.getValueAt(row,0);
       int resp=JOptionPane.showConfirmDialog(null,"Are You Sure ? to Delete "+hrid,"Message",JOptionPane.OK_CANCEL_OPTION);
       if(resp==JOptionPane.OK_OPTION){
           try{
               String userId=(String)jtblAllHr.getValueAt(row,1);
               boolean result=UserDao.removeUser(userId);
               if(result){
                   JOptionPane.showMessageDialog(null,"Record Deleted Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                   model.removeRow(row);
                   if(model.getRowCount()==0){
                       jbtnRemoveHr.setEnabled(false);
                   }
               }
               else{
                   JOptionPane.showConfirmDialog(null,"Record not deleted ","Error",JOptionPane.ERROR_MESSAGE);
               }
           }
           catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error in DB while Fetching the all HR","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
       }
    }//GEN-LAST:event_jbtnRemoveHrActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
      new AdminHrModuleFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
      new LoginFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jbtnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRemoveHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnRemoveHr;
    private javax.swing.JTable jtblAllHr;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
