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


/**
 *
 * @author Dell
 */
public class HrDAO {
    public static int getNewHrId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st =conn.createStatement();
        ResultSet rs=st.executeQuery("select max(hrid) from hr");
        int hrid=101;
        rs.next();
            String str=rs.getString(1);
            if(str!=null){
            String id=str.substring(3);
            hrid=Integer.parseInt(id)+1;
            }
        return hrid;
             
    
}
    public static int AddNewHr(HrPojo hr)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1,hr.getUsserId());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return -1;
        }
       ps=conn.prepareStatement("insert into users(userid,id,name,password,type,active)values(?,?,?,?,?,?)");
        ps.setString(1,hr.getUsserId().toUpperCase());
        ps.setString(2,hr.getHrId());
        ps.setString(3,hr.getHrName());
        ps.setString(4,hr.getPassword());
        ps.setString(5,hr.getType());
        ps.setString(6,"Y");
        int x=ps.executeUpdate();
       
        if(x==1){
            ps=conn.prepareStatement("insert into hr(hrid,phone,companyname,profession)values(?,?,?,?)");
            ps.setString(1,hr.getHrId());
            ps.setString(2,hr.getMobile());
            ps.setString(3,hr.getCompanyName());
            ps.setString(4,hr.getProfession());
            int y=ps.executeUpdate();
            if(y==1)
           return 1;     
        }
        
         return 0;
        
        
    }
    public static List getAllHr()throws SQLException{
         Connection conn=DBConnection.getConnection();
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("select "
                                    + "hr.hrid,users.userid,users.name,hr.phone,hr.companyname from "
                                    + "users,hr where hr.hrid=users.id and users.active='Y' order by hr.hrid");
         List<HrPojo> allHrList=new ArrayList<>();
         while(rs.next()){
             HrPojo obj=new HrPojo();
             obj.setHrId(rs.getString(1));
             obj.setUsserId(rs.getString(2));
             obj.setHrName(rs.getString(3));
             obj.setMobile(rs.getString(4));
             obj.setCompanyName(rs.getString(5));
             allHrList.add(obj);
         }
         return allHrList;
    }
   public static String getCompanyNameById(String HrId)throws SQLException{         
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select companyname from hr where hrid=?");
       ps.setString(1, HrId);
       ResultSet rs=ps.executeQuery(); 
       String str="";
      if( rs.next()){
       str= rs.getString(1);
      }
      return str;
   }
    
}
