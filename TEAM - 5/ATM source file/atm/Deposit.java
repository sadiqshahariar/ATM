
package atm;

//import static atm.CheckBalance.amount;
//import static atm.CheckBalance.s;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends JFrame{
    
    public Container c;
    public Font f;
    public JLabel j;
    public JTextField tf;
    public JButton btn1,btn2;
    public static String am;
    public static double am2;
    Deposit()
    {
        display();
    }
    public void display()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,15);
        
        j = new JLabel("AMOUNT : ");
        j.setFont(f);
        j.setBounds(20,70,100,30);
        c.add(j);
        
        tf = new JTextField();
        tf.setBounds(130,70,180,30);
        c.add(tf);
        
        btn1 = new JButton("DEPOSIT");
        btn1.setBounds(40,130,120,40);
        btn1.setFont(f);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                am = tf.getText();
                am2 = Integer.parseInt(am);
               // System.out.println(am2);
                CheckBalance menu = new CheckBalance();
                menu.amount = menu.amount+am2;
                JOptionPane.showMessageDialog(null, "You Are Successfully Deposit "+am2+" Taka In Your Balance");
                tf.setText("");
          }
            
        });
        
        btn2 = new JButton("BACK");
        btn2.setBounds(190,130,100,40);
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
        Deposit menu = new Deposit();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
