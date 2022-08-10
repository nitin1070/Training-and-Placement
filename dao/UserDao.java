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
import java.util.HashMap;
import java.util.Map;
import tnandpl.dbutil.DBConnection;
import tnandpl.pojo.CurrentUser;
import tnandpl.pojo.HrPojo;
import tnandpl.pojo.UserPojo;

/**
 *
 * @author Dell
 */
public class UserDao {
    public static boolean validateUser(UserPojo user)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and type=? and active='Y'");
        
        ps.setString(1,user.getUserid());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getType());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            CurrentUser.setUserId(rs.getString(1));
            CurrentUser.setId(rs.getString(2));
            CurrentUser.setName(rs.getString(3));
            CurrentUser.setType(rs.getString(5));
            
            return true;
            
        }
        return false;
    }
    public static Map<String,HrPojo> getAllHrList()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid,id,name from users where type= 'Hr'");
        Map<String,HrPojo> allHrList=new HashMap<>();
        while(rs.next()){
            String userid=rs.getString(1);
            String hrid=rs.getString(2);
            String hrName=rs.getString(3);
            HrPojo obj=new HrPojo();
            obj.setUsserId(userid);
            obj.setHrId(hrid);
            obj.setHrName(hrName);
            allHrList.put(userid,obj);
            
        }
        return allHrList;
    }
    public static boolean updatePassword(String userid,String Password)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=?,active='Y' where userid=?");
    
        ps.setString(1,Password);
        ps.setString(2, userid);
        return 1==ps.executeUpdate();
        
    }
    public static boolean removeUser(String userId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set active='N' where userid=?");
  
        ps.setString(1, userId);
        return 1==ps.executeUpdate();
    }
    public static boolean checkOldPassword(String id,String oldpwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM users where password=? AND id=?");
        ps.setString(1,oldpwd);
        ps.setString(2, id);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
     public static boolean updateStudentPassword(String id,String pwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE users set password=? where id=?");
        ps.setString(1,pwd);
        ps.setString(2, id);
        return ps.executeUpdate()==1;
}
}
