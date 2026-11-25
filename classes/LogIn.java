package classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public abstract class LogIn extends JFrame{

    private JLabel label1,imgLabel;
    protected JTextField usernameBox, passwordBox;
    protected Cursor cursor;
    private JButton exitBtn;
    private ImageIcon icon;
    protected JPanel background;

    LogIn() {
     
        //image
icon=new ImageIcon("images\\Election.jpg");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BANGLADESH ELECTION COMMISSION(Log In)");
        setBounds(300,90,900, 600);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setIconImage(icon.getImage());

        //Panel
        background=new JPanel();
        background.setBounds(0,0,900,600);
        background.setBackground(Color.decode("#00604e"));
        background.setVisible(true);
        background.setLayout(null);
        add(background);

        usernameBox = new JTextField();
        usernameBox.setBounds(420, 175, 250, 35);
        usernameBox.setFont(new Font("Arial", Font.PLAIN, 20));
        background.add(usernameBox);

        label1 = new JLabel("PASSWORD :");
        label1.setBounds(220, 225, 500, 50);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        background. add(label1);

        passwordBox = new JPasswordField();
        passwordBox.setBounds(420, 235, 250, 35);
        passwordBox.setFont(new Font("Arial", Font.PLAIN, 25));
        background.add(passwordBox);

        exitBtn = new JButton("Back");
        exitBtn.setBounds(220, 310, 190, 40);
        exitBtn.setCursor(cursor);
        exitBtn.setBackground(Color.WHITE);
        exitBtn.setForeground(Color.decode("#00604e"));
        exitBtn.setFont(new Font("Arial", Font.BOLD, 20));
        exitBtn.setFocusable(false);
        background.add(exitBtn);

        imgLabel=new JLabel();
        imgLabel.setBounds(410,0,100,90);
        background. add(imgLabel);

        //Resize Image
        Image img=icon.getImage();
        Image ResizedImg=img.getScaledInstance(imgLabel.getWidth(),imgLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(ResizedImg);
        imgLabel.setIcon(scaledIcon);

        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				dispose();
                new FrontPage();
           }
        });
      
     

          
    }


     
}

//
//        loginBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String userName = usernameBox.getText().toLowerCase();
//                String password = passwordBox.getText();
//
//                if (userName.isEmpty() || password.isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
//                            JOptionPane.WARNING_MESSAGE);
//                } else {
//                    try (BufferedReader reader = new BufferedReader(new FileReader("./Data/UserData.txt"))) {
//                        int totalLines = 0;
//                        while (reader.readLine() != null)
//                            totalLines++;
//
//                        for (int i = 0; i < totalLines; i++) {
//                            String line = Files.readAllLines(Paths.get(".\\Data\\UserData.txt")).get(i);
//                            if (line.equals("Username : " + userName)) {
//                                String line2 = Files.readAllLines(Paths.get(".\\Data\\UserData.txt")).get((i + 1));
//                                if (line2.equals("Password : " + password)) {
//
//                                }
//                            }
//                        }
//						
//						JOptionPane.showMessageDialog(null, "Login Successful.",
//								JOptionPane.WARNING_MESSAGE);
//
//						setVisible(false);
//						UserPanel frame = new UserPanel();
//						frame.setVisible(true);
//						
//                    } catch (Exception ex) {
//                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
//                                JOptionPane.WARNING_MESSAGE);
//                    }
//                }
//            }
//        });



