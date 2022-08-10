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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tnandpl.dbutil.DBConnection;
import tnandpl.pojo.HrPojo;
import tnandpl.pojo.JobsPojo;
import tnandpl.pojo.ParticipantJobPojo;
import tnandpl.pojo.ParticipantPojo;

/**
 *
 * @author Dell
 */
public class JobDao {
    public static int getNewJobId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(jobid) from jobs");
        rs.next();
        String str=rs.getString(1);
        int jobid=101;    
        if(str!=null){
            String id=str.substring(4);
            jobid=Integer.parseInt(id)+1;   
        }
        return jobid;
    }
    public static boolean AddNewJob(JobsPojo job)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into jobs(jobid,jobtitle,hrid,tags,status)values(?,?,?,?,?)");
        ps.setString(1,job.getJobId());
        ps.setString(2,job.getJobTitle());
        ps.setString(3,job.getHrId());
        ps.setString(4,job.getTags());
        ps.setInt(5,job.getStatus());
    
    return 1==ps.executeUpdate();
    }
    public static List<JobsPojo> getAllJobByCurrentHr(String hrid)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status!=-1");
        ps.setString(1, hrid);
        ResultSet rs=ps.executeQuery();
        List<JobsPojo> allHrJobList=new ArrayList<>();
        while(rs.next()){
            JobsPojo obj=new JobsPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            allHrJobList.add(obj);
        }
        return allHrJobList;
        
    }
    public static boolean removeJobByJobId(String JobId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=-1 where jobid=?");
        ps.setString(1, JobId);
        return ps.executeUpdate()==1;
        
    }
    public static List<JobsPojo> getAllEditJobsByCurrentHr(String hrId)throws SQLException {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status=0");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List<JobsPojo> allJobList=new ArrayList<>();
        while(rs.next()){
            JobsPojo job=new JobsPojo();
            job.setJobId(rs.getString(1));
            job.setJobTitle(rs.getString(2));
            job.setTags(rs.getString(3));
            job.setStatus(rs.getInt(4));
            allJobList.add(job);
        }
        return allJobList;
    }
    public static boolean editJobByJobId(JobsPojo job)throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update jobs set jobtitle=?, tags=? where jobid=?");
         ps.setString(1,job.getJobTitle());
         ps.setString(2,job.getTags());
         ps.setString(3,job.getJobId());
        
         return 1==ps.executeUpdate();
   
}
    public static boolean setStatus(String jobid)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=1 where jobid=?");
        ps.setString(1, jobid);
        return 1==ps.executeUpdate();
    }
     public static List<JobsPojo> getAllOpenJobByCurrentHr(String hrid)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,jobs.status,jobs.hrid from jobs where hrid=? and status=1");
        ps.setString(1, hrid);
        ResultSet rs=ps.executeQuery();
        List<JobsPojo> allHrJobList=new ArrayList<>();
        while(rs.next()){
            JobsPojo obj=new JobsPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            obj.setHrId(rs.getString(5));
            allHrJobList.add(obj);
        }
        return allHrJobList;
     }
      public static List<ParticipantJobPojo> ShowAllOpenJobsForStudents()throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT jobid,jobtitle,companyname,tags,jobs.hrid "
                                                  + " FROM jobs,hr WHERE jobs.hrid=hr.hrid and status=1 order by jobid"); 
        
                                                     
       // ps.setString(1, hrid);
        ResultSet rs=ps.executeQuery();
        List<ParticipantJobPojo> AllOpenJobList=new ArrayList<>();
        while(rs.next()){
            ParticipantJobPojo obj=new ParticipantJobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setCompanyName(rs.getString(3));
            obj.setTags(rs.getString(4));
            obj.setHrId(rs.getString(5));
            AllOpenJobList.add(obj);
            
        }
       return AllOpenJobList;
}
       public static List<ParticipantJobPojo>AllJobs()throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,hr.companyname,jobs.hrid,jobs.tags from jobs,hr where jobs.hrid=hr.hrid order by jobid");
        ResultSet rs=ps.executeQuery();
        List<ParticipantJobPojo> AllJobsList=new ArrayList<>();
        while(rs.next()){
            ParticipantJobPojo obj=new ParticipantJobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setCompanyName(rs.getString(3));
            obj.setHrId(rs.getString(4));
            obj.setTags(rs.getString(5));
            AllJobsList.add(obj);
        }
        return AllJobsList;
     }
      
}