/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author karuna
 */

import java.sql.*;
public class Connections {
    
   public static Connection con;
    
  public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_Main","root","1234");
            
        }
        catch(Exception e){
         System.out.println(e);
        }
    return con;   
    }
    
}
