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
public class Employee_M_Bean {
    static String  F_name,L_name,Address,Age,Phone,Gender,dob,E_mail;

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String Address) {
        Employee_M_Bean.Address = Address;
    }

    public static String getL_name() {
        return L_name;
    }

    public static void setL_name(String L_name) {
        Employee_M_Bean.L_name = L_name;
    }

    public static String getF_name() {
        return F_name;
    }

    public static void setF_name(String Employee_Name) {
        Employee_M_Bean.F_name = Employee_Name;
    }

    public static String getAge() {
        return Age;
    }

    public static void setAge(String Age) {
        Employee_M_Bean.Age = Age;
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String Phone) {
        Employee_M_Bean.Phone = Phone;
    }

    public static String getGender() {
        return Gender;
    }

    public static void setGender(String Gender) {
        Employee_M_Bean.Gender = Gender;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        Employee_M_Bean.dob = dob;
    }

    public static String getE_mail() {
        return E_mail;
    }

    public static void setE_mail(String E_mail) {
        Employee_M_Bean.E_mail = E_mail;
    }
    
}
