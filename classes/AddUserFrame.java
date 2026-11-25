package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AddUserFrame extends JFrame implements ActionListener 
{
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

    private JTextField nameField, usernameField, ageField, passwordField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JButton addButton, cancelButton;
    private JComboBox date,month,year;
    private ButtonGroup genderGroup;
JLabel dateLabel;
    public AddUserFrame() 
	{      
        setTitle("Add User");
        setLayout(null);

        dateLabel = new JLabel("Birth date :");
        dateLabel.setBounds(20,180,80,25);
        add(dateLabel);

        nameField = new JTextField();
        usernameField = new JTextField();
        ageField = new JTextField();
        passwordField = new JTextField();

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");

        addButton.addActionListener(this);
        cancelButton.addActionListener(this);

        JLabel nameLabel = new JLabel("Name:");
        JLabel usernameLabel = new JLabel("NID no  :");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel passwordLabel = new JLabel("Password:");

        
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(100, 180);
        add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(150, 180);
        add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(210, 180);
        add(year);

        nameLabel.setBounds(20, 20, 80, 25);
        nameField.setBounds(100, 20, 180, 25);
        usernameLabel.setBounds(20, 50, 80, 25);
        usernameField.setBounds(100, 50, 180, 25);
        ageLabel.setBounds(20, 80, 80, 25);
        ageField.setBounds(100, 80, 180, 25);
        genderLabel.setBounds(20, 110, 80, 25);
        maleRadioButton.setBounds(100, 110, 80, 25);
        femaleRadioButton.setBounds(180, 110, 80, 25);
        passwordLabel.setBounds(20, 140, 80, 25);
        passwordField.setBounds(100, 140, 180, 25);

        addButton.setBounds(20, 220, 80, 25);
        cancelButton.setBounds(150, 220, 80, 25);
		
		addButton.setBackground(new Color(255,255,255,255)); 
		cancelButton.setBackground(new Color(255,255,255,255)); 

        add(nameLabel);
        add(nameField);
        add(usernameLabel);
        add(usernameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(passwordLabel);
        add(passwordField);
        add(addButton);
        add(cancelButton);
        


       
        setBounds(500, 250,300,300); 
        setResizable(false);
        getContentPane().setBackground(Color.decode("#00604e"));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    
    
    }
		

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == addButton) 
		{
            String name = nameField.getText();
            String username = usernameField.getText();
            String age = ageField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
            String password = passwordField.getText(); 
             String dat=(String)date.getSelectedItem();
             String mon = (String)month.getSelectedItem();
           String  yar= (String)year.getSelectedItem();
          
             signUp(name,username,age,gender,password,dat,mon,yar);

             dispose();
             new UserData();

            }
         
        else if (e.getSource() == cancelButton) 
		{
            dispose();
        }
    }

     protected boolean signUp(String name,String username,String age,String gender, String password,String dat,String mon, String yar) 
	{
        try (FileWriter fileWriter = new FileWriter("data\\user.txt", true)) 
		{
            String userData ="Name:"+name +"\n" +"NId Number:" +username + "\n" + "Password:"+ password + "\n" +"Gender:" +gender + "\n" + "Age:"+age+"\n" +"Birth Date:"+dat+"/"+mon+"/"+yar+"\n*\n";; 
            fileWriter.write(userData);
            return true; 
        } 
		catch (IOException e) 
		{
            return false; 
        }
    }
   
}