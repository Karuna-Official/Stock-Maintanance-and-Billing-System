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
public class Add_Supplier_Bean {
    
    static String Supplier_Details,Bank_Details;

    public static String getSupplier_Details() {
        return Supplier_Details;
    }

    public static void setSupplier_Details(String Supplier_Details) {
        Add_Supplier_Bean.Supplier_Details = Supplier_Details;
    }

    public static String getBank_Details() {
        return Bank_Details;
    }

    public static void setBank_Details(String Bank_Details) {
        Add_Supplier_Bean.Bank_Details = Bank_Details;
    }
    
    
}
