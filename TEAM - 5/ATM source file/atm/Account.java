
package atm;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Account extends JFrame{
    public Container c;
    public Font f;
    public JButton btn1,btn2;
    public JLabel j;
    Account()
    {
        display();
    }
    public void display()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,15);
        
        btn1 = new JButton("CREATE ACCOUNT");
        btn1.setFont(f);
        btn1.setBounds(70,50,190,30);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                CreateAccount menu = new CreateAccount();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
        });
         
        j = new JLabel("OR");
        j.setBounds(150,90,40,40);
        j.setFont(f);
        c.add(j);
        
        btn2 = new JButton("LOGIN");
        btn2.setFont(f);
        btn2.setBounds(120,140,100,30);
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
        Account menu = new Account();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
