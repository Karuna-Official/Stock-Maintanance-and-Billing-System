/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author karuna
 */
public class Creating_Account {
    static String Values,upvalue,Aupvalue;

    public static String getAupvalue() {
        return Aupvalue;
    }

    // this method will get the admin username,password value from the Create_User frame and set the value
    public static void setAupvalue(String Aupvalue) {
        Creating_Account.Aupvalue = Aupvalue;
    }

    public static String getUpvalue() {
        return upvalue;
    }
      
   // this method will get the username,password value from the Create_User frame and set the value
    public void setUpvalue(String upvalue) {
        Creating_Account.upvalue = upvalue;
    }

    public static String getValues() {
        return Values;
    }
   // this method will get the values for the Create_Account database and set the vaalues from the Create_User frame and set the value
    public void setValues(String Values) {
        this.Values = Values;
    }
    
    
}
