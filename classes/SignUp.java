package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener  
{ 
    
    private JLabel titleLabel, nameLabel, usernameLabel, ageLabel, genderLabel, passwordLabel,flagLabel,dateLabel;
    private JTextField nameField, usernameField, ageField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderButtonGroup;
    private JPasswordField passwordField;
    private JButton signUpButton, backButton;
    private JCheckBox showHidePassword;
    private JPanel upSide;
    private ImageIcon flag;
    private JComboBox date,month,year;
    private String dates[]
    = { "1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15",
        "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25",
        "26", "27", "28", "29", "30",
        "31" };
private String months[]
    = { "Jan", "feb", "Mar", "Apr",
        "May", "Jun", "July", "Aug",
        "Sup", "Oct", "Nov", "Dec" };
private String years[]
    = { "1991","1992","1993","1994","1995", "1996", "1997", "1998",
        "1999", "2000", "2001", "2002",
        "2003", "2004", "2005", "2006",
        "2007", "2008", "2009", "2010",
        "2011", "2012", "2013", "2014",
        "2015", "2016", "2017", "2018",
        "2019" };


    public SignUp() {
// image
flag=new ImageIcon("images\\bangla.gif");
//   panel
upSide=new JPanel();
upSide.setBounds(0,0,515,600);
upSide.setLayout(null);
upSide.setBackground(Color.decode("#00604e"));
add(upSide);

        titleLabel = new JLabel("CREATE  ACCOUNT");
        nameLabel = new JLabel("NAME             :");
        usernameLabel = new JLabel("NID NUMBER:");
        ageLabel = new JLabel("AGE                :");
        genderLabel = new JLabel("GENDER        :");
        passwordLabel = new JLabel("PASSWORD  :");
        flagLabel=new JLabel();

        nameField = new JTextField();
        usernameField = new JTextField();
        ageField = new JTextField();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        passwordField = new JPasswordField();
        signUpButton = new JButton("Sign Up");
        backButton = new JButton("Back");

        showHidePassword = new JCheckBox("Show Password");

        Font labelFont = new Font("Arial", Font.BOLD, 24);
        titleLabel.setFont(labelFont);
        flagLabel.setBounds(433,0,450,600);
        titleLabel.setBounds(120, 50, 400, 50);
        titleLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(80, 120, 150, 20);
        nameLabel.setFont(new Font("Arial",1,18));
        nameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(80, 160, 150, 20);
        usernameLabel.setFont(new Font("Arial",1,18));
        usernameLabel.setForeground(Color.WHITE);
        ageLabel.setBounds(80, 200, 150, 20);
        ageLabel.setFont(new Font("Arial",1,18));
        ageLabel.setForeground(Color.WHITE);
        genderLabel.setBounds(80, 240, 150, 20);
        genderLabel.setFont(new Font("Arial",1,18));
        genderLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(80, 330, 150, 20);
        passwordLabel.setFont(new Font("Arial",1,18));
        passwordLabel.setForeground(Color.WHITE);
        nameField.setBounds(230, 120, 200, 20);
        nameField.setFont(new Font("Arial",1,15));
        usernameField.setBounds(230, 160, 200, 20);
        usernameField.setFont(new Font("Arial",1,15));
        ageField.setBounds(230, 200, 200, 20);
        ageField.setFont(new Font("Arial",1,15));
        maleRadioButton.setBounds(230, 240, 80, 20);
        femaleRadioButton.setBounds(350, 240, 80, 20);
        passwordField.setBounds(230, 330, 200, 20);
        passwordField.setFont(new Font("Arial",1,15));
        showHidePassword.setBounds(230, 370, 150, 20);
        signUpButton.setBounds(100, 450, 120, 30);
        signUpButton.setFont(new Font("Arial",1,15));
        backButton.setBounds(280, 450, 120, 30);
        backButton.setFont(new Font("Arial",1,15));
		signUpButton.setBackground( Color.WHITE); 
		backButton.setBackground(Color.WHITE);  

		maleRadioButton.setBackground(Color.WHITE);  
		femaleRadioButton.setBackground(Color.WHITE);   
		showHidePassword.setBackground(Color.WHITE); 

        dateLabel = new JLabel("BIRTH DATE :");
        dateLabel.setFont(new Font("Arial", 1, 18));
        dateLabel.setBounds(80,285,200,20);
        dateLabel.setForeground(Color.WHITE);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(230, 285);
        upSide.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(280, 285);
        upSide.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(340, 285);
        upSide.add(year);
 
     
       

       upSide.add(titleLabel);
       upSide. add(nameLabel);
       upSide. add(usernameLabel);
       upSide. add(ageLabel);
       upSide. add(genderLabel);
       upSide.  add(passwordLabel);
       upSide. add(nameField);
       upSide.  add(usernameField);
       upSide. add(ageField);
       upSide.  add(maleRadioButton);
       upSide.  add(femaleRadioButton);
       upSide.  add(passwordField);
       upSide.  add(signUpButton);
       upSide.  add(backButton);
       upSide.  add(showHidePassword);
       upSide.add(dateLabel);
       add(flagLabel);

       //Image set
    flagLabel.setIcon(flag);

        setTitle("Sign Up");
        setBounds(300,90,900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
		setVisible(true);

        signUpButton.addActionListener(this);
        backButton.addActionListener(this);
        showHidePassword.addActionListener(this);

        
    }

    private void signUp() 
	{

        String name = nameField.getText().trim();
        String username = usernameField.getText().trim();
        String age = ageField.getText().trim();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars).trim();
    

        if (name.isEmpty() || username.isEmpty() || age.isEmpty() || password.isEmpty()) 
		{
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
		else 
		{
            User user = new User(name, username, age, gender, password,(String)date.getSelectedItem(),(String)month.getSelectedItem(),(String)year.getSelectedItem());
	        boolean signUpSuccess = user.signUp();
	    
            if (signUpSuccess) 
			{
                JOptionPane.showMessageDialog(this, "Sign Up Successful!");
               
            } 
			else 
			{
                JOptionPane.showMessageDialog(this, "Sign Up Failed! Please try again.", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
        for (int i = 0; i < passwordChars.length; i++) {
            passwordChars[i] = ' '; 
        } 
    }


    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == signUpButton)
		{
            signUp();
            dispose();
            new FrontPage();
        } 
		else if (e.getSource() == backButton) 
		{
            setVisible(false);
             new FrontPage();
        }
		else if (e.getSource() == showHidePassword) 
		{
            if (showHidePassword.isSelected()) 
			{
                passwordField.setEchoChar((char) 0); 
            } 
			else 
			{
                passwordField.setEchoChar('*');  
            }
        }
    }
}

  
