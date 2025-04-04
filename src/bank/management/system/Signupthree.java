package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signupthree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    JButton submit, cancel;
    String formno;

    Signupthree(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 150, 20);
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.white);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350, 180, 200, 20);
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.white);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 220, 200, 20);
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.white);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350, 220, 250, 20);
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.white);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1206");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetails = new JLabel("YOUR 16 DIGIT CARD NUMBER");
        carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetails.setBounds(100, 330, 300, 15);
        add(carddetails);

        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pindetails = new JLabel("YOUR 4 DIGIT PIN NUMBER");
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100, 400, 300, 15);
        add(pindetails);

        JLabel service = new JLabel("SERVICES REQUIRED");
        service.setFont(new Font("Raleway", Font.BOLD, 22));
        service.setBounds(100, 450, 300, 30);
        add(service);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("E-MAIL ALERT");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above details are correct to the best of my knowledge.");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 660, 600, 30);
        add(c7);

        c8 = new JCheckBox("Terms & Conditions");
        c8.setBackground(Color.white);
        c8.setFont(new Font("Raleway", Font.BOLD, 12));
        c8.setBounds(100, 700, 600, 30);
        add(c8);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 740, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 740, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = ""+ Math.abs((random.nextLong() % 90000000L )+ 1585010000000000L);
            String pinnumber = ""+ Math.abs((random.nextLong() %9000L)+1000L);

            String facility = "";
            if (c1.isSelected()) {
                facility  = facility + "ATM Card";
            }
            else if (c2.isSelected()) {
                facility= facility + "Internet Banking";
            }
            if (c3.isSelected()) {
                facility = facility + "Mobile Banking";
            }
            if (c4.isSelected()) {
                facility= facility + "EMAIL Alerts";
            }
            if (c5.isSelected()) {
                facility= facility + "Cheque Book";
            }
            if (c6.isSelected()) {
                facility= facility + "E-Statement";
            }


            try {
                if (accountType == null) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                } else if (!c8.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Check Terms & Conditions");
                } else {
                    Conn conn = new Conn();
                    String query1 = "INSERT INTO signupthree VALUES('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                    conn.s.executeUpdate(query1);
                    String query2 = "INSERT INTO login VALUES('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == cancel) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Signupthree("");
    }
}