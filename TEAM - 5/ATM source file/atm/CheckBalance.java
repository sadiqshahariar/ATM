
package atm;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBalance extends JFrame{
    public static double amount = 500.0;
    public Container c;
    public JLabel j;
    public JButton ok;
    public Font f;
    public static String s;
    CheckBalance()
    {
        display();
    }
    
    public void display()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,20);
        s = String.valueOf(amount);
        j = new JLabel();
        j.setText(s);
        j.setBounds(140,30,150,40);
        j.setFont(f);
        c.add(j);
        
        ok = new JButton("OK");
        ok.setFont(f);
        ok.setBounds(130,90,80,40);
        c.add(ok);
        
        ok.addActionListener(new ActionListener(){
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
        CheckBalance menu = new CheckBalance();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
