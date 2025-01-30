package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener { // Inherit from JFrame

    long random; // Instance variable for random number
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, stateTextField, cityTextField, pinTextField; // Removed extra comma
    JButton next;
    JRadioButton male, female, others, married, unmarried;
    JDateChooser dateChooser;

    public SignupOne() {
        setLayout(null); // Set layout for this JFrame

        Random ran = new Random(); // for randomize form number
        random = Math.abs(ran.nextLong() % 9000L) + 1000L; // Use instance variable

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Arial", Font.BOLD, 36)); // Changed font to Arial
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Arial", Font.BOLD, 22)); // Changed font to Arial
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField(); // Use instance variable
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel Fname = new JLabel("Father's Name: ");
        Fname.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        Fname.setBounds(100, 190, 150, 30);
        add(Fname);

        fnameTextField = new JTextField(); // Use instance variable
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dobLabel = new JLabel("Date Of Birth:");
        dobLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        dobLabel.setBounds(100, 240, 150, 30);
        add(dobLabel);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        emailLabel.setBounds(100, 340, 200, 30);
        add(emailLabel);

        emailTextField = new JTextField(); // Use instance variable
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        emailTextField.setBounds(300, 340, 400, 30); // Corrected bounds
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        others = new JRadioButton("Others");
        others.setBounds(630, 390, 80, 30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);

        JLabel address = new JLabel("ADDRESS: ");
        address.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField(); // Use instance variable
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField(); // Use instance variable
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField(); // Use instance variable
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Arial", Font.BOLD, 20)); // Changed font to Arial
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pinTextField = new JTextField(); // Use instance variable
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);

        // Create and add the "Next" button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE); // Set foreground color for text
        next.setFont(new Font("Arial", Font.BOLD, 14)); // Changed font to Arial
        next.setBounds(620, 660, 80, 30); // Set bounds for the button
        next.addActionListener(this);
        add(next); // Add the button to the panel

        // Set JFrame properties
        setTitle("Signup"); // Set title of the JFrame
        getContentPane().setBackground(Color.WHITE); // Set background color
        setSize(850, 800); // Set size of the JFrame
        setLocation(350, 10); // Set location of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setVisible(true); // Make the JFrame visible
    }

    public void actionPerformed(ActionEvent ae){
        String formno = " " + random; //long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getToolTipText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        } else if(female.isSelected()){
            gender= "Female";
        }
        String email= emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital= "Married";
        } else if(unmarried.isSelected()){
            marital="UnMarried";
        } else if (others.isSelected()){
            marital= "Others";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{

            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            } else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupOne(); // Create an instance of SignupOne
    }
}