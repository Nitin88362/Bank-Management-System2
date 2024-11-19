package bank.management.system;


import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, n1, n2, n3;
    JButton next;
    JTextField textName, textFName, textEmail, textAdd, textcity, textpin, textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup() {
        super("Application Form");

        // Setting up the icon
        ImageIcon i1 = null;
        try {
            i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
            if (i1 == null || i1.getImageLoadStatus() != MediaTracker.COMPLETE) {
                throw new NullPointerException("Image could not be loaded");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Image not found. Please ensure 'icon/bank.png' exists in the root directory.");
            return;
        }

        if (i1 != null) {
            Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25, 10, 100, 100);
            add(image);
        }

        // Main labels
        JLabel label1 = new JLabel("APPLICATION FORM NO " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 28));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 40);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        // Name
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 150, 400, 30);
        add(textName);

        // Father's name
        JLabel labelFName = new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 200, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 200, 400, 30);
        add(textFName);

        // Date of Birth
        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 250, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dateChooser.setBounds(300, 250, 400, 30);
        add(dateChooser);

        // Gender
        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 300, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 300, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 300, 90, 30);
        add(r2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        // Email
        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 350, 400, 30);
        add(textEmail);

        // Marital Status
        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 400, 200, 30);
        add(labelMs);

        n1 = new JRadioButton("Married");
        n1.setFont(new Font("Raleway", Font.BOLD, 14));
        n1.setBackground(new Color(222, 255, 228));
        n1.setBounds(300, 400, 100, 30);
        add(n1);

        n2 = new JRadioButton("Unmarried");
        n2.setFont(new Font("Raleway", Font.BOLD, 14));
        n2.setBackground(new Color(222, 255, 228));
        n2.setBounds(450, 400, 100, 30);
        add(n2);

        n3 = new JRadioButton("Other");
        n3.setFont(new Font("Raleway", Font.BOLD, 14));
        n3.setBackground(new Color(222, 255, 228));
        n3.setBounds(630, 400, 100, 30);
        add(n3);

        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(n1);
        maritalStatusGroup.add(n2);
        maritalStatusGroup.add(n3);
        JLabel labelAdd=new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelcity=new JLabel("City:");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity=new JTextField();
        textcity.setFont(new Font("Ralway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Ralway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelState=new JLabel("State:");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        // Adding the Next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        // Frame properties
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 750);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = r1.isSelected() ? "Male" : "Female";
        String email = textEmail.getText();
        String marrid = n1.isSelected() ? "Married" : n2.isSelected() ? "Unmarried" : "Other";
        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                // SQL insertion statement corrected for syntax
                String q = "INSERT INTO signup VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" +
                        gender + "','" + email + "','" + marrid + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                con con1 = new con();
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
