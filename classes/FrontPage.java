package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrontPage extends JFrame{
 // Variables declaration                     
  private JButton button1; 
 private JButton button2;
 private JButton Adminbutton;
  private JLabel label1,greeting,line,line2;
  private JLabel label2,help,contact,mobile;
  private ImageIcon icon, flag;
  private JLabel imageLabel,flagImageLabel;
  private JPanel upSide;

  
  public FrontPage (){
 
//object Creation
icon=new ImageIcon("images\\Bangladesh.jpg"); 
  button1=new JButton();
  button2=new JButton();
  Adminbutton=new JButton();
  label1=new JLabel();
  label2=new JLabel();
  flag=new ImageIcon("images\\flag.gif"); 

//Setting Frame
 setTitle("BANGLADESH ELECTION COMMISSION");
 setVisible(true);
 setLayout(null);
 setBounds(300,90,900,600);
 setResizable(false);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setIconImage(icon.getImage());

//   upSide panel
upSide=new JPanel();
upSide.setBounds(0,0,900,600);
upSide.setVisible(true);
upSide.setBackground(Color.decode("#D3D4D8"));
upSide.setLayout(null);
add(upSide);


 //Setting Button
    button1.setText("Log In");
       button1.setBounds(600,210,220,40);
       button1.setBackground(Color.decode("#00604e"));
       button1.setForeground(Color.decode("#F42A41"));
      button1.setFont(new Font("Arial", Font.BOLD, 20));
       button2.setText("Create Account");
      button2.setBounds(600,280,220,40);
      button2.setBackground(Color.decode("#00604e"));
      button2.setForeground(Color.decode("#F42A41"));
      button2.setFont(new Font("Arial", Font.BOLD, 20));
      button2.setForeground(Color.decode("#F42A41"));
       Adminbutton.setText("Admin Log In");
       Adminbutton.setBounds(600,345,220,40);
       Adminbutton.setBackground(Color.decode("#00604e"));
       Adminbutton.setForeground(Color.decode("#F42A41"));
      Adminbutton.setFont(new Font("Arial", Font.BOLD, 20));
//Setting Label
label1.setText("PEOPLE'S REPUBLIC OF BANGLADESH");
label1.setFont(new Font("Arial", 1, 24)); 
label1.setForeground(Color.decode("#F42A41"));
label1.setBounds(220,80,500,50);
label2.setText("BANGLADESH ELECTION COMMISSION");
label2.setFont(new Font("Arial", 1, 18)); 
label2.setBounds(280,110,360,50);
label2.setForeground(Color.decode("#00604e"));
greeting=new JLabel("Welcome !");
greeting.setFont(new Font("Arial", 1, 24)); 
greeting.setForeground(Color.decode("#00604e"));
greeting.setBounds(640,150,250,50);
imageLabel=new JLabel("RIS");
imageLabel.setBounds(410,0,80,80);
flagImageLabel=new JLabel("RIS");
flagImageLabel.setBounds(100,200,334,207);
help=new JLabel("Need Help ?");
help.setFont(new Font("Arial", 1, 24)); 
help.setForeground(Color.decode("#00604e"));
help.setBounds(650,400,250,50);
contact=new JLabel("HotLine: 16670 ");
contact.setFont(new Font("Arial", 1, 20)); 
contact.setForeground(Color.decode("#F42A41"));
contact.setBounds(615,440,250,50);
mobile=new JLabel("Mobile : 01988905253 ");
mobile.setFont(new Font("Arial", 1, 20)); 
mobile.setForeground(Color.decode("#F42A41"));
mobile.setBounds(615,480,250,50);
line=new JLabel("Your Vote is Important to Us !");
line.setFont(new Font("Arial", 1, 20)); 
line.setForeground(Color.decode("#00604e"));
line.setBounds(120,430,300,50);
line2=new JLabel("Cast Your Own Vote !");
line2.setFont(new Font("Arial", 1, 20)); 
line2.setForeground(Color.decode("#F42A41"));
line2.setBounds(150,470,300,50);

    //Adding Comonents
    upSide.add(label2);
    upSide.add(imageLabel);
    upSide.add(label1);
    upSide.add(button1);
    upSide.add(button2);
    upSide.add(Adminbutton);
    upSide.add(greeting);
    upSide.add(contact);
    upSide.add(mobile);
    upSide.add(help);
    upSide.add(line);
    upSide.add(line2);
    upSide.add(flagImageLabel);

//image
flagImageLabel.setIcon(flag);
 setImage(icon,imageLabel);

//button Action Listener
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
  button1ActionPerformed(e);
}

});

button2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    button2ActionPerformed(e);
  }
  
  });

  Adminbutton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      adminbuttonActionPerformed(e);
    }
    
    });
    
  
  }

//Event Handling
void button1ActionPerformed(ActionEvent evt){
  dispose();
  new  UserLogIn();
   
}
void button2ActionPerformed(ActionEvent evt){
    dispose();
   new SignUp();
     
  }
  void adminbuttonActionPerformed(ActionEvent evt){
    dispose();
   new AdminLogIn();
     
  }

  //resized image
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
