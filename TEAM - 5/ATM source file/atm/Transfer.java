
package atm;

//import static atm.Widthdraw.wid;
//import static atm.Widthdraw.wid2;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Transfer extends JFrame{
    
    public Container c;
    public JLabel lab,lab2;
    public JTextField tf1,tf2;
    public JButton btn1,btn2;
    public Font f;
    public static String tra,trai;
    public static double tra2;
    
    Transfer()
    {
        display();
    }
    public void display()
    {
        
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Arial", Font.BOLD,15);
        
        lab = new JLabel("TRANSFER TO : ");
        lab.setBounds(20,40,120,30);
        //lab.setFont(f);
        c.add(lab);
        
        
        tf1 = new JTextField();
        tf1.setBounds(160,40,140,30);
        c.add(tf1);
       // tf1.setText(s);
        
        lab2 = new JLabel("TRANSFER AMOUNT : ");
        lab2.setBounds(20,90,130,30);
        c.add(lab2);
        
        tf2 = new JTextField();
        tf2.setBounds(160,90,140,30);
        c.add(tf2);
        
        btn1 = new JButton("TRANSFER");
        btn1.setBounds(30,150,130,40);
        btn1.setFont(f);
        c.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                tra = tf2.getText();
                trai = tf1.getText();
                tra2 = Integer.parseInt(tra);
                CheckBalance menu = new CheckBalance();
                if(tra2<=menu.amount)
                {
                    menu.amount = menu.amount-tra2;
                    JOptionPane.showMessageDialog(null,"Yor Are Successfully Transfer To "+trai+" "+tra2+" taka");
                    tf2.setText("");
                    tf1.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "You Have Not Enough Money Please Check Your Balance");
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
        Transfer menu = new Transfer();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400,200,350,300);
        menu.setVisible(true);
        menu.setTitle("ATM");
    }
    
}
