package classes;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class UserVotingPage extends JFrame{
    public static int p1 = 0;
    public static int p2 = 0;
    public static int p3 = 0;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
     private JLabel jLabel4,imageLabel,headline,boatLabel,ploughLabel,paddyLabel,date,time,venue;
     private JButton jButton1,back;
     private JButton jButton2;
     private JPanel panel2,downword;
    private ImageIcon img,boat,plough,paddy;

 public UserVotingPage(){
   //    image
   img=new ImageIcon("images\\Election.jpg");
   boat=new ImageIcon("images\\Boat.jpg");
   plough=new ImageIcon("images\\Langol.jpg");
   paddy=new ImageIcon("images\\DhanerShish.jpg");
//setting frame
setTitle(" BANGLADESH ELECTION COMMISSION (CAST YOUR VOTE)");
setIconImage(img.getImage());
setVisible(true);
setResizable(false);
setBounds(300,90,900,600);
setLayout(null);

//panel
panel2=new JPanel();
panel2.setBounds(0,0,900,200);
 panel2.setBackground(Color.decode("#00604e"));
panel2.setVisible(true);
 panel2.setLayout(null);
add(panel2);

downword=new JPanel();
downword.setBounds(0,200,900,400);
 downword.setBackground(Color.WHITE);
downword.setVisible(true);
 downword.setLayout(null);
add(downword);

jLabel4 = new JLabel();
jLabel4.setText("SELECT YOUR CANDIDATE AND SUBMIT ");
jLabel4.setFont(new Font("Arial",1,20));
jLabel4.setForeground(Color.decode("#00604e"));
jLabel4.setBounds(250,10,400,20);
downword.add(jLabel4);

headline= new JLabel();
headline.setText("17th National Election ");
headline.setFont(new Font("Arial",1,30));
headline.setForeground(Color.decode("#F42A41"));
headline.setBounds(280,10,400,30);
panel2.add(headline);

date= new JLabel();
date.setText("Date: 16 May 2024 ");
date.setFont(new Font("Arial",1,20));
date.setForeground(Color.WHITE);
date.setBounds(350,45,400,30);
panel2.add(date);

time= new JLabel();
time.setText("Time: 9:00am - 4.00am ");
time.setFont(new Font("Arial",1,20));
time.setForeground(Color.WHITE);
time.setBounds(330,85,400,30);
panel2.add(time);

venue= new JLabel();
venue.setText("Venue: Online Voting System ");
venue.setFont(new Font("Arial",1,20));
venue.setForeground(Color.WHITE);
venue.setBounds(300,125,400,30);
panel2.add(venue);

imageLabel=new JLabel();
 imageLabel.setBounds(0,0,90,90);
 panel2.add(imageLabel);

 boatLabel=new JLabel();
 boatLabel.setBounds(30,100,200,200);
 downword.add(boatLabel);

 ploughLabel=new JLabel();
 ploughLabel.setBounds(620,100,200,200);
 downword.add(ploughLabel);

 paddyLabel=new JLabel();
 paddyLabel.setBounds(320,100,200,200);
 downword.add(paddyLabel);


//Setting Button
jButton1 = new JButton();
jButton1.setText("Submit your vote");
jButton1.setBounds(700,100,150,30);
jButton1.setForeground(Color.decode("#00604e"));
jButton1.setBackground(Color.WHITE);
panel2.add(jButton1);

jButton2 = new JButton();
jButton2.setText("Check result");
jButton2.setBounds(700,150,150,30);
jButton2.setForeground(Color.decode("#00604e"));
jButton2.setBackground(Color.WHITE);
panel2.add(jButton2);

back = new JButton();
back.setText("Back");
back.setBounds(20,320,120,30);
back.setBackground(Color.decode("#00604e"));
back.setForeground(Color.WHITE);
downword.add(back);


//setting Radio Button
jRadioButton1 = new JRadioButton();
jRadioButton1.setText("BOAT");
jRadioButton1.setBounds(100,60,100,20);
jRadioButton1.setForeground(Color.decode("#00604e"));
jRadioButton1.setBackground(Color.WHITE);
downword.add(jRadioButton1);


jRadioButton2 = new JRadioButton();
jRadioButton2.setText("SHEAF OF PADDY");
jRadioButton2.setForeground(Color.decode("#00604e"));
jRadioButton2.setBackground(Color.WHITE);
jRadioButton2.setBounds(350,60,200,20);
downword.add(jRadioButton2);

jRadioButton3 = new JRadioButton();
jRadioButton3.setText("PLOUGH");
jRadioButton3.setBounds(700,60,100,20);
jRadioButton3.setForeground(Color.decode("#00604e"));
jRadioButton3.setBackground(Color.WHITE);
downword.add(jRadioButton3);



//setting image
setImage(img,imageLabel);
setImage(boat,boatLabel);
setImage(plough,ploughLabel);
setImage(paddy,paddyLabel);
//Adding Event
jRadioButton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        jRadioButton1ActionPerformed(evt);
    }
});

jRadioButton2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        jRadioButton2ActionPerformed(evt);
    }
});
jRadioButton3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        jRadioButton3ActionPerformed(evt);
    }
});
jButton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
});
    jButton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });


    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            dispose();
          new  UserHomepage();
        }
    });
    }
 
    //Event Handler Method
    private void jRadioButton1ActionPerformed(ActionEvent evt) {                                              
        if (jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }                                             
   
    private void jRadioButton2ActionPerformed(ActionEvent evt) {                                              
        if (jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }      
    private void jRadioButton3ActionPerformed(ActionEvent evt) {                                              
        if (jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }   
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        if(jRadioButton1.isSelected()){
            p1++;
            JOptionPane.showMessageDialog(rootPane, "Your vote has been submitted");
        }
        else if(jRadioButton2.isSelected()){
            p2++;
            JOptionPane.showMessageDialog(rootPane, "Your vote has been sumitted");
        }
        else if(jRadioButton3.isSelected()){
            p3++;
            JOptionPane.showMessageDialog(rootPane, "Your vote has been submitted");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Select a party");
        }
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        if(p1>p2 && p1>p3){
            JOptionPane.showMessageDialog(rootPane, "BOAT : "+p1+"\nSHEAF OF PADDY : "+p2+"\nPLOUGH : "+p3+"\n\nBOAT  has a lead");
        }
        else if(p2>p1&&p2>p3){
            JOptionPane.showMessageDialog(rootPane, "BOAT : "+p1+"\nSHEAF OF PADDY : "+p2+"\nPLOUGH : "+p3+"\n\nSHEAF OF PADDY  has a lead");
        }
        else if(p3>p1&&p3>p2){
            JOptionPane.showMessageDialog(rootPane, "BOAT : "+p1+"\nSHEAF OF PADDY : "+p2+"\nPLOUGH: "+p3+"\n\n PLOUGH has a lead");
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

 