
package atm;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ATM extends JFrame{
    public Container c;
    public JButton user,exit;
    public Font f;
    public JTextField j;
    
    ATM()
    {
        display();
    }
    public void display()
    {
        
        //container
        c = this.getContentPane();
        c.setLayout(null);
        
        //font
        f = new Font("Arial", Font.BOLD,20);
        
        //user
        user = new JButton("USER");
        user.setBounds(110,70,100,40);
        user.setFont(f);
        c.add(user);
        
        user.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                  Account menu = new Account();
                  menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  menu.setBounds(400,200,350,300);
                  menu.setVisible(true);
                  menu.setTitle("ATM");
            }
            
            
        });
        
        
        //exit
        exit = new JButton("EXIT");
        exit.setBounds(110,130,100,40);
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
        
        j = new JTextField();
        j.setBounds(80,200,100,10);
       // c.add(j);
    }

    public static void main(String[] args) {
        ATM user = new ATM();
        user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        user.setBounds(400,200,350,300);
        user.setVisible(true);
        user.setTitle("ATM");
    }
    
}
