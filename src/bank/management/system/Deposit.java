package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    JTextField amount;
    JButton back, deposit;
    String pinnumber;
    Deposit(String pinnumber ) {
        this.pinnumber = pinnumber;
        setLayout(null);

        // Load and scale the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); // Correctly initialize the ImageIcon with the scaled image
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter amount to Deposit");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 16)); // Ensure "Raleway" is available
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        deposit.addActionListener(this); // Add action listener to the deposit button
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this); // Add action listener to the back button
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed
    }


    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()== deposit){
           String number = amount.getText();
           Date date=new Date();
           if(number.equals("")){
               JOptionPane.showMessageDialog(null,"Please Enter Amount To Deposit ");
           } else {
               try {
                   Conn conn = new Conn();
                   String query = "insert into bank values('" + pinnumber + "','" + date + "','Deposit','" + number + "')";
                   conn.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null, "Rs " + number + " Deposited Successfully");
                   setVisible(false);
                   new Transaction(pinnumber).setVisible(true);
               }catch (Exception e){
                   System.out.println(e);

               }
           }
       } else if(ae.getSource()== back){
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
       }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}