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
public class UpdateStock_Bean {
    
    static String Product_Name;

    public static String getProduct_Name() {
        return Product_Name;
    }

    public static void setProduct_Name(String Product_Name) {
        UpdateStock_Bean.Product_Name = Product_Name;
    }

    public static int getAvail_Stock() {
        return Avail_Stock;
    }

    public static void setAvail_Stock(int Avail_Stock) {
        UpdateStock_Bean.Avail_Stock = Avail_Stock;
    }
    static int Avail_Stock;
    
}
