/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class InvoiceLineDialog extends JDialog {
    private JLabel itemNameLbl;
    private JTextField itemNameField;
    private JTextField itemCountField;
    private JTextField itemPriceField;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
public InvoiceLineDialog(InvoiceFrame frame){
    
itemNameLbl =new JLabel("Item Name:");
itemNameField = new JTextField(20);
itemCountLbl = new JLabel("Item Count");
itemCountField= new JTextField(20);
itemPriceLbl = new JLabel("Item Price");
itemPriceField= new JTextField(20);
okBtn = new JButton("OK");
cancelBtn =new JButton ("Cancel");


okBtn.setActionCommand("newLineOK");
cancelBtn.setActionCommand("newLineCancel");

okBtn.addActionListener(frame.getActionListener());
cancelBtn.addActionListener(frame.getActionListener());
setLayout(new GridLayout(4,2));

add(itemNameField);
add(itemCountField);
add(itemPriceField);
add(itemNameLbl);
add(itemCountLbl);
add(itemPriceLbl);
add(okBtn);
add(cancelBtn);
pack();

}

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }

   


}

    

