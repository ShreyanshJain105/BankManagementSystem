package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signupthree extends JFrame implements ActionListener { // Extend JFrame

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    JButton submit, cancel;
    String formno;

    Signupthree(String formno) {
        this.formno = formno;
        setLayout(null); // Set layout to null for absolute positioning

        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1); // Add the label to the frame

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

        // Select only one choice of account
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        // Card and number
        JLabel card = new JLabel("Card Number ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1206"); // Dummy card number
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetails = new JLabel("YOUR 16 DIGIT CARD NUMBER"); // Dummy card number
        carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetails.setBounds(100, 330, 300, 15);
        add(carddetails);

        // Pin and pin number
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX"); // Dummy pin number
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pindetails = new JLabel("YOUR 4 DIGIT PIN NUMBER"); // Dummy pin number
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100, 400, 300, 15);
        add(pindetails);

        JLabel service = new JLabel("SERVICES REQUIRED"); // Dummy service label
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

        setSize(850, 820); // Set size of the JFrame
        setLocation(350, 0); // Set location of the JFrame
        setVisible(true); // Make the JFrame visible
    }

    public void actionPerformed(ActionEvent ae) { // Corrected method name
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

            // Validate account type length
            if (accountType != null && accountType.length() > 50) { // Adjust the number based on your column size
                JOptionPane.showMessageDialog(null, "Account type exceeds maximum length.");
                return;
            }

            Random random = new Random();
            // Generate a 16-digit card number
            String cardnumber = String.format("%016d", Math.abs(random.nextLong() % 10000000000000000L));
            String pinnumber = String.format("%04d", Math.abs(random.nextInt(9000) + 1000)); // Ensure PIN is 4 digits

            // Check the length of the card number before inserting
            if (cardnumber.length() > 16) {
                JOptionPane.showMessageDialog(null, "Card number exceeds maximum length.");
                return;
            }

            StringBuilder facility = new StringBuilder(); // Use StringBuilder for multiple selections
            if (c1.isSelected()) {
                facility.append("ATM Card, ");
            }
            if (c2.isSelected()) {
                facility.append("Internet Banking, ");
            }
            if (c3.isSelected()) {
                facility.append("Mobile Banking, ");
            }
            if (c4.isSelected()) {
                facility.append("EMAIL Alerts, ");
            }
            if (c5.isSelected()) {
                facility.append("Cheque Book, ");
            }
            if (c6.isSelected()) {
                facility.append("E-Statement, ");
            }

            if (facility.length() > 0) {
                facility.setLength(facility.length() - 2);
            }

            //validate
            if (facility.length() > 255) {
                JOptionPane.showMessageDialog(null, "Facility exceeds maximum length.");
                return;
            }

            try {
                if (accountType == null) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                } else if (!c8.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Check Terms & Conditions");
                } else {
                    Conn conn = new Conn(); // Ensure Conn class is defined
                    String query1 = "insert into signupthree values('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                    conn.s.executeUpdate(query1);
                    String query2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                    conn.s.executeUpdate(query2); // Execute the second query

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                }
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);

            } catch (Exception e) {
                e.printStackTrace(); // Print the stack trace for better debugging
            }
        } else if (ae.getSource() == cancel) {
            // Handle cancel action (e.g., close the window or go back)
            this.setVisible(false); // Close the current frame
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Signupthree(""); // Create an instance of Signupthree
    }
}