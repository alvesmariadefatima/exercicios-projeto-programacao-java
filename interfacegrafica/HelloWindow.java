package interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle("Minha janela");
        frame.setVisible(true);
        
        JLabel label = new JLabel("Hello World!", SwingConstants.CENTER);
        frame.setBounds(0, 0, 0, 0);
        frame.add(label);
        
    }
}
