/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.SQLException;

/**
 *
 * @author genebuchite
 */


public class DataForm {
    
 

   public  static void MyStart() {
      System.out.println("Ok I Started");
      readFirstNames rFN = new readFirstNames();
      
      try{
      rFN.rs.absolute(1);
      while (rFN.rs.next()) {
      System.out.println(rFN.rs.getString(1));
      }
      System.out.println("ok Here?");
      } catch (SQLException err) {
         System.out.println(err.toString());
      }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //ConToData ctd = new ConToData();
        System.out.println("OK");
        
       MyStart();
       
        
    }
    
}
