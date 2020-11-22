
package atm;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateAccount extends JFrame{
    public Container c;
    public Font f;
    public JLabel lab1,lab2,lab3,lab4,lab5;
    public JTextField j1,j2,j3,j4,j5;
    public JButton btn1,btn2;
    public static String x,y;
    CreateAccount()
    {
        display();
    }
    public void display()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Ariel", Font.BOLD,16);
        
        lab1 = new JLabel("Name : ");
        lab1.setBounds(50,20,80,30);
        lab1.setFont(f);
        c.add(lab1);
        
        j1 = new JTextField();
        j1.setBounds(140,20,150,30);
        j1.setFont(f);
        c.add(j1);
        
        lab2 = new JLabel("UserName : ");
        lab2.setBounds(30,60,100,30);
        lab2.setFont(f);
        c.add(lab2);
        
         j2 = new JTextField();
        j2.setBounds(140,60,150,30);
        j2.setFont(f);
        c.add(j2);
        
        lab3 = new JLabel("Password : ");
        lab3.setBounds(30,100,100,30);
        lab3.setFont(f);
        c.add(lab3);
        
        j3 = new JTextField();
        j3.setBounds(140,100,150,30);
        j3.setFont(f);
        c.add(j3);
        
        lab4 = new JLabel("Email : ");
        lab4.setBounds(50,140,80,30);
        lab4.setFont(f);
        c.add(lab4);
        
        j4 = new JTextField();
        j4.setBounds(140,140,150,30);
        j4.setFont(f);
        c.add(j4);
        
        btn1 = new JButton("REGISTER");
        btn1.setFont(f);
        btn1.setBounds(30,190,130,30);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                x = j2.getText();
                y = j3.getText();
                dispose();
                User mu = new User();
                mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mu.setBounds(400,200,350,300);
                mu.setVisible(true);
                mu.setTitle("ATM");
                mu.un=x;
                mu.pw=y;
          }
            
        });
        
        btn2 = new JButton("BACK");
        btn2.setFont(f);
        btn2.setBounds(180,190,100,30);
        c.add(btn2);
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                User mu = new User();
                mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mu.setBounds(400,200,350,300);
                mu.setVisible(true);
                mu.setTitle("ATM");
          }
            
        });
    }
    
    public static void main(String[] args) {
        CreateAccount menu = new CreateAccount();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
