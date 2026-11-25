package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserHomepage extends Homepage implements ActionListener {
    private JLabel label2;
    private JLabel label3,image2;
    private JButton cast,setting,helpBtn;
    private ImageIcon icon2;
  public UserHomepage(){
    // image
    icon2=new ImageIcon("images\\giphy.gif"); 

label2=new JLabel();
label2.setText("Welcome to Online Voting!");
label2.setFont(new Font("Arial", 1, 22)); 
label2.setBounds(370,140,320,50);
label2.setForeground(Color.decode("#00604e"));
c.add(label2);

label3=new JLabel();
label3.setText("CLICK HERE TO CAST YOUR VOTE....");
label3.setFont(new Font("Arial", 1, 15)); 
label3.setBounds(550,220,300,50);
label3.setForeground(Color.BLACK);
c.add(label3);

image2=new JLabel();
image2.setBounds(210,240,270,270);
c.add(image2);

setting=new JButton("UPDATE");
setting.setBounds(20,170,120,25);
setting.setForeground(Color.decode("#00604e"));
setting.setBackground(Color.WHITE);
leftSide.add(setting);

helpBtn=new JButton("HELP");
helpBtn.setBounds(20,210,120,25);
helpBtn.setForeground(Color.decode("#00604e"));
helpBtn.setBackground(Color.WHITE);
leftSide.add(helpBtn);

cast=new JButton("GO VOTE");
cast.setFont(new Font("Arial",1,15));
cast.setBounds(610,280,150,30);
c.add(cast);
cast.setBackground(Color.decode("#00604e"));
cast.setOpaque(true);
cast.setForeground(Color.WHITE);
cast.addActionListener(this);

Image img2;
 img2=icon2.getImage();
 Image resizeImg2;
 resizeImg2=img2.getScaledInstance(image2.getWidth(), image2.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledImage2=new ImageIcon();
scaledImage2.setImage(resizeImg2);
image2.setIcon(scaledImage2);

    }

    public void actionPerformed(ActionEvent e){
    if(e.getSource()==cast){
dispose();
new UserVotingPage();

    }
    }

  
}
