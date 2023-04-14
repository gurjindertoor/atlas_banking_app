package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    long random;
    JTextField firstNameTextField, middleNameTextField, lastNameTextField, addressTextField, cityTextField, stateTextField, zipcodeTextField, emailTextField, confirmEmailTextField;
    JButton next;
    JDateChooser dateChooser;

    SignupTwo(){

        setLayout(null);
        setTitle("New Account Application - Page 2");

        // JLabel application = new JLabel("New Account Application");
        // application.setFont(new Font("Raleway", Font.BOLD, 38));
        // application.setBounds(140, 20, 600, 40);
        // add(application);

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel gender = new JLabel("Gender*:");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(100, 140, 200, 30);
        add(gender);

        firstNameTextField = new JTextField();
        firstNameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        firstNameTextField.setBounds(300, 140, 400, 25);
        add(firstNameTextField);

        // JLabel middleName = new JLabel("Middle Name:");
        // middleName.setFont(new Font("Raleway", Font.BOLD, 18));
        // middleName.setBounds(100, 200, 200, 30);
        // add(middleName);

        // middleNameTextField = new JTextField();
        // middleNameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        // middleNameTextField.setBounds(300, 200, 400, 25);
        // add(middleNameTextField);

        JLabel maritalStatus = new JLabel("Marital Status*:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 18));
        maritalStatus.setBounds(100, 200, 200, 30);
        add(maritalStatus);

        lastNameTextField = new JTextField();
        lastNameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        lastNameTextField.setBounds(300, 200, 400, 25);
        add(lastNameTextField);

        JLabel occupation = new JLabel("Occupation*:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        occupation.setBounds(100, 260, 200, 30);
        add(occupation);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 260, 400, 30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        JLabel education = new JLabel("Education*:");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        education.setBounds(100, 320, 200, 30);
        add(education);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        addressTextField.setBounds(300, 320, 400, 25);
        add(addressTextField);

        JLabel income = new JLabel("Income*:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100, 380, 200, 30);
        add(income);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        cityTextField.setBounds(300, 380, 400, 25);
        add(cityTextField);

        JLabel phoneNumber = new JLabel("Phone Number*:");
        phoneNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        phoneNumber.setBounds(100, 440, 200, 30);
        add(phoneNumber);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        stateTextField.setBounds(300, 440, 400, 25);
        add(stateTextField);

        JLabel mobileNumber = new JLabel("Mobile Number*:");
        mobileNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        mobileNumber.setBounds(100, 500, 200, 30);
        add(mobileNumber);

        zipcodeTextField = new JTextField();
        zipcodeTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        zipcodeTextField.setBounds(300, 500, 400, 25);
        add(zipcodeTextField);

        JLabel accountType = new JLabel("Account Type*:");
        accountType.setFont(new Font("Raleway", Font.BOLD, 18));
        accountType.setBounds(100, 560, 200, 30);
        add(accountType);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        emailTextField.setBounds(300, 560, 400, 25);
        add(emailTextField);

        JLabel contactMethod = new JLabel("Preferred Contact Method*:");
        contactMethod.setFont(new Font("Raleway", Font.BOLD, 18));
        contactMethod.setBounds(100, 620, 400, 30);
        add(contactMethod);

        confirmEmailTextField = new JTextField();
        confirmEmailTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        confirmEmailTextField.setBounds(300, 620, 400, 25);
        add(confirmEmailTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 680, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formNumber = "" + random;
        String firstName = firstNameTextField.getText();
        // String middleName = middleNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String zipcode = zipcodeTextField.getText();
        String email = emailTextField.getText();
        String confirmEmail = confirmEmailTextField.getText();

        try {
            if (firstName.equals("")){
                JOptionPane.showMessageDialog(null, "First Name is Required");
            }
            else if (lastName.equals("")){
                JOptionPane.showMessageDialog(null, "Last Name is Required");
            }
            else if (dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }
            else if (address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            else if (city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            else if (state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            else if (zipcode.equals("")){
                JOptionPane.showMessageDialog(null, "Zipcode is Required");
            }
            else if (email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
            else if (!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Please enter a valid email");
            }
            else if (confirmEmail.equals("")){
                JOptionPane.showMessageDialog(null, "Confirmation Email is Required");
            }
            else if (!email.equals(confirmEmail)){
                JOptionPane.showMessageDialog(null, "Emails are not the same, please check spelling");
            }
            else {
                System.out.println(formNumber);
                Conn c = new Conn();
                String query = "insert into signup values('"+formNumber+"','"+firstName+"','"+lastName+"','"+dob+"','"+address+"', '"+city+"','"+state+"','"+zipcode+"','"+email+"')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new SignupTwo();
    }
}