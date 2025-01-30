package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    //Globally define for use anywhere
    JButton login ,signup,clear;
    JTextField cardTextfield;
    JPasswordField pinTextfield;

    Login() {
        setTitle("ATM");

        //set layout of atm logo
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        //for welcome to atm
        JLabel text = new JLabel("Wlcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        //card number
        JLabel cardno = new JLabel("CardNo");
        cardno.setFont(new Font("Railway", Font.BOLD, 38));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        //input text from user for card
        cardTextfield = new JTextField();
        cardTextfield.setBounds(300, 150, 230, 30);
        cardTextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextfield);

         //pin number
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Railway", Font.BOLD, 38));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

         //input text from user for pin
        pinTextfield = new JPasswordField();
        pinTextfield.setBounds(300, 220, 230, 30);
        pinTextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextfield);

        //login Button
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        //clear Button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        //sign up  Button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);


        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    // for button action performed , do we overwrite this abstract method of actionpermoed
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextfield.setText("");
            pinTextfield.setText("");

        } else if (ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextfield.getText();
            String pinnumber = pinTextfield.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"' ";
            try{
               ResultSet rs =  conn.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Transaction(pinnumber).setVisible(true);
               } else{
                   JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
               }

            } catch(Exception e){
                System.out.println(e);
            }


        } else if (ae.getSource() == signup){

            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }


}
