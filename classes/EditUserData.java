package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditUserData extends JFrame implements ActionListener 
{
    private JTextField nameField, usernameField, ageField, passwordField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JButton editButton, cancelButton;
    private UserData parentFrame;
    private int rowIndex;
    private ButtonGroup genderGroup;

    public EditUserData(UserData parentFrame, int rowIndex, String[] userData) 
	{
        this.parentFrame = parentFrame;
        this.rowIndex = rowIndex;

        setTitle("Edit User");
        setLayout(null);

        nameField = new JTextField();
        usernameField = new JTextField();
        ageField = new JTextField();
        passwordField = new JTextField();

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        nameField.setText(userData[0]);
        usernameField.setText(userData[1]);
        ageField.setText(userData[4]);
        passwordField.setText(userData[2]); 

        if (userData[3].equalsIgnoreCase("Male")) {
            maleRadioButton.setSelected(true);
        } else if (userData[3].equalsIgnoreCase("Female")) {
            femaleRadioButton.setSelected(true);
        }

        editButton = new JButton("Edit");
        cancelButton = new JButton("Cancel");

        editButton.addActionListener(this);
        cancelButton.addActionListener(this);

        JLabel nameLabel = new JLabel("NAME           :");
        JLabel usernameLabel = new JLabel("NID NO        :");
        JLabel ageLabel = new JLabel("AGE              :");
        JLabel passwordLabel = new JLabel("PASSWORD:");
        JLabel genderLabel = new JLabel("GENDER     :");

        nameLabel.setBounds(20, 20, 80, 25);
        nameLabel.setForeground(Color.WHITE);
        nameField.setBounds(100, 20, 180, 25);
        usernameLabel.setBounds(20, 50, 80, 25);
        usernameLabel.setForeground(Color.WHITE);
        usernameField.setBounds(100, 50, 180, 25);
        ageLabel.setBounds(20, 80, 80, 25);
        ageLabel.setForeground(Color.WHITE);
        ageField.setBounds(100, 80, 180, 25);
        passwordLabel.setBounds(20, 110, 80, 25);
        passwordLabel.setForeground(Color.WHITE);
        passwordField.setBounds(100, 110, 180, 25);
        genderLabel.setBounds(20, 140, 80, 25);
        genderLabel.setForeground(Color.WHITE);
        maleRadioButton.setBounds(100, 140, 80, 25);
        femaleRadioButton.setBounds(180, 140, 80, 25);

        editButton.setBounds(20, 200, 80, 25);
        cancelButton.setBounds(180, 200, 80, 25);
		
		editButton.setBackground(new Color(255,255,255,255)); 
		cancelButton.setBackground(new Color(255,255,255,255)); 

        add(nameLabel);
        add(nameField);
        add(usernameLabel);
        add(usernameField);
        add(ageLabel);
        add(ageField);
        add(passwordLabel);
        add(passwordField);
        add(genderLabel);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(editButton);
        add(cancelButton);

        setBounds(600,300,300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
		getContentPane().setBackground(Color.decode("#00604e")); 
        

    }

    @Override
    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == editButton) 
		{
            String name = nameField.getText();
            String username = usernameField.getText();
            String age = ageField.getText();
            String password = passwordField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";

            if (name.isEmpty() || username.isEmpty() || age.isEmpty() || password.isEmpty() || gender.isEmpty()) 
			{
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } 
			else 
			{
                String[] editedUserData = {name, username,password,gender,age};
                parentFrame.editUser(rowIndex, editedUserData);
                dispose();
            }
        } else if (e.getSource() == cancelButton) 
		{
            dispose();
        }
    }

    
}

