package banhang;

import java.awt.*;
import javax.swing.*;

public class PointOfSale extends JFrame {
    private JTextField itemName;
    private JTextField itemPrice;
    private JTextField itemQuantity;
    private JButton addItem;
    private JTextArea receipt;
    private double total = 0;

    public PointOfSale() {
        super("Cửa hàng cái gì cũng có");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Item Name:");
        add(nameLabel);
        itemName = new JTextField();
        add(       itemName);

        JLabel priceLabel = new JLabel("Item Price:");
        add(priceLabel);
        itemPrice = new JTextField();
        add(itemPrice);

        JLabel quantityLabel = new JLabel("Item Quantity:");
        add(quantityLabel);
        itemQuantity = new JTextField();
        add(itemQuantity);

        addItem = new JButton("Add Item");
        addItem.addActionListener(e -> {
            String name = itemName.getText();
            double price = Double.parseDouble(itemPrice.getText());
            int quantity = Integer.parseInt(itemQuantity.getText());
            double itemTotal = price * quantity;
            total += itemTotal;
            String itemLine = String.format("%s\t%.2f x %d = %.2f\n", name, price, quantity, itemTotal);
            receipt.append(itemLine);
            itemName.setText("");
            itemPrice.setText("");
            itemQuantity.setText("");
        });
        add(addItem);

        receipt = new JTextArea();
        receipt.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receipt);
        add(scrollPane);

        JButton checkout = new JButton("Checkout");
        checkout.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, String.format("Total: %.2f", total));
            total = 0;
            receipt.setText("");
        });
        add(checkout);

        setVisible(true);
    }

}
