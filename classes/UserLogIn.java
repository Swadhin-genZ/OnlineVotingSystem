package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class UserLogIn extends LogIn {
    
 private JLabel label1;
private JButton  registerBtn ,loginBtn;
  UserLogIn(){
        
    cursor = new Cursor(Cursor.HAND_CURSOR);

    label1 = new JLabel("USER  LOGIN");
    label1.setBounds(330, 85, 500, 90);
    label1.setFont(new Font("Arial", Font.BOLD, 35));
    label1.setForeground(Color.WHITE);
    background.add(label1);
    
    label1 = new JLabel("Don't have an account?");
    label1.setBounds(330, 370, 250, 50);
    label1.setFont(new Font("Arial", Font.PLAIN, 20));
    label1.setForeground(Color.WHITE);
    background.add(label1);


    label1 = new JLabel("NID NO         :");
        label1.setBounds(220, 170, 500, 40);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        background.add(label1);

      registerBtn = new JButton("Register");
    registerBtn.setBounds(340, 430, 190, 40);
    registerBtn.setCursor(cursor);
     registerBtn.setBackground(Color.WHITE);
     registerBtn.setForeground(Color.decode("#00604e"));
    registerBtn.setFont(new Font("Arial", Font.BOLD, 20));
     registerBtn.setFocusable(false);
     background.add(registerBtn);

     loginBtn = new JButton("Login");
        loginBtn.setBounds(480, 310, 190, 40);
        loginBtn.setBackground(Color.WHITE);
        loginBtn.setForeground(Color.decode("#00604e"));
        loginBtn.setCursor(cursor);
        loginBtn.setFont(new Font("Arial", Font.BOLD, 20));
        loginBtn.setFocusable(false);
        background.add(loginBtn);


     registerBtn.addActionListener(new ActionListener() {
  
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
             new SignUp();

        }
    });


      
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
               
try (BufferedReader reader = new BufferedReader(new FileReader("data\\user.txt"))) {
int totalLines = 0;
 while (reader.readLine() != null){
   totalLines++;
 }
 for (int i = 0; i < totalLines; i++) {
  String line = Files.readAllLines(Paths.get("data\\user.txt")).get(i);
   if (line.equals("NId Number:"+ userName)) {
       String line2 = Files.readAllLines(Paths.get("data\\user.txt")).get((i + 1));
  if (line2.equals("Password:"+ password)) {
  flag=true;
       }
  }
}	
if(flag){
 JOptionPane.showMessageDialog(null, "Login Successful.",
   password, JOptionPane.WARNING_MESSAGE);
 dispose();
new UserHomepage ();
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
 });


    }
}