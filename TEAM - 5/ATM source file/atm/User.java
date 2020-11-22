
package atm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class User extends JFrame{
    
    public Container c;
    public JLabel username,password;
    public JTextField usern;
    public JTextArea uu;
    public JPasswordField pass;
    public JButton login,exit;
    public Font f;
    public static String pw,un;
    User()
    {
        display();
    }
    
    public void display()
    {
        /*
        CreateAccount menu = new CreateAccount();
        pw=menu.y;
        un=menu.x;
        System.out.println(un+" "+pw);
       */
       
       //System.out.print(x1+" "y1);
       //container
        c = this.getContentPane();
        c.setLayout(null);
        
       //font
       f = new Font("Arial", Font.BOLD,15);
       
       //jlabel
       username = new JLabel("USERNAME : ");
       username.setBounds(20,50,100,30);
       username.setFont(f);
       c.add(username);
        
       usern = new JTextField();
       usern.setBounds(130,50,150,30);
       usern.setFont(f);
       //un = usern.getText();
       //usern.setBackground(Color.yellow);
       c.add(usern);
       
       password = new JLabel("PASSWORD : ");
       password.setBounds(20,100,100,30);
       password.setFont(f);
       c.add(password);
       //pw = password.getText();
       //System.out.println(pw);
       
       pass = new JPasswordField();
       pass.setBounds(130,100, 150, 30);
       pass.setFont(f);
       c.add(pass);
       
       
       login = new JButton("LOGIN");
       login.setBounds(50,170,90,30);
       login.setFont(f);
       c.add(login);
       
       login.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
              //System.out.println(pw);
              String uf = usern.getText();
              String pas = pass.getText();
              //System.out.println(uf+" "+pas);
              //System.out.println(un+" "+pw);
              if(pas.equals(pw) && uf.equals(un))
              {
                  dispose();
                  MainMenu menu = new MainMenu();
                  menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  menu.setBounds(400,200,350,300);
                  menu.setVisible(true);
                  menu.setTitle("ATM");
              }
              else
                 {
                        JOptionPane.showMessageDialog(null, "Your UserName or PassWord is incorrect");
                 }
           }
       });
       
       exit = new JButton("EXIT");
       exit.setBounds(170,170,80,30);
       exit.setFont(f);
       c.add(exit);
       
       
       exit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
                JFrame frame = new JFrame("EXIT");
                 if(JOptionPane.showConfirmDialog(frame,"Confirm if you want exit","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                 {
                     System.exit(0);
                 }
           }
        });
    }
    
    public static void main(String[] args) {
        User mu = new User();
        mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mu.setBounds(400,200,350,300);
        mu.setVisible(true);
        mu.setTitle("ATM");
    }
    
}
