/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Login_bean;
import DB.Connections;
import java.sql.*;
import javax.swing.*;
import static javax.swing.UIManager.getString;

/**
 *
 * @author karuna
 */
public class Login_details {
    //getting value
    Login_bean bean=new Login_bean();
    Connections con=new Connections();
    static Connection Conn;
    static PreparedStatement stm;
    
    
    
    
    int count;
   
    
    public int getData(){
        String Username=bean.getUsername();
        String Password=bean.getPassword();
        
         try{
             Conn=con.getCon();
             stm=Conn.prepareStatement("Select * from Login_details where Username='"+Username+"' and Password='"+Password+"'");
             ResultSet rt=stm.executeQuery();
             
             count =0;
             
             while(rt.next()){
                 String ID=rt.getString("Id");
                 String E_name=rt.getString("Username");
                 bean.setEmployee_id(ID);
                 bean.setEmployee_Username(E_name);
                 count++;
             }
         return count;
         }
         catch(Exception e){
          System.out.println(e);
         }
         return count;
    }
    
    
    public int getAdminData(){
        String Username=bean.getAuname();
        String Password=bean.getApass();
       
         try{
             Conn=con.getCon();
             stm=Conn.prepareStatement("Select * from Admin_Login where Username='"+Username+"' and Password='"+Password+"'");
             ResultSet rt=stm.executeQuery();
             
             count =0;
             
             while(rt.next()){
               count++;
             }
         return count;
         }
         catch(Exception e){
          System.out.println(e);
         }
         return count;
    }
    
}
