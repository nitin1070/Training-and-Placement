/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tnandpl.dbutil.DBConnection;
import tnandpl.pojo.QuestionPojo;

/**
 *
 * @author Dell
 */
public class QuestionDao {
    public static boolean setPapaer(List<QuestionPojo> question)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into questions(jobid,Qno,question,option1,option2,option3,option4,correctoption)"
                                                               + "values(?,?,?,?,?,?,?,?)");
        int count=0;
        for(QuestionPojo list:question){
            ps.setString(1,list.getJobid());
            ps.setInt(2,list.getQno());
            ps.setString(3,list.getQuestion());
            ps.setString(4,list.getOption1());
            ps.setString(5,list.getOption2());
            ps.setString(6,list.getOption3());
            ps.setString(7,list.getOption4());
            ps.setString(8,String.valueOf(list.getCorrectOption()));
          int res= ps.executeUpdate();  
        
        if(res==1)
            ++count;
            }
        if(count==question.size())
            return true;
            return false;                                                                    
}
    public static List<QuestionPojo> getQuestionPaperByJobID(String jobId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from questions where jobid=?");
        ps.setString(1, jobId);
        ResultSet rs=ps.executeQuery();
        List<QuestionPojo> questionList=new ArrayList<>();
        while(rs.next()){
            QuestionPojo ques=new QuestionPojo();
            ques.setJobid(rs.getString(1));
            ques.setQno(rs.getInt(2));
            ques.setQuestion(rs.getString(3));
            ques.setOption1(rs.getString(4));
            ques.setOption2(rs.getString(5));
            ques.setOption3(rs.getString(6));
            ques.setOption4(rs.getString(7));
            ques.setCorrectOption(rs.getInt(8));
            questionList.add(ques);    
        }
        return questionList;
        
    }
    public static boolean editQuestionPaper(List<QuestionPojo> questionList)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update questions set question=?,option1=?,option2=?,option3=?,option4=?,correctoption=? where jobid=? and qno=?");
        int count=0;
        for(QuestionPojo ques:questionList){
          ps.setString(1,ques.getQuestion());
          ps.setString(2,ques.getOption1());
          ps.setString(3,ques.getOption2());
          ps.setString(4,ques.getOption3());
          ps.setString(5,ques.getOption4());
          ps.setInt(6,ques.getCorrectOption());
          ps.setString(7,ques.getJobid());
          ps.setInt(8,ques.getQno());
         int res=ps.executeUpdate();         
        if(res==1){
            ++count;
        }
            }
        return count==questionList.size();
        
    }
}