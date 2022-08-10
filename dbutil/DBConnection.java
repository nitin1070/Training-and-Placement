/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnandpl.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class DBConnection {
    public static Connection conn;
    static 
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tnp","myproject");
            JOptionPane.showMessageDialog(null,"Connection Opened Successfully!","success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR in loading the driver","Driver Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showConfirmDialog(null,"Error in opening connection!","DB Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
            
                    
        }
        }
    public static Connection getConnection()
    {
        return conn;
    }
    public static Connection CloseConnection()
    {
        try
        {
            conn.close();
            JOptionPane.showConfirmDialog(null,"Connection Closed Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in closing Connection","DB Error!",JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        }
        return null;
    }
}
