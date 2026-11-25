package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


abstract class Homepage extends JFrame {
   private ImageIcon icon;
   private JLabel label1,dash;
   private JLabel image;
   private JPanel upSide;
   Container  c;
   protected JPanel leftSide;
   private JButton exitBtn;
    Homepage(){
    //    image
        icon=new ImageIcon("images\\Election.jpg"); 
        
  //Setting Frame
  setTitle("BANGLADESH ELECTION COMMISSION (Homepage)");
  setVisible(true);
  setLayout(null);
  setBounds(300,90,900,600);
  setBackground(Color.decode("#F42A41"));

  setResizable(false);
  c= getContentPane();
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setIconImage(icon.getImage());

//   panel
upSide=new JPanel();
upSide.setBounds(0,0,900,140);
upSide.setLayout(null);
upSide.setBackground(Color.decode("#00604e"));
c.add(upSide);
leftSide=new JPanel();
leftSide.setBounds(0,0,160,600);
leftSide.setLayout(null);
leftSide.setBackground(Color.decode("#00604e"));
c.add(leftSide);



label1=new JLabel();
label1.setText("BANGLADESH ELECTION COMMISSION");
label1.setFont(new Font("Arial", 1, 24)); 
label1.setBounds(250,20,500,50); 
label1.setForeground(Color.WHITE);
upSide.add(label1);

dash=new JLabel();
dash.setText("Dashboard");
dash.setFont(new Font("Arial", 1, 24)); 
dash.setBounds(400,70,500,50); 
dash.setForeground(Color.WHITE);
upSide.add(dash);

image=new JLabel();
image.setBounds(00,0,160,140);
upSide.add(image);



exitBtn=new JButton("LOG OUT");
exitBtn.setBounds(20,500,120,25);
exitBtn.setForeground(Color.decode("#00604e"));
exitBtn.setBackground(Color.WHITE);
leftSide.add(exitBtn);

//Setting Image
Image img;
 img=icon.getImage();
 Image resizeImg;
 resizeImg=img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledImage=new ImageIcon();
scaledImage.setImage(resizeImg);
image.setIcon(scaledImage);



exitBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        dispose();
        new FrontPage();
    }
});

    }

  
}
