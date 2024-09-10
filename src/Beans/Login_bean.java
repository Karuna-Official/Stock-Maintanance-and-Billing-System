/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.*;

/**
 *
 * @author karuna
 */
public class Login_bean {
    
    static String Username,Password,Auname,Apass,Employee_id,Employee_Username;

    public static String getEmployee_id() {
        return Employee_id;
    }

    public static void setEmployee_id(String Employee_id) {
        Login_bean.Employee_id = Employee_id;
    }

    public static String getEmployee_Username() {
        return Employee_Username;
    }

    public static void setEmployee_Username(String Employee_Username) {
        Login_bean.Employee_Username = Employee_Username;
    }

    public static String getAuname() {
        return Auname;
    }

    public static void setAuname(String Auname) {
        Login_bean.Auname = Auname;
    }

    public static String getApass() {
        return Apass;
    }

    public static void setApass(String Apass) {
        Login_bean.Apass = Apass;
    }

    public void setUsername(String User) {
        this.Username = User;
        
    }
    
    public static  String getUsername() {
        System.out.println(Username);
        return Username;
    }

    public void setPassword(String Pass) {
        this.Password = Pass;
    }

    public static String getPassword() {
        return Password;
    }

    
    
}
