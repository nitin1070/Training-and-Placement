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
import tnandpl.pojo.AllSelectedStudentsPojo;
import tnandpl.pojo.ParticipantJobPojo;
import tnandpl.pojo.ParticipantResultPojo;
import tnandpl.pojo.ResultPojo;
import tnandpl.pojo.StudentTestResultPojo;

/**
 *
 * @author Dell
 */
public class ResultDao {
    public static boolean ApplyForJob(ResultPojo result)throws SQLException{
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from results where jobid=? and participantid=?");
       ps.setString(1,result.getJobid());
       ps.setString(2,result.getPid());
       ResultSet rs=ps.executeQuery();
       if(rs.next()){
           return false;
       }
       ps=conn.prepareStatement("insert into results values(?,?,?,?)");
       ps.setString(1,result.getJobid());
       ps.setString(2,result.getPid());
       ps.setDouble(3,result.getPercentge());
       ps.setString(4,result.getSelectedbyHr());
      return 1== ps.executeUpdate();
    }
    public static List<ParticipantJobPojo> getAllAppliedJobs(String ParticipantId)throws SQLException{
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("SELECT jobs.jobid,jobs.jobtitle,companyname,tags FROM jobs,results,hr WHERE jobs.jobid=results.jobid AND jobs.hrid=hr.hrid AND participantid=? AND percentage=-1");
       ps.setString(1, ParticipantId);
       ResultSet rs=ps.executeQuery();
       List<ParticipantJobPojo> allAppliedJobsList=new ArrayList<>();
       while(rs.next()){
           ParticipantJobPojo pj=new ParticipantJobPojo();
           pj.setJobId(rs.getString(1));
           pj.setJobTitle(rs.getString(2));
           pj.setCompanyName(rs.getString(3));
           pj.setTags(rs.getString(4));
           
           allAppliedJobsList.add(pj);        
       }
       return allAppliedJobsList;
    }
    public static boolean setResult(ResultPojo result)throws SQLException{
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("update results set percentage=? where participantid=? and jobid=?");
       ps.setDouble(1,result.getPercentge());
       ps.setString(2,result.getPid());
       ps.setString(3,result.getJobid());
       
       return 1==ps.executeUpdate();
}
    public static List<ParticipantResultPojo> getAllCompletedJobs(String pid)throws SQLException{
        Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("SELECT jobs.jobid,jobs.jobtitle,hr.companyname,jobs.tags,results.percentage FROM jobs,hr,results WHERE jobs.jobid=results.jobid AND jobs.hrid=hr.hrid AND results.percentage!=-1 AND results.participantid=?");
       ps.setString(1, pid);
       ResultSet rs=ps.executeQuery();
       List<ParticipantResultPojo> allResultList=new ArrayList<>();
       while(rs.next()){
           ParticipantResultPojo result=new ParticipantResultPojo();
           result.setJobId(rs.getString(1));
           result.setJobTitle(rs.getString(2));
           result.setCompanyName(rs.getString(3));
           result.setTags(rs.getString(4));
           result.setPercentage(rs.getDouble(5));
           allResultList.add(result);
       }
       return allResultList;
    }
     public static List<StudentTestResultPojo> getAllTestResult()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT users.name,users.userid,results.participantid,results.jobid,results.percentage FROM users,results WHERE users.id=results.participantid AND users.type='Student' AND results.selectedbyhr='YES'");
        ResultSet rs=ps.executeQuery();
        List<StudentTestResultPojo> AllStudents=new ArrayList<>();
       while(rs.next()){
     StudentTestResultPojo pt=new StudentTestResultPojo();
        pt.setName(rs.getString(1));
        pt.setUserid(rs.getString(2));
        pt.setPid(rs.getString(3));
        pt.setJobid(rs.getString(4));
        pt.setPercentge(rs.getDouble(5));
      
        AllStudents.add(pt);
      }
        return AllStudents;
    }

}

