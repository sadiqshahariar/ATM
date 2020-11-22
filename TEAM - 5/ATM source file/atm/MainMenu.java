
package atm;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMenu extends JFrame{
    
    public Container c;
    public JButton w,ch,de,cha,tra,logout;
    public Font f;
    public static String aa;
    MainMenu()
    {
        display();
    }
    public void display()
    {
        //CreateAccount menu = new CreateAccount();
        //aa = menu.y;
        //System.out.println(aa);
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,14);
        
        w = new JButton("WITHDRAW");
        w.setBounds(20,40,115,40);
        w.setFont(f);
        c.add(w);
        
        w.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Widthdraw menu = new Widthdraw();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
        });
        
        ch = new JButton("CHECK BALANCE");
        ch.setBounds(150,40,160,40);
        ch.setFont(f);
        c.add(ch);
        ch.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dispose();
                CheckBalance menu = new CheckBalance();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
            
        });
        
        de = new JButton("DEPOSIT");
        de.setBounds(25,100,100,40);
        de.setFont(f);
        c.add(de);
        
        de.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Deposit menu = new Deposit();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
        });
        
        cha = new JButton("CHANGE PIN");
        cha.setBounds(155,100,150,40);
        cha.setFont(f);
        c.add(cha);
        cha.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                //System.out.println(aa);
                dispose();
                ChangePin menu = new ChangePin();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
                //menu.mp = "dslkjfdslkjf";
            }
        });
        
         tra = new JButton("TRANSFER");
        tra.setBounds(20,160,110,40);
        tra.setFont(f);
        c.add(tra);
        tra.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Transfer menu = new Transfer();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
        });
        
         logout = new JButton("LOGOUT");
        logout.setBounds(177,160,110,40);
        logout.setFont(f);
        c.add(logout);
        
        logout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "You are Successfully Logout");
                dispose();
                ATM user = new ATM();
                user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                user.setBounds(400,200,350,300);
                user.setVisible(true);
                user.setTitle("ATM");
            }
            
            
        });
    }
    
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
