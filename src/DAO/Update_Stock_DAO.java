/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.UpdateStock_Bean;
import DB.Connections;
import java.sql.*;

/**
 *
 * @author karuna
 */
public class Update_Stock_DAO {
    
    Connections Con=new Connections();
    UpdateStock_Bean Bean=new UpdateStock_Bean();
    static Connection Conn;
    static Statement stm;
    
  public  void getUpdate(){
        
        
       String Product_Name=Bean.getProduct_Name();
       int Value=Bean.getAvail_Stock();
    
        
        try{     
        Conn=Con.getCon();
        stm=Conn.createStatement();
        stm.execute("update No_stock set No_Stock='"+Value+"' where Product_Name='"+Product_Name+"';");
        
        }
        
        catch(Exception e){
            
            System.out.print(e);
            
        }
    
    }
    
}
