package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConToData {
    
     Connection con;
      Statement stmt;
      ResultSet rs;
  
    public ConToData()
    {
      System.out.println("Starteed");
      DoConnect();
     
      
      
    }  
  public void DoConnect() {
  
      try {
      String host = "jdbc:mysql://localhost:3306/lockerdata";
      String uName = "root";
      String uPass = "mylockerpass";
      con = DriverManager.getConnection(host,uName,uPass);
      
      }catch (SQLException err) {
          System.out.println(err.getMessage());
          
      
      }
      System.out.println("Connected");
  }
  
}