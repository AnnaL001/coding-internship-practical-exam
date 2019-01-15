/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemgtapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lynna
 */
public class DBConnection {
     public static Connection getConnection(){
         Connection conn = null;
          
          try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost/employeeDB", "root","");
          }catch(Exception ex){
               System.out.println(ex.getMessage());
          }
       return conn;
     }
    
}
