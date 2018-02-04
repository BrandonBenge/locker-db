/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author genebuchite
 */
public class Database_DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        String host = "jdbc:mysql://localhost:3306/mylocker";
        String uName="root";
        String uPass="mylockerpass";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        System.out.println("We Did It");
        Statement stmt=con.createStatement();
        String SQL="SELECT * FROM Cust";
        ResultSet rs=stmt.executeQuery(SQL);
        
        //rs.absolute(1);
        while (rs.next()) {
        int id_col = rs.getInt(1);
        String fName=rs.getString(2);
        String lName = rs.getString(3);
        String FullName = rs.getString(4);
        String Phone = rs.getString("Phone");
        System.out.println(id_col + " " + fName + " " + lName + " " + FullName + " " + Phone);
        }
        
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());
        }
    }
    
}
