/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Beans.Add_Stock_Baen;
import Beans.Login_bean;
import DB.Connections;
import java.sql.*;
import javax.swing.*;
import static javax.swing.UIManager.getString;

public class DB_Add_Stock {
    
    Add_Stock_Baen Stock=new Add_Stock_Baen();
   Connections con=new Connections();
    static Connection Conn;
    static Statement stm;
    
    public void DB_Add_Stock(){
    
        try{
        
            String Value=Stock.getQuery_values();
            String Value1=Stock.getQuery_value1();
            Conn=con.getCon();
            stm=Conn.createStatement();
            String Query="insert into Stock(Product_Name,Supplier_Name,Supplier_Id,category,Description,contact,needed_stock,Price_PP) values "+Value+";";
            String Query1="insert into No_Stock(Product_Name,Category,GST,Price_PP) Values"+Value1+";";
            stm.execute(Query);
            stm.execute(Query1);
            
            
        }
        catch(Exception e){}
        
    }
    
}
