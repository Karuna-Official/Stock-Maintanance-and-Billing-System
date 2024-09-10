/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.*;
import DB.Connections;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author karuna
 */
public class Create_Account {
    
    Creating_Account bean=new Creating_Account();
    
    Connections con=new Connections();
    static Connection Conn;
    static Statement stm;
    
    
    
    public int getValue(){
      String Value=bean.getValues();
      String upValue=bean.getUpvalue();
       
      
      
      try{
          Conn =con.getCon();
          stm=Conn.createStatement();
          String query="insert into Employee_details(First_Name,Last_Name,Age,Gender,Phone_No,Email_Id,Address,D_O_B,Aadhar_no,Qualification,Experience,Position,Created_By) values"+ Value +";";
          String query_1="insert into login_details(Username,Password) values"+upValue;
          stm.execute(query_1);
          stm.execute(query);
          return 1;
        }
      
      catch(Exception e){
          return 0;
      }
    
    
    }
    
}
