/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemgtapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lynna
 */

/**
 * Class to determine the number of employees registered in the database and returns the 
 * total count
 * @author lynna
 */
public class employeeCount {
    /**
     * Function to count the number of employees in Intellisoft by counting the number of employees
     * whose information is in the database
     * @param table_name
     * @return 
     */
      public static int count_employees(String table_name){
           int total_count = 0;
           Connection conn = DBConnection.getConnection();
           
           Statement statement;
          try {
              statement = conn.createStatement();
              ResultSet resultset  = statement.executeQuery("SELECT COUNT(*) AS 'total_count' FROM" + table_name);
              while(resultset.next()){
                  total_count = resultset.getInt(1);
              }
          } catch (SQLException ex) {
              Logger.getLogger(employeeCount.class.getName()).log(Level.SEVERE, null, ex);
          }
           
           
           
         return total_count;
     }
    
}
