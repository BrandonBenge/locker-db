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
        String host = "jdbc:mariadb://localhost:3307/freezer";
        String uName="root";
        String uPass="mylockerpass";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        System.out.println("We Did It");
        Statement stmt=con.createStatement();
        String SQL="SELECT Counter, FullNAme, KillFloor FROM employees ";
        ResultSet rs=stmt.executeQuery(SQL);
        
        //rs.absolute(1);
        while (rs.next()) {
        int Counter = rs.getInt(1);
        String FullNAme=rs.getString(2);
        int KillFloor = rs.getInt(3);
        System.out.println(Counter + " " + FullNAme + " " + KillFloor);
        }
        
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());
        }
    }
    
}
