package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminHomepage extends Homepage{
     
    private JLabel label,imageLabel;
    private JButton addAccount,resetVoter,addCandidate,setting;
    private ImageIcon manchitro;
    
    AdminHomepage(){
//image 
manchitro=new ImageIcon("images//manchitro.gif");

label=new JLabel();
label.setText("Authority Panel ");
label.setFont(new Font("Arial", 1, 24)); 
label.setBounds(400,140,300,50);
label.setForeground(Color.decode("#00604e"));
c.add(label);

imageLabel=new JLabel();
imageLabel.setText("Authority Panel ");
imageLabel.setFont(new Font("Arial", 1, 24)); 
imageLabel.setBounds(550,200,320,200);
imageLabel.setForeground(Color.decode("#00604e"));
c.add(imageLabel);



addAccount=new JButton("ADD VOTER");
addAccount.setBounds(20,170,120,25);
addAccount.setForeground(Color.decode("#00604e"));
addAccount.setBackground(Color.WHITE);
leftSide.add(addAccount);

resetVoter=new JButton("RESET VOTER");
resetVoter.setBounds(20,210,120,25);
resetVoter.setForeground(Color.decode("#00604e"));
resetVoter.setBackground(Color.WHITE);
leftSide.add(resetVoter);

addCandidate=new JButton("CANDIDATE");
addCandidate.setBounds(20,250,120,25);
addCandidate.setForeground(Color.decode("#00604e"));
addCandidate.setBackground(Color.WHITE);
leftSide.add(addCandidate);

setting=new JButton("SECURITY");
setting.setBounds(20,460,120,25);
setting.setForeground(Color.decode("#00604e"));
setting.setBackground(Color.WHITE);
leftSide.add(setting);



//setImage
imageLabel.setIcon(manchitro);


addAccount.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){

    dispose();
    new UserData();

 }
});

addCandidate.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
   
       dispose();
       new UserVotingPage();
   
    }
   });

    }
}
