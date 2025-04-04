package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signuptwo extends JFrame implements ActionListener {


    JTextField aadhar, pan;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox<String> religion, category, income, education, occupation;
    String formno;

    public Signuptwo(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionlabel = new JLabel("Religion:");
        religionlabel.setFont(new Font("Arial", Font.BOLD, 20));
        religionlabel.setBounds(100, 140, 100, 30);
        add(religionlabel);

        String valreligion[] = {"Jain", "Hindu", "Sikh", "Christian", "Muslim", "Others"};
        religion = new JComboBox<>(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categorylabel = new JLabel("Category: ");
        categorylabel.setFont(new Font("Arial", Font.BOLD, 20));
        categorylabel.setBounds(100, 190, 150, 30);
        add(categorylabel);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox<>(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 150, 30);
        add(incomeLabel);

        String valincome[] = {"NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 10,00,000"};
        income = new JComboBox<>(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educationLabel = new JLabel("Qualification: ");
        educationLabel.setFont(new Font("Arial", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);

        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        education = new JComboBox<>(educationValues);
        education.setBounds(300, 290, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupationLabel = new JLabel("Occupation: ");
        occupationLabel.setFont(new Font("Arial", Font.BOLD, 20));
        occupationLabel.setBounds(100, 340, 200, 30);
        add(occupationLabel);

        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Retired", "Student", "Other"};
        occupation = new JComboBox<>(occupationValues);
        occupation.setBounds(300, 340, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panLabel = new JLabel("Pan Number: ");
        panLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panLabel.setBounds(100, 390, 200, 30);
        add(panLabel);

        pan = new JTextField();
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        pan.setBounds(300, 390, 400, 30);
        add(pan);

        JLabel aadharLabel = new JLabel("Aadhar Number: ");
        aadharLabel.setFont(new Font("Arial", Font.BOLD, 20));
        aadharLabel.setBounds(100, 440, 200, 30);
        add(aadharLabel);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Arial", Font.BOLD, 14));
        aadhar.setBounds(300, 440, 400, 30);
        add(aadhar);

        JLabel seniorCitizenLabel = new JLabel("Senior Citizen: ");
        seniorCitizenLabel.setFont(new Font("Arial", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 490, 200, 30);
        add(seniorCitizenLabel);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 490, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 490, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);

        JLabel existingLabel = new JLabel("Existing Account: ");
        existingLabel.setFont(new Font("Arial", Font.BOLD, 20));
        existingLabel.setBounds(100, 540, 200, 30);
        add(existingLabel);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 540, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(400, 540, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingAccGroup = new ButtonGroup();
        existingAccGroup.add(eyes);
        existingAccGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
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
            String query = "INSERT INTO signuptwo VALUES('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seductaion + "','" + soccupation + "','" + span + "','" + saadhar + "','" + sseniorcitizen + "','" + sexistingAcc + "')";
            c.s.executeUpdate(query);
            setVisible(false);
            new Signupthree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signuptwo("");
    }
}