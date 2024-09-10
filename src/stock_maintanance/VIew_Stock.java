/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_maintanance;


import DB.Connections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karuna
 */
public class VIew_Stock extends javax.swing.JFrame {

    /**
     * Creates new form VIew_Stock
     */
    
Connections con=new Connections();


Connection Con;
Statement Stm;
ResultSet rt;


    
    
    public VIew_Stock() {
        initComponents();
        
        
    }
    
    

    
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        stock = new javax.swing.JLabel();
        B_Stock = new javax.swing.JButton();
        B_StockDetails = new javax.swing.JButton();
        B_SupplierDetails = new javax.swing.JButton();
        B_BankDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Stock");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        stock.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        stock.setText("VIEW STOCK  DETAILLS");

        B_Stock.setBackground(new java.awt.Color(255, 255, 255));
        B_Stock.setText("stock");
        B_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_StockActionPerformed(evt);
            }
        });

        B_StockDetails.setBackground(new java.awt.Color(255, 255, 255));
        B_StockDetails.setText("Stock Details");
        B_StockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_StockDetailsActionPerformed(evt);
            }
        });

        B_SupplierDetails.setBackground(new java.awt.Color(255, 255, 255));
        B_SupplierDetails.setText("Supplier Details");
        B_SupplierDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SupplierDetailsActionPerformed(evt);
            }
        });

        B_BankDetails.setBackground(new java.awt.Color(255, 255, 255));
        B_BankDetails.setText("Bank Details");
        B_BankDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BankDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1857, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(stock)
                        .addGap(673, 673, 673))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(B_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(B_StockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(B_SupplierDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(B_BankDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(B_BankDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_SupplierDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_StockDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(192, 192, 192)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1908, 1047));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_StockActionPerformed
        // TODO add your handling code here:
        get_Stock();
        
    }//GEN-LAST:event_B_StockActionPerformed

    private void B_StockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_StockDetailsActionPerformed
        // TODO add your handling code here:
        getTable();
    }//GEN-LAST:event_B_StockDetailsActionPerformed

    private void B_SupplierDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SupplierDetailsActionPerformed
        // TODO add your handling code here:
        getSupplier();
    }//GEN-LAST:event_B_SupplierDetailsActionPerformed

    private void B_BankDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BankDetailsActionPerformed
        // TODO add your handling code here:
        get_SupplierBank();
    }//GEN-LAST:event_B_BankDetailsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIew_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIew_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIew_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIew_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIew_Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_BankDetails;
    private javax.swing.JButton B_Stock;
    private javax.swing.JButton B_StockDetails;
    private javax.swing.JButton B_SupplierDetails;
    private javax.swing.JTable Table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stock;
    // End of variables declaration//GEN-END:variables



public void get_Stock(){
    
    
    
    String row,row1,row2,row3;
        String[] col1={"Product_Id","Product_Name","category","Available Stock"};

        DefaultTableModel dt1=new DefaultTableModel(col1,0);
 
    try{
        Con=con.getCon();
        Stm=Con.createStatement();
        rt=Stm.executeQuery("Select * from No_Stock");
        
        while(rt.next()){
             
            row =rt.getString(1);
            row1=rt.getString(2);
            row2=rt.getString(3);
            row3=rt.getString(4);
            
            
             
           
           String row11[]= {row,row1,row2,row3};
           
           dt1.addRow(row11);
           
        }
        
        Table.setModel(dt1);
    
    }
    
    catch(Exception e){
       System.out.print(e);
       
        
    }


}

public void getTable(){
        
        String row,row1,row2,row3,row4,row5,row6,row7,row8;
        String[] col={"Product_Id","Product_Name","Supplier_Name","Supplier_Id","category","Description","contact","needed_stock","Price_PP"};

        DefaultTableModel dt=new DefaultTableModel(col,0);
 
    try{
        Con=con.getCon();
        Stm=Con.createStatement();
        rt=Stm.executeQuery("Select * from stock");
        
        while(rt.next()){
             
            row =rt.getString(1);
            row1=rt.getString(2);
            row2=rt.getString(3);
            row3=rt.getString(4);
            row4=rt.getString(5);
            row5=rt.getString(6);
            row6=rt.getString(7);
            row7=rt.getString(8);
            row8=rt.getString(9);
            
             
           
           String row111[]= {row,row1,row2,row3,row4,row5,row6,row7,row8};
           
           dt.addRow(row111);
           
        }
        
        Table.setModel(dt);
    
    }
    
    catch(Exception e){
       System.out.print(e);
       
        
    }
 
}
    
public void getSupplier(){
        
        String row,row1,row2,row3,row4,row5,row6,row7,row8,row9,row10;
        String[] col11={"ID","Supplier_Name","Company_Name","GSTINNo","Contact_No_1","Contact_No_2","EMail","Address","Supply_Category","Website","ODD"};

        DefaultTableModel dt=new DefaultTableModel(col11,0);
 
    try{
        Con=con.getCon();
        Stm=Con.createStatement();
        rt=Stm.executeQuery("Select * from Supplier_details");
        
        while(rt.next()){
             
            row =rt.getString(1);
            row1=rt.getString(2);
            row2=rt.getString(3);
            row3=rt.getString(4);
            row4=rt.getString(5);
            row5=rt.getString(6);
            row6=rt.getString(7);
            row7=rt.getString(8);
            row8=rt.getString(9);
            row9=rt.getString(10);
            row10=rt.getString(11);
            
             
           
           String row112[]= {row,row1,row2,row3,row4,row5,row6,row7,row8,row9,row10};
           
           dt.addRow(row112);
           
        }
        
        Table.setModel(dt);
    
    }
    
    catch(Exception e){
       System.out.print(e);
       
        
    }
 
}

public void get_SupplierBank(){
        
        String row,row1,row2,row3,row4,row5,row6,row7,row8,row9,row10;
        String[] col11={ "Id","Bank_Name","Branch_Name","Account_No","IFSC_Code","UPI_Id"};

        DefaultTableModel dt=new DefaultTableModel(col11,0);
 
    try{
        Con=con.getCon();
        Stm=Con.createStatement();
        rt=Stm.executeQuery("Select * from Supplier_Bank_details");
        
        while(rt.next()){
             
            row =rt.getString(1);
            row1=rt.getString(2);
            row2=rt.getString(3);
            row3=rt.getString(4);
            row4=rt.getString(5);
            row5=rt.getString(6);
            
             
           
           String row113[]= {row,row1,row2,row3,row4,row5};
           
           dt.addRow(row113);
           
        }
        
        Table.setModel(dt);
    
    }
    
    catch(Exception e){
       System.out.print(e);
       
        
    }
}

}

