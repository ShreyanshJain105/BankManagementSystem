package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener { // Inherit from JFrame

    long random; // Instance variable for random number
    JTextField aadhar, pan; // Removed extra comma
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox<String> religion, category, income, education, occupation;
    String formno;

    public Signuptwo(String formno) {
        this.formno = formno;
        random = (long) (Math.random() * 10000); // Initialize random number
        setLayout(null); // Set layout for this JFrame

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 22)); // Changed font to Arial
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionlabel = new JLabel("Religion:");
        religionlabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        religionlabel.setBounds(100, 140, 100, 30);
        add(religionlabel);

        // Dropdown table with combobox class
        String valreligion[] = {"Jain", "Hindu", "Sikh", "Christian", "Muslim", "Others"};
        religion = new JComboBox<>(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categorylabel = new JLabel("Category: ");
        categorylabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        categorylabel.setBounds(100, 190, 150, 30);
        add(categorylabel);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox<>(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        incomeLabel.setBounds(100, 240, 150, 30);
        add(incomeLabel);

        String valincome[] = {"NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 10,00,000"};
        income = new JComboBox<>(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel Education = new JLabel("Educational / ");
        Education.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Education.setBounds(100, 290, 200, 30);
        add(Education);

        JLabel Qualification = new JLabel("Qualification: ");
        Qualification.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Qualification.setBounds(100, 315, 200, 30);
        add(Qualification);

        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"}; // Corrected spelling
        education = new JComboBox<>(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel Occupation = new JLabel("Occupation: ");
        Occupation.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);

        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Retired", "Student", "Other"}; // Corrected spelling
        occupation = new JComboBox<>(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panno = new JLabel("Pan Number: ");
        panno.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        panno.setBounds(100, 440, 200, 30);
        add(panno);

        pan = new JTextField(); // Use instance variable
        pan.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel aadharno = new JLabel("Aadhar Number: ");
        aadharno.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        aadharno.setBounds(100, 490, 200, 30);
        add(aadharno);

        aadhar = new JTextField(); // Use instance variable
        aadhar.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel Seniorcitizenlabel = new JLabel("Senior Citizen: ");
        Seniorcitizenlabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Seniorcitizenlabel.setBounds(100, 540, 200, 30);
        add(Seniorcitizenlabel);

        syes = new JRadioButton("Yes"); // Use instance variable
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No"); // Use instance variable
        sno.setBounds(400, 540, 100, 30); // Adjusted position
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(syes);
        seniorcitizen.add(sno);

        JLabel Existinglabel = new JLabel("Existing Account: ");
        Existinglabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Existinglabel.setBounds(100, 590, 200, 30);
        add(Existinglabel);

        eyes = new JRadioButton("Yes"); // Use instance variable
        eyes.setBounds(300, 590, 100, 30); // Adjusted position
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No"); // Use instance variable
        eno.setBounds(400, 590, 100, 30); // Adjusted position
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup ExistingAcc = new ButtonGroup();
        ExistingAcc.add(eyes);
        ExistingAcc.add(eno);

        // Create and add the "Next" button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE); // Set foreground color for text
        next.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        next.setBounds(620, 660, 80, 30); // Set bounds for the button
        next.addActionListener(this);
        add(next); // Add the button to the panel

        // Set JFrame properties
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2"); // Set title of the JFrame
        getContentPane().setBackground(Color.WHITE); // Set background color
        setSize(850, 800); // Set size of the JFrame
        setLocation(350, 10); // Set location of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setVisible(true); // Make the JFrame visible
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seductaion = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String sseniorcitizen = null;
        if (syes.isSelected()) {
            sseniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            sseniorcitizen = "No";
        }

        String sexistingAcc = null;
        if (eyes.isSelected()) {
            sexistingAcc = "Yes";
        } else if (eno.isSelected()) {
            sexistingAcc = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seductaion + "','" + soccupation + "','" + span + "','" + saadhar + "','" + sseniorcitizen + "','" + sexistingAcc + "')";
            c.s.executeUpdate(query);

            // Proceed to the next step (e.g., signup three)
            setVisible(false);
            new Signupthree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signuptwo(" "); // Create an instance of Signuptwo
    }
}