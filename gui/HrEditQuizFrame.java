/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import tnandpl.dao.QuestionDao;
import tnandpl.pojo.QuestionPojo;

public class HrEditQuizFrame extends javax.swing.JFrame {
    int counter=0;
    private String jobId;
    private List<QuestionPojo> questionList;
    private QuestionPojo currentquestion;
   
    public HrEditQuizFrame() {
        initComponents();
        this.setLocationRelativeTo(null);    
    }

    public HrEditQuizFrame(String jobId){
        this();
        this.jobId=jobId;
        lblQuesNo.setText(" "+(counter+1));
              
        loadQuestionPaper();
    }
    private void loadQuestionPaper(){
        try{
        questionList=QuestionDao.getQuestionPaperByJobID(jobId);
        showNextQuestionInFrame();
        }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
    }
    private void showNextQuestionInFrame(){
        currentquestion=questionList.get(counter);
        jtxtQuestion.setText(currentquestion.getQuestion());
        jtxtOption1.setText(currentquestion.getOption1());
        jtxtOption2.setText(currentquestion.getOption2());
        jtxtOption3.setText(currentquestion.getOption3());
        jtxtOption4.setText(currentquestion.getOption4());
        jComboBox.setSelectedIndex(currentquestion.getCorrectOption());
    }
   private boolean validateInput(){
   if(jtxtQuestion.getText().trim().isEmpty()||jtxtOption1.getText().trim().isEmpty()||jtxtOption2.getText().trim().isEmpty()||jtxtOption3.getText().trim().isEmpty()||jtxtOption4.getText().trim().isEmpty()||jComboBox.getSelectedIndex()==0){
       return false;
      
   }
    return true;
       
   }
   private void ClearText(){
       jtxtQuestion.setText("");
       jtxtOption1.setText("");
       jtxtOption2.setText("");
       jtxtOption3.setText("");
       jtxtOption4.setText("");
       jComboBox.setSelectedIndex(0);
       jtxtQuestion.requestFocus();
   }
   private void setQuestion(){
       currentquestion.setQuestion(jtxtQuestion.getText().trim());
       currentquestion.setOption1(jtxtOption1.getText().trim());
       currentquestion.setOption2(jtxtOption2.getText().trim());
       currentquestion.setOption3(jtxtOption3.getText().trim());
       currentquestion.setOption4(jtxtOption4.getText().trim());
       currentquestion.setCorrectOption(jComboBox.getSelectedIndex());
       questionList.set(counter,currentquestion);
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQuesNo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jtxtOption1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtOption2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtOption3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtOption4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDiscardPaper = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtQuestion = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 720, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel4.setText("Ques.NO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 50, 30));

        lblQuesNo.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jPanel1.add(lblQuesNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 830, 10));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel3.setText("Options ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        jtxtOption1.setBackground(new java.awt.Color(173, 195, 234));
        jtxtOption1.setBorder(null);
        jtxtOption1.setOpaque(false);
        jPanel1.add(jtxtOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 230, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 250, 40));

        jtxtOption2.setBackground(new java.awt.Color(173, 195, 234));
        jtxtOption2.setBorder(null);
        jtxtOption2.setOpaque(false);
        jPanel1.add(jtxtOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 230, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 250, 40));

        jtxtOption3.setBackground(new java.awt.Color(173, 195, 234));
        jtxtOption3.setBorder(null);
        jtxtOption3.setOpaque(false);
        jPanel1.add(jtxtOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 230, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 250, 40));

        jtxtOption4.setBackground(new java.awt.Color(173, 195, 234));
        jtxtOption4.setBorder(null);
        jtxtOption4.setOpaque(false);
        jPanel1.add(jtxtOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 230, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 250, 40));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel9.setText("    Option 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel10.setText("Option 3");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 30));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel11.setText("Option 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, 30));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel12.setText("Option 4");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 80, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 860, 10));

        jLabel13.setFont(new java.awt.Font("Noteworthy", 0, 12)); // NOI18N
        jLabel13.setText("   Correct Option");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 30));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Correct Option", "Option1", "Option2", "Option3", "Option4" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 190, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 880, 10));

        btnPrevious.setBackground(java.awt.SystemColor.activeCaption);
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 120, 25));

        btnNext.setBackground(java.awt.SystemColor.activeCaption);
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 120, 25));

        btnDiscardPaper.setBackground(java.awt.SystemColor.activeCaption);
        btnDiscardPaper.setText("Discard Paper");
        btnDiscardPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardPaperActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 120, 25));

        btnSubmit.setBackground(java.awt.SystemColor.activeCaption);
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 120, 25));

        jtxtQuestion.setBackground(new java.awt.Color(173, 195, 234));
        jtxtQuestion.setColumns(20);
        jtxtQuestion.setRows(5);
        jScrollPane1.setViewportView(jtxtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 660, 80));

        btnBack.setBackground(java.awt.SystemColor.activeCaption);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
         if(validateInput()){
             setQuestion();
             --counter;
             if(counter==-1)
                 counter=questionList.size()-1;
                 lblQuesNo.setText(" "+(counter+1));
                 showNextQuestionInFrame(); 
               
         }
          else{
                 JOptionPane.showMessageDialog(null,"Please Fill All The Fields","MESSAGE",JOptionPane.WARNING_MESSAGE);
             }
    }//GEN-LAST:event_btnPreviousActionPerformed
     
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
         if(validateInput()){
             setQuestion();
             ++counter;
             if(counter==questionList.size())
                 counter=0;
                 lblQuesNo.setText(" "+(counter+1));
                 showNextQuestionInFrame(); 
                
         }
          else{
                 JOptionPane.showMessageDialog(null,"Please Fill All The Fields","MESSAGE",JOptionPane.WARNING_MESSAGE);
             }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDiscardPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardPaperActionPerformed
        new HrQuizOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDiscardPaperActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
          if(validateInput()){
              setQuestion();
              try{
                  boolean result=QuestionDao.editQuestionPaper(questionList);
                  if(result){
                      JOptionPane.showMessageDialog(null,"Question Edited Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                      new HrChooseJobForQuizEditingFrame().setVisible(true);
                      this.dispose();
                  }
                  else{
                  JOptionPane.showMessageDialog(null,"Question Could Not Edited YET","Message",JOptionPane.WARNING_MESSAGE);
                  }
              }
               catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DATABASE ERROR !","MESSAGE",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
              
          }
          }       
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      new HrChooseJobForQuizEditingFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDiscardPaper;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jtxtOption1;
    private javax.swing.JTextField jtxtOption2;
    private javax.swing.JTextField jtxtOption3;
    private javax.swing.JTextField jtxtOption4;
    private javax.swing.JTextArea jtxtQuestion;
    private javax.swing.JLabel lblQuesNo;
    // End of variables declaration//GEN-END:variables
}
