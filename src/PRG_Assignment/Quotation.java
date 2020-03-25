/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRG_Assignment;
import static PRG_Assignment.Stock.StockNames;
import static PRG_Assignment.Stock.StockPrices;
import static PRG_Assignment.Stock.StockQuantity;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.ArrayList;
/**
 *
 * @author Ruaan Cloete
 */
public class Quotation extends javax.swing.JFrame {
   public static ArrayList<String> ReceiptItem=new ArrayList<>();
    public static ArrayList<Integer> ReceiptQuantity=new ArrayList<>();
    public static ArrayList<Double> ReceiptPrice=new ArrayList<>();
    public static int count =0;
    public static double FinalTotal0=0;

 
    public Quotation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddItemsButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ItemNameLabel2 = new javax.swing.JLabel();
        QuantityLabel3 = new javax.swing.JLabel();
        EnterItemNameTextField1 = new javax.swing.JTextField();
        EnterQuantityTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CheckoutButton2 = new javax.swing.JButton();
        CancelButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddItemsButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AddItemsButton1.setText("Add Items");
        AddItemsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemsButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Sales");

        ItemNameLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ItemNameLabel2.setText("Item Name");

        QuantityLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        QuantityLabel3.setText("Quantity");

        EnterItemNameTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        EnterQuantityTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Receipt");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        CheckoutButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CheckoutButton2.setText("Checkout");
        CheckoutButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButton2ActionPerformed(evt);
            }
        });

        CancelButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CancelButton3.setText("Cancel");
        CancelButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemNameLabel2)
                                    .addComponent(QuantityLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(231, 231, 231)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EnterQuantityTextField2)
                                    .addComponent(EnterItemNameTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddItemsButton1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(231, 231, 231)
                                .addComponent(CheckoutButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(CancelButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ItemNameLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuantityLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(EnterItemNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterQuantityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddItemsButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(CheckoutButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(CancelButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemsButton1ActionPerformed
        boolean found=true;
        String name = EnterItemNameTextField1.getText();
        found = StockNames.contains(name);
        int index = StockNames.indexOf(name);
        int q = Integer.parseInt(EnterQuantityTextField2.getText());
        if(found==true){
            if(q<StockQuantity.get(index)){
                StockQuantity.set(index,(StockQuantity.get(index)-q));
                ReceiptItem.add(StockNames.get(index));
                ReceiptQuantity.add(q);
                ReceiptPrice.add(StockPrices.get(index));
                FinalTotal0=FinalTotal0+(ReceiptQuantity.get(index)*ReceiptPrice.get(index));
                if(count==0){
                jTextArea1.setText("Item Name\tQuantity\tPrice\n");
                jTextArea1.append("\n");
                count=count+1;
                jTextArea1.append(StockNames.get(index)+"\t"+q+"\t"+StockPrices.get(index)+"\n");
        }else{
                jTextArea1.append(StockNames.get(index)+"\t"+q+"\t"+StockPrices.get(index)+"\n");
                }
                
            }else showMessageDialog(null,"Insufficient stock");
        }else showMessageDialog(null,"Stock unaivalaible");
        
    }//GEN-LAST:event_AddItemsButton1ActionPerformed

    private void CheckoutButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutButton2ActionPerformed
        new Receipt().setVisible(true);
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_CheckoutButton2ActionPerformed

    private void CancelButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton3ActionPerformed
        new CashiersPage().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CancelButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quotation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemsButton1;
    private javax.swing.JButton CancelButton3;
    private javax.swing.JButton CheckoutButton2;
    private javax.swing.JTextField EnterItemNameTextField1;
    private javax.swing.JTextField EnterQuantityTextField2;
    private javax.swing.JLabel ItemNameLabel2;
    private javax.swing.JLabel QuantityLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}