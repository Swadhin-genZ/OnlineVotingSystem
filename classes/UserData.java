package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class UserData extends JFrame implements ActionListener 
{
    private ImageIcon icon;
    private JLabel userDataLabel,image; 
    private JTable userTable;
    private DefaultTableModel tableModel;
    private JButton addButton, editButton, deleteButton, logoutButton;

    public UserData() 
	{ 
            //    image
            icon=new ImageIcon("images\\Election.jpg"); 

        setTitle("Admin Panel");
        setLayout(null);


        userDataLabel = new JLabel("User Data :");
        userDataLabel.setFont(new Font("Arial",1,25));
        userDataLabel.setForeground(Color.WHITE);
        userDataLabel.setBounds(20, 80, 150, 30);
        add(userDataLabel);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("NID");
        tableModel.addColumn("Password");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
        tableModel.addColumn("DOB");
       

        userTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(userTable); 
        scrollPane.setBounds(20, 120, 850, 370);
        add(scrollPane);

         image=new JLabel();
         image.setBounds(390,0,90,90);
         add(image);

        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        logoutButton = new JButton("Back");

        addButton.setBounds(20, 510, 80, 30);
        addButton.setFont(new Font("Arial",1,15));
        editButton.setBounds(110, 510, 80, 30);
        deleteButton.setBounds(200, 510, 80, 30);
        logoutButton.setBounds(650, 510, 80, 30);
		
		addButton.setBackground(Color.WHITE); 
        addButton.setForeground(Color.decode("#00604e"));
		logoutButton.setBackground(Color.WHITE); 
        logoutButton.setForeground(Color.decode("#00604e"));
		editButton.setBackground(Color.WHITE); 
        editButton.setForeground(Color.decode("#00604e"));
		deleteButton.setBackground(Color.WHITE); 
        deleteButton.setForeground(Color.decode("#00604e"));

        addButton.addActionListener(this);

        editButton.addActionListener(this);
        deleteButton.addActionListener(this);
        logoutButton.addActionListener(this);

        add(addButton);
        add(editButton);
        add(deleteButton);
        add(logoutButton);



        loadUserDataFromFile();

        setBounds(300,90,900, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
		getContentPane().setBackground(Color.decode("#00604e")); 

        //Setting Image
        setImage(icon,image);
    }

    private void loadUserDataFromFile() 
	{
        try {
            File file = new File("data\\user.txt");
            Scanner scanner = new Scanner(file);
            String[] arr=new String[10];
            int i=0;
            while (scanner.hasNextLine()) 
	    	{ 
            String userData = scanner.nextLine();
               
                if(userData.equals("*")){
                    tableModel.addRow(arr);
                    i=0;
                }
                else{
                   
                    String[] userDataArray = userData.split(":");
                    arr[i]=userDataArray[1];
                     i++;
                }

                
            }
            scanner.close();
        } 
	    catch (FileNotFoundException e) 
	    {
            JOptionPane.showMessageDialog(this, "Error Reading User Data");
        } 
    } 


    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == addButton) 
		{
            dispose();
            new AddUserFrame();

            
        } 
		else if (e.getSource() == editButton) 
		{
            int selectedRow = userTable.getSelectedRow();
            if (selectedRow != -1) 
			{
                String[] userData = getUserDataFromSelectedRow(selectedRow);
                new EditUserData(this, selectedRow, userData);
            } 
			else 
			{
                JOptionPane.showMessageDialog(this, "Please select a user to edit.");
            }
        } 
		else if (e.getSource() == deleteButton) 
		{
            int selectedRow = userTable.getSelectedRow();
            if (selectedRow != -1) 
			{
                tableModel.removeRow(selectedRow);
                deleteFileText();
                saveUserDataToFile();
            } 
			else 
			{
                JOptionPane.showMessageDialog(this, "Please select a user to delete.");
            }
        } else if (e.getSource() == logoutButton) 
		{
            dispose();
            new AdminHomepage();
        }
    }


    public void editUser(int row, String[] userData) 
	{
        for (int i = 0; i < userData.length; i++) 
		{
            tableModel.setValueAt(userData[i], row, i);
        }
        deleteFileText();
        saveUserDataToFile(); 
    }

    private void saveUserDataToFile() {
       
           String[] arr=new String[10];
            for (int i = 0; i < tableModel.getRowCount(); i++) 
			{
                int k=0;
                for (int j = 0; j < tableModel.getColumnCount(); j++) 
				{
                  
                   arr[k]=tableModel.getValueAt(i, j).toString();
                   k++;
                
            }
            signUp(arr[0],arr[1],arr[5],arr[3],arr[2],arr[4]);

            }
        }       

    
        private String[] getUserDataFromSelectedRow(int selectedRow) 
	{
        String[] userData = new String[tableModel.getColumnCount()];
        for (int i = 0; i < tableModel.getColumnCount(); i++) 
		{
            userData[i] = String.valueOf(tableModel.getValueAt(selectedRow, i)); 
        }
        return userData;
    }
 

    protected boolean signUp(String name, String username, String age, String gender, String password,String date) 
	{
        try (FileWriter fileWriter = new FileWriter("data\\user.txt", true)) 
		{
            String userData ="Name:"+name +"\n" +"NId Number:" +username + "\n" + "Password:"+ password + "\n" +"Gender:" +gender  +"\n"+ "Age:"+age+"\n"+ "Birth Date:" +date+"\n*\n"; 
            fileWriter.write(userData);
            
            return true; 
        } 
		catch (IOException e) 
		{
            return false; 
        }
    } 

      protected void deleteFileText() {
        File file = new File("data\\user.txt");

        if (!file.exists() || !file.isFile()) {
            return ;
        }

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("");
        } catch (IOException e) {
            return ;

    }
}

    void setImage(ImageIcon e,JLabel label){
        Image img;
         img=e.getImage();
         Image resizeImg;
         resizeImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon scaledImage=new ImageIcon();
        scaledImage.setImage(resizeImg);
        label.setIcon(scaledImage);

}
}