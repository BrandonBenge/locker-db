package javaapplication1;

// Reads FUlNAMES OF CUSTOMERS And Stores Them in rs hopefully readable by DataForm

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class readFirstNames{
    
        Statement stmt;
     ResultSet rs;
     String[] aFullName = {"trhis", "That", "The Other"};
     int i =0;
     
     
  
    public readFirstNames() {
        
        ConToData ctd = new ConToData();
        
   System.out.println("ReaDING");
             
     try{
        System.out.println("Started");
        String host = "jdbc:mysql://localhost:3306/lockerdata";//?zeroDateTimeBehavior=convertToNull [root on Default schema]";
        String uName = "root";
        String uPass = "mylockerpass";
        ctd.con = DriverManager.getConnection(host,uName,uPass);
        System.out.println("Connected");
        // The SQL
        stmt = ctd.con.createStatement();
        String sql = "Select FullName From Customers Order By FullName";
        rs = stmt.executeQuery(sql);
        // use sql
        
        rs.absolute(1);
        
        while (rs.next()) {
        i+=1;
        System.out.println(i + ": " + rs.getString(1));
        //aFullName[i] = rs.getString(1);
        
        }
        System.out.println("Selected");
           //  jComboBox1.AddItem("Cat");

 
          
       // System.out.println(MyResult);
         }
     catch (SQLException err) {
         System.out.println(err.getMessage());
        // JOptionPane.showMessageDialog(DbForm.this,err.getMessage());
     }
   
}

}