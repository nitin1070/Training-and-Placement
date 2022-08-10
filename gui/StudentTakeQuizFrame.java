/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tnandpl.dao.QuestionDao;
import tnandpl.dao.ResultDao;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.QuestionPojo;
import tnandpl.pojo.ResultPojo;

/**
 *
 * @author Dell
 */
public class StudentTakeQuizFrame extends javax.swing.JFrame {

   private String jobId;
   private String jobTitle;
   int counter =0;
   private List<QuestionPojo> questionList;
   private QuestionPojo question;
   private List<Integer> answerList;
    public StudentTakeQuizFrame() {
        initComponents();
        this.setLocationRelativeTo(null);     
    }
    public StudentTakeQuizFrame(String jobId,String jobTitle){
        this();
        this.jobId=jobId;
        this.jobTitle=jobTitle;
        lblJobTitle.setText("Test For   "+(this.jobTitle));
        lblQno.setText(""+(counter+1));
        loadQuestionPaper();
    }
    private void loadQuestionPaper(){
        try{
        questionList=QuestionDao.getQuestionPaperByJobID(jobId);
        answerList=new ArrayList<>(questionList.size());
        for(int i=0;i<questionList.size();i++){
            answerList.add(i,0);
        }
        showNextQuestionInFrame();
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
    }
     private void showNextQuestionInFrame(){
        question=questionList.get(counter);
        txtQuestion.setText(question.getQuestion());
        Option1.setText(question.getOption1());
        Option2.setText(question.getOption2());
        Option3.setText(question.getOption3());
        Option4.setText(question.getOption4());
        int answer=answerList.get(counter);
        switch(answer){
            case 1: 
                     Option1.setSelected(true);
                     break;
            case 2: 
                     Option2.setSelected(true);
                     break;
            case 3: 
                     Option3.setSelected(true);
                     break;
            case 4: 
                     Option4.setSelected(true);
                     break;
            default:
                     buttonGroup1.clearSelection();
        }
        
    }
     private int validateAns(){
         if(Option1.isSelected())
             return 1;
         else if(Option2.isSelected())
             return 2;
         else if(Option3.isSelected())
             return 3;
         else if(Option4.isSelected())
             return 4;
         else 
             return 0;
     }
     
    private double getPercentage(){
        double marksobtained=0;
        for(int i=0;i<questionList.size()-1;i++){
            QuestionPojo question=questionList.get(i);
            if(question.getCorrectOption()==answerList.get(i)){
                ++marksobtained;
            }
        }
        double per=((double)marksobtained/answerList.size())*100;  
    return per;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblJobTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Option1 = new javax.swing.JRadioButton();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        Option4 = new javax.swing.JRadioButton();
        jbtnPrevious = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        jbtnNext = new javax.swing.JButton();
        jbtnDiscard = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 35, 709, 113));
        jPanel1.add(lblJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, 30));

        jLabel2.setText("Q NO.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 340, 10));
        jPanel1.add(lblQno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 40, 30));

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 700, 80));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 800, 10));

        jLabel3.setText("Options ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 800, 10));

        buttonGroup1.add(Option1);
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });
        jPanel1.add(Option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        buttonGroup1.add(Option2);
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });
        jPanel1.add(Option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        buttonGroup1.add(Option3);
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });
        jPanel1.add(Option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        buttonGroup1.add(Option4);
        Option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4ActionPerformed(evt);
            }
        });
        jPanel1.add(Option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        jbtnPrevious.setText("Previous");
        jbtnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, -1));

        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 100, -1));

        jbtnNext.setText("Next");
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 120, -1));

        jbtnDiscard.setText("Discard");
        jbtnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDiscardActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 90, -1));

        lbl1.setText("1");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 30, 20));

        lbl2.setText("2");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 30, 20));

        lbl3.setText("3");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 20));

        lbl4.setText("4");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option3ActionPerformed

    private void Option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option4ActionPerformed
       
    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option2ActionPerformed

    private void jbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNextActionPerformed
        int res=validateAns();
        if(res==0){
            JOptionPane.showMessageDialog(null,"Please Select An Option ","Message",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         answerList.set(counter,res);
         ++counter;
         if(counter==questionList.size()){
            counter=0; 
         }
         showNextQuestionInFrame();
         lblQno.setText(""+(counter+1));

    }//GEN-LAST:event_jbtnNextActionPerformed

    private void jbtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreviousActionPerformed
               int res=validateAns();
               if(res==0){
           JOptionPane.showMessageDialog(null,"Please Select An Option ","Message",JOptionPane.INFORMATION_MESSAGE);
            return;          
        }
         answerList.set(counter,res);
         --counter;
         if(counter==-1){
            counter=questionList.size()-1;
         }
         showNextQuestionInFrame();
         lblQno.setText(""+(counter+1));
               
    }//GEN-LAST:event_jbtnPreviousActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        int res=validateAns();
        if(res==0){
            JOptionPane.showMessageDialog(null,"Please Select An Option ","Message",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         answerList.set(counter,res);
        double per=getPercentage();
        ResultPojo result=new ResultPojo();
        result.setJobid(jobId);
        result.setPid(CurrentUser.getId());
        if(per<5)
            per=5.0;
        result.setPercentge(per);
        result.setSelectedbyHr("NO");
        try{
            boolean  response=ResultDao.setResult(result);
            if(response==true){
                JOptionPane.showMessageDialog(null,"You have Got "+per+"%\n Result has sent on your emailid","Completed",JOptionPane.INFORMATION_MESSAGE);
                new StudentViewAllAppliedJobsFrame().setVisible(true);
                this.dispose();
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
        
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jbtnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDiscardActionPerformed
         new StudentViewAllAppliedJobsFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jbtnDiscardActionPerformed

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
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTakeQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JRadioButton Option4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnDiscard;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JButton jbtnPrevious;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblJobTitle;
    private javax.swing.JLabel lblQno;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
