
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

public class Widthdraw extends JFrame{
    public Container c;
    public Font f;
    public JLabel j;
    public JTextField tf;
    public JButton btn1,btn2;
    public static String wid;
    public static double wid2;
    Widthdraw()
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
        
        btn1 = new JButton("WITHDRAW");
        btn1.setBounds(40,130,120,40);
        btn1.setFont(f);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                wid = tf.getText();
                wid2 = Integer.parseInt(wid);
                CheckBalance menu = new CheckBalance();
                if(wid2<=menu.amount)
                {
                    menu.amount = menu.amount-wid2;
                    JOptionPane.showMessageDialog(null,"Yor Are Successfully Widthdraw "+wid2+" taka");
                    tf.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "You Have Not Enough Money Please Check Your Balance");
                }
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
        Widthdraw menu = new Widthdraw();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
