/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.*;
import DB.Connections;
import java.sql.*;

/**
 *
 * @author karuna
 */
public class Employee_Menu_DAO {
    
    String F_name,Address,L_name,Age,Gender,Phone,E_Mail,dob;
    
    Connections con=new Connections();
    Login_bean bean=new Login_bean();
    Employee_M_Bean bean_1=new Employee_M_Bean();
    
    static Connection Conn;
    static Statement stm;
    
    
    public void Employee_Menu(){
        
        String Id=bean.getEmployee_id();
        
        try{
            Conn=con.getCon();
            stm=Conn.createStatement();
            ResultSet rt=stm.executeQuery("select * from Employee_details where Id = "+Id+" ;");
            
            while(rt.next()){
            F_name=rt.getString("First_Name");
            L_name=rt.getString("Last_Name");
            Age=rt.getString("Age");
            Gender=rt.getString("Gender");
            Phone=rt.getString("Phone_No");
            E_Mail=rt.getString("Email_Id");
            Address=rt.getString("Address");
            dob=rt.getString("D_O_B");
            
            bean_1.setF_name(F_name);
            bean_1.setL_name(L_name);
            bean_1.setAge(Age);
            bean_1.setGender(Gender);
            bean_1.setAddress(Address);
            bean_1.setDob(dob);
            bean_1.setE_mail(E_Mail);
            bean_1.setPhone(Phone);
            
            
            }
           
        }
        catch(Exception e){
          System.out.println(e);
        }
        
    
    }
    
}
