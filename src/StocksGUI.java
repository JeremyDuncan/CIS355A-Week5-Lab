
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jeremy Duncan
 */
public class StocksGUI extends javax.swing.JFrame {

    //class level reference or attributes
    private DefaultListModel<Stock> model;

    /**
     * Creates new form StocksGUI
     */
    public StocksGUI() {
        // create the model for Jlist
        model = new DefaultListModel<Stock>();

        initComponents();

        // set form to center of screen
        this.setLocationRelativeTo(null);

        // calculate total portfolio value
        calculateTotalValue();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMainTabs = new javax.swing.JTabbedPane();
        pnlStockList = new javax.swing.JPanel();
        scrStocks = new javax.swing.JScrollPane();
        lstStocks = new javax.swing.JList<>();
        lblProfitLoss = new javax.swing.JLabel();
        btnRemoveStock = new javax.swing.JButton();
        lblTotalValue = new javax.swing.JLabel();
        pnlAddStock = new javax.swing.JPanel();
        lblStockName = new javax.swing.JLabel();
        txtStockName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblPurchasePrice = new javax.swing.JLabel();
        txtPurchasePrice = new javax.swing.JTextField();
        lblCurrentPrice = new javax.swing.JLabel();
        txtCurrentPrice = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        mnbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stocks4U App");

        jtpMainTabs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lstStocks.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lstStocks.setModel(model);
        lstStocks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStocksValueChanged(evt);
            }
        });
        scrStocks.setViewportView(lstStocks);

        lblProfitLoss.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProfitLoss.setText("Profit / Loss");

        btnRemoveStock.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRemoveStock.setText("Remove Stock");
        btnRemoveStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStockActionPerformed(evt);
            }
        });

        lblTotalValue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotalValue.setText("Total Value:");

        javax.swing.GroupLayout pnlStockListLayout = new javax.swing.GroupLayout(pnlStockList);
        pnlStockList.setLayout(pnlStockListLayout);
        pnlStockListLayout.setHorizontalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrStocks)
                    .addGroup(pnlStockListLayout.createSequentialGroup()
                        .addComponent(lblProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(pnlStockListLayout.createSequentialGroup()
                        .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnRemoveStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlStockListLayout.setVerticalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProfitLoss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveStock)
                    .addComponent(lblTotalValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("List", pnlStockList);

        lblStockName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblStockName.setText("Stock name:");

        txtStockName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblPurchasePrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPurchasePrice.setText("Purchase Price:");

        txtPurchasePrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblCurrentPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCurrentPrice.setText("Current Price:");

        txtCurrentPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnAddStock.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddStockLayout = new javax.swing.GroupLayout(pnlAddStock);
        pnlAddStock.setLayout(pnlAddStockLayout);
        pnlAddStockLayout.setHorizontalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblStockName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblPurchasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnAddStock)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        pnlAddStockLayout.setVerticalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStockName)
                    .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasePrice)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPrice)
                    .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnAddStock)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("Add Stock", pnlAddStock);

        mnuFile.setText("File");

        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnuFile.add(mniOpen);

        mniSave.setText("Save");
        mniSave.setActionCommand("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mniSave);
        mnuFile.add(jSeparator1);

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        mnbMain.add(mnuFile);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMainTabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMainTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jtpMainTabs.getAccessibleContext().setAccessibleName("tabbed pane");
        jtpMainTabs.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        if (txtStockName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Stock name is required", "Error Missing Information", JOptionPane.ERROR_MESSAGE);
            txtStockName.requestFocus();
            return;
        }
        if (txtQuantity.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Quantity is required", "Error Missing Information", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        if (txtPurchasePrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Purchase price is required", "Error Missing Information", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
            return;
        }
        if (txtCurrentPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Current price is required", "Error Missing Information", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
            return;
        }

        // error handling / Input ==============================================
        double purchasePrice = 0.0;
        try {
            purchasePrice = Double.parseDouble(txtPurchasePrice.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input. Please use numbers only", "Error Invalid data", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
        }

        double currentPrice = 0.0;
        try {
            currentPrice = Double.parseDouble(txtCurrentPrice.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input. Please use numbers only", "Error Invalid data", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
        }

        double quantity = 0.0;
        try {
            quantity = Double.parseDouble(txtQuantity.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input. Please use numbers only", "Error Invalid data", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
        }

        // get input
        String stockName = txtStockName.getText();

        // create a stock
        Stock stk = new Stock(stockName, quantity, purchasePrice, currentPrice);

        // add the stock object to the Jlist
        model.addElement(stk);

        // update the total value label
        calculateTotalValue();

        // reset form for next stock
        txtStockName.setText("");
        txtQuantity.setText("");
        txtPurchasePrice.setText("");
        txtCurrentPrice.setText("");
        txtStockName.requestFocus();
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void lstStocksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStocksValueChanged
        // get stock and show profit / loss

        Stock stk = lstStocks.getSelectedValue();

        if (stk != null) {
            double profitLoss = stk.getProfitLoss();
            DecimalFormat fmt = new DecimalFormat("#, ##0.00");
            if (profitLoss > 0.0) {
                lblProfitLoss.setText("Profit of " + fmt.format(profitLoss));
            } else if (profitLoss < 0.0) {
                lblProfitLoss.setText("Loss of " + fmt.format(profitLoss));
            } else {
                lblProfitLoss.setText("Break-even with zero profit/loss");
            }
        }

    }//GEN-LAST:event_lstStocksValueChanged

    private void btnRemoveStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStockActionPerformed
        // get stock position
        int position = lstStocks.getSelectedIndex();

        // if selected, remove the stock
        if (position >= 0) {
            model.remove(position);
            lblProfitLoss.setText("Profit / Loss");

            // update the total value label
            calculateTotalValue();
        }

        // update the total value label
        calculateTotalValue();
    }//GEN-LAST:event_btnRemoveStockActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        //get filename
        String fileName = JOptionPane.showInputDialog("Enter filename: ");

        // save data to file
        StockIO outToFile = new StockIO(fileName);

        ArrayList<Stock> data = new ArrayList<Stock>();

        for (int i = 0; i < model.size(); i++) {
            Stock stk = model.elementAt(i);
            data.add(stk);
        }

        outToFile.saveData(data);
        
        JOptionPane.showMessageDialog(this, "Data was saved to the file");
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        // get file name
        String fileName = JOptionPane.showInputDialog("Enter filename: ");
        
        // get data from file
        StockIO inFromFile = new StockIO(fileName);
        
        ArrayList<Stock> data = inFromFile.getData();
        
        // clear model
        // then copy new data to model
        model.clear();
        
        for(int i = 0; i < data.size(); i++) {
            Stock stk = data.get(i);
            model.addElement(stk);
        }
           
        // update the total value
        calculateTotalValue();
               
    }//GEN-LAST:event_mniOpenActionPerformed

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
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StocksGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnRemoveStock;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jtpMainTabs;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStockName;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JList<Stock> lstStocks;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JPanel pnlAddStock;
    private javax.swing.JPanel pnlStockList;
    private javax.swing.JScrollPane scrStocks;
    private javax.swing.JTextField txtCurrentPrice;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables

    private void calculateTotalValue() {
        double totalValue = 0.0;

        // go through each stock in portfolio
        // and calculate total value 
        for (int i = 0; i < model.size(); i++) {
            Stock stk = model.elementAt(i);
            totalValue += stk.getCurrentPrice() * stk.getNumberOfShares();
        }

        //show total value
        DecimalFormat fmt = new DecimalFormat("$#,##0.00");
        lblTotalValue.setText("Total Value: " + fmt.format(totalValue));

    }
}
