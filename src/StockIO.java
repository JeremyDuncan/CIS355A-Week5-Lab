
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeremy Duncan
 */
public class StockIO {
    // attributes
    private String fileName;
    
    // constructor
    public StockIO() {
        fileName = "Stock.txt";
    }
     public StockIO(String fileName) {
        setFileName(fileName);
    }
     
    // behaviors
     public ArrayList<Stock> getData() {
         // create Array List
         ArrayList<Stock> data = new ArrayList<Stock>();
         
         // load Array List with file data
         
         //return the Array List
         return data;
    
    } 
     
     public void saveData(ArrayList<Stock> data) {
         //Apple,100,55.0,80.0

         try {
            // create a pipe to file
            BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName)); 
            
            // write the sticks by cycling through the data
            for(int i = 0; i< data.size(); i++) {
                Stock stk = data.get(i);
                outFile.write(stk.getCompanyName() + ",");
                outFile.write("" + stk.getNumberOfShares() + ",");
                outFile.write("" + stk.getPurchasePrice());
                outFile.write("" + stk.getCurrentPrice());
                outFile.newLine(); // drops to new line
            }
            
            // close the file
            outFile.close();
         }
         catch(IOException ex) {
             JOptionPane.showMessageDialog(null, "Error. Unable to wriite to file: " + ex.getMessage(), 
                     fileName, JOptionPane.ERROR_MESSAGE);
             
         }
         
     }
    
    // getters and setter
     public String getFiileName() {
         return fileName;
     }
     
     public void setFileName(String fileName) {
         if(fileName.length() > 0){
             this.fileName = fileName; 
         } else {
             this.fileName = "Stocks.txt";
         }   
     } 
}
