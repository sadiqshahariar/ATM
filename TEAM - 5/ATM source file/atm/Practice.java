
package atm;

import javax.swing.JFrame;

public class Practice extends JFrame{
    public static void main(String[] args) {
        User mu = new User();
        mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mu.setBounds(400,200,350,300);
        mu.setVisible(true);
        mu.setTitle("ATM");
        
    }
}
