/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Beans.Add_Supplier_Bean;
import DB.Connections;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author karuna
 */
public class Add_Supplier_Dao {
    
    Connections con=new Connections();
    Add_Supplier_Bean Bean=new Add_Supplier_Bean();
    
    static Connection Con;
    static Statement Stm;
    
    public void SetDB(){
        
        String Value=Bean.getSupplier_Details();
        String Query=Bean.getBank_Details();
    
        try{
        Con=con.getCon();
        Stm=Con.createStatement();
        String Query1="insert into supplier_details(Supplier_Name,Company_Name,GSTINNo,Contact_No_1,Contact_No_2,EMail,Address,Supply_Category,Website,ODD) values "+Value+";";
        String Query2="insert into supplier_bank_details(Bank_Name,Branch_Name,Account_No,IFSC_Code,UPI_Id) values "+Query+";";
        

        Stm.execute(Query1);
        Stm.execute(Query2);
        
        
        
        }
        catch(Exception e){
        System.out.println(e);
        }
    
    }
    
}
