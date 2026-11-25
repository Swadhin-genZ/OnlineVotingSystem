package classes;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.*;
import javax.swing.*;

public class AdminLogIn extends LogIn{
    private JLabel label1;
private JButton loginBtn;
    
AdminLogIn(){

    background.setBackground(Color.decode("#BF0A30"));
    
    label1 = new JLabel("ADMIN  LOGIN");
    label1.setBounds(330, 85, 500, 90);
    label1.setFont(new Font("Arial", Font.BOLD, 35));
    label1.setForeground(Color.WHITE);
    background.add(label1);

     label1 = new JLabel("USERNAME        :");
        label1.setBounds(220, 170, 500, 40);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        background.add(label1);
    
    label1 = new JLabel("!! ONLY FOR AUTHORITY !!");
    label1.setBounds(330, 370, 280, 50);
    label1.setFont(new Font("Arial", 1, 20));
    label1.setForeground(Color.WHITE);
    background.add(label1);

    loginBtn = new JButton("Login");
        loginBtn.setBounds(480, 310, 190, 40);
        loginBtn.setBackground(Color.WHITE);
        loginBtn.setForeground(Color.decode("#00604e"));
        loginBtn.setCursor(cursor);
        loginBtn.setFont(new Font("Arial", Font.BOLD, 20));
        loginBtn.setFocusable(false);
        background.add(loginBtn);

          
       loginBtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String userName = usernameBox.getText();
               String password = passwordBox.getText();
                boolean flag=false;

     if (userName.isEmpty() || password.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
     JOptionPane.WARNING_MESSAGE);
  } 
     else {
                  
   try (BufferedReader reader = new BufferedReader(new FileReader("data\\admin.txt"))) {
 int totalLines = 0;
    while (reader.readLine() != null){
      totalLines++;
    }
    for (int i = 0; i < totalLines; i++) {
     String line = Files.readAllLines(Paths.get("data\\admin.txt")).get(i);
      if (line.equals("Username:"+ userName)) {
          String line2 = Files.readAllLines(Paths.get("data\\admin.txt")).get((i + 1));
     if (line2.equals("Password:"+ password)) {
     flag=true;
          }
     }
  }	
  if(flag){
    JOptionPane.showMessageDialog(null, "Login Successful.",
      password, JOptionPane.WARNING_MESSAGE);
    dispose();
  new AdminHomepage ();
  }
  else{
    JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",  JOptionPane.WARNING_MESSAGE);
  }
}
  catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",  JOptionPane.WARNING_MESSAGE);  
}

}
}
       }
);

}

}
 
