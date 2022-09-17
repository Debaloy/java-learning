package JFrameTut;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Method2 extends JFrame {
    Method2() {
        this.setTitle("My JFrame Title");
        
        this.setSize(400, 600);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setResizable(false);

        // CHANGING THE ICON ON THE WINDOW
        ImageIcon frameIcon = new ImageIcon("cpp.png");
        this.setIconImage(frameIcon.getImage());

        // Change bg color
        // 1. Default Colors
        // this.getContentPane().setBackground(Color.GREEN);
        // 2. Custom Colors
        // this.getContentPane().setBackground(new Color(123,50,250)); // RGB
        this.getContentPane().setBackground(new Color(0xFFFFFF)); // HEX
    }
}
