/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tnandpl.dbutil.DBConnection;
import tnandpl.pojo.AllSelectedStudentsPojo;
import tnandpl.pojo.ParticipantPojo;

/**
 *
 * @author Dell
 */
public class ParticipantDao {
    public static int getNewParticipantId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st =conn.createStatement();
        ResultSet rs=st.executeQuery("select max(pid) from participants");
        int pid=101;
        rs.next();
            String str=rs.getString(1);
            if(str!=null){
            String id=str.substring(2);
            pid=Integer.parseInt(id)+1;
            }
        return pid;
    }
    public static int addNewParticipant(ParticipantPojo pt)throws SQLException,FileNotFoundException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
         ps.setString(1,pt.getUserId());
         ResultSet rs=ps.executeQuery();
         if(rs.next()){
             return -1;
         }
         ps=conn.prepareStatement("insert into users(userid,id,name,password,type,active)values(?,?,?,?,?,?)");
         ps.setString(1,pt.getUserId().toUpperCase());
         ps.setString(2,pt.getpId());
         ps.setString(3,pt.getName());
         ps.setString(4,pt.getPassword());
         ps.setString(5,pt.getType());
         ps.setString(6,"Y");
         int x=ps.executeUpdate();
         int y=0;
         if(x==1){
         ps=conn.prepareStatement("Insert into participants(pid,phone,skills,qualifications,resume)values(?,?,?,?,?)");
         ps.setString(1,pt.getpId());
         ps.setString(2,pt.getPhone());
         ps.setString(3,pt.getSkills());
         ps.setString(4,pt.getQualification());
         File f=pt.getResume();
         InputStream fin=new FileInputStream(f.getPath());
         ps.setBlob(5, fin);
         y=ps.executeUpdate();
         }
         return y;
    }
    public static ParticipantPojo getParticipantById(String id)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT name,userid,phone FROM users,participants WHERE users.id=participants.pid AND pid=?");
        ps.setString(1, id);
        ResultSet rs=ps.executeQuery();
        rs.next();
        ParticipantPojo pt=new ParticipantPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setPhone(rs.getString(3));
        return pt;
    }
     public static boolean updateResume(String pid,File resume)throws SQLException,FileNotFoundException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE participants set resume=? where pid=?");
        FileInputStream fobj=new FileInputStream(resume);
        ps.setBlob(1,fobj);
        ps.setString(2, pid);
        return ps.executeUpdate()==1;
}
      public static List<ParticipantPojo> AllStudentsList()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT users.name,users.userid,participants.pid,phone,qualifications,participants.skills FROM users,participants WHERE users.id=participants.pid AND type='Student'");
        ResultSet rs=ps.executeQuery();
        List<ParticipantPojo> AllStudents=new ArrayList<>();
       while(rs.next()){
        ParticipantPojo pt=new ParticipantPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setpId(rs.getString(3));
        pt.setPhone(rs.getString(4));
        pt.setQualification(rs.getString(5));
        pt.setSkills(rs.getString(6));
        AllStudents.add(pt);
      }
        return AllStudents;
    }
      public static List<AllSelectedStudentsPojo> getAllSelectedStudents()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT "
                                                  + "users.name,users.userid,results.participantid,results.jobid ,jobs.jobtitle,hr.companyname "
                                                  + "FROM users,results,jobs,hr WHERE users.id=results.participantid AND hr.hrid=jobs.hrid AND users.type='Student' AND results.selectedbyhr='YES'");
        ResultSet rs=ps.executeQuery();
        List<AllSelectedStudentsPojo> AllStudents=new ArrayList<>();
       while(rs.next()){
      AllSelectedStudentsPojo pt=new AllSelectedStudentsPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setpId(rs.getString(3));
        pt.setJobid(rs.getString(4));
        pt.setJobtitle(rs.getString(5));
        pt.setComapnyname(rs.getString(6));
        AllStudents.add(pt);
      }
        return AllStudents;
    }
      public static List<AllSelectedStudentsPojo> getAllStudentsResult()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT "
                                                  + "users.name,users.userid,results.participantid,results.jobid,results.percentage"
                                                  + "FROM users,results WHERE users.id=results.participantid AND users.type='Student' AND results.selectedbyhr='YES'");
        ResultSet rs=ps.executeQuery();
        List<AllSelectedStudentsPojo> AllStudents=new ArrayList<>();
       while(rs.next()){
      AllSelectedStudentsPojo pt=new AllSelectedStudentsPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setpId(rs.getString(3));
        pt.setJobid(rs.getString(4));
        pt.setJobtitle(rs.getString(5));
        pt.setComapnyname(rs.getString(6));
        AllStudents.add(pt);
      }
        return AllStudents;
    }
      
}
