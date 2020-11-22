
package atm;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ChangePin extends JFrame{
    public Container c;
    public JLabel lab,lab2;
    public JTextField tf1,tf2;
    public JButton btn1,btn2;
    public Font f;
    public static String cp,chp,mp;
    
    ChangePin()
    {
        display();
    }
    public void display()
    {
         User mu = new User();
         cp = mu.pw;
          //System.out.println("pw "+mu.pw+" cp = "+cp);
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,15);
        
        lab = new JLabel("CURRENT PIN : ");
        lab.setBounds(30,40,100,30);
        //lab.setFont(f);
        c.add(lab);
        
        
        tf1 = new JTextField();
        tf1.setBounds(140,40,150,30);
        c.add(tf1);
        
        lab2 = new JLabel("NEW PIN : ");
        lab2.setBounds(40,90,100,30);
        c.add(lab2);
        
        tf2 = new JTextField();
        tf2.setBounds(140,90,150,30);
        c.add(tf2);
        
        btn1 = new JButton("CHANGE PIN");
        btn1.setBounds(30,150,130,40);
        btn1.setFont(f);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                mp = tf1.getText();
                chp = tf2.getText();
                CreateAccount menu = new CreateAccount();
                if(mp.equals(cp)){
                    User mu = new User();
                    mu.pw = chp;
                    JOptionPane.showMessageDialog(null, "Your PIN is successfully Change");
                    tf1.setText("");
                    tf2.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your Current PIN is INCORRECT");
                }
            }
            
        });
        
        btn2 = new JButton("BACK");
        btn2.setBounds(190,150,100,40);
        btn2.setFont(f);
        c.add(btn2); 
         btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                MainMenu menu = new MainMenu();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(400,200,350,300);
                menu.setVisible(true);
                menu.setTitle("ATM");
            }
        });
    }
    
    public static void main(String[] args) {
        ChangePin menu = new ChangePin();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
