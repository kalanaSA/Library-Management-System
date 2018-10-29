package com;

import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {

    static Connection connect;
            Connection conn;

    
    public static Connection connect(){
            
       
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsj","root","");
                System.out.println("connected!");
                return conn;
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
            
        }
    
 }