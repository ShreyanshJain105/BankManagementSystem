package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    JLabel mini, card, balance;
    String pinnumber;

    MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber;

        setTitle("MINI STATEMENT");
        setLayout(null);

        mini = new JLabel();
        mini.setVerticalAlignment(SwingConstants.TOP);
        add(mini);

        JLabel bank = new JLabel("Shreyansh's Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);

        card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);



        try {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("SELECT * FROM login WHERE pinnumber = '" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "xxxxxxxx" + rs.getString("cardnumber").substring(12));
            }

            ResultSet rs2 = conn.s.executeQuery("SELECT * FROM bank WHERE pinnumber='" + pinnumber + "'");
            while (rs2.next()) {
                if (rs2.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs2.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs2.getString("amount"));
                }
            }
            balance.setText("Your Current Account balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

                try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("SELECT * FROM bank WHERE pinnumber='" + pinnumber + "'");
            StringBuilder miniText = new StringBuilder("<html>");
            while (rs.next()) {
                miniText.append(rs.getString("date"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rs.getString("type"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rs.getString("amount"))
                        .append("<br><br>");
            }
            miniText.append("</html>");
            mini.setText(miniText.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        mini.setBounds(20, 140, 400, 200);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // Implement actionPerformed if needed
    }

    public static void main(String[] args) {
        new MiniStatement(""); // Replace with a valid PIN number for testing
    }
}