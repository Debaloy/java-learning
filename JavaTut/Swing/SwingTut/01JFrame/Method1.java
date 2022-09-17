package JFrameTut;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Method1 {
    public static void main(String[] args) {
        /* METHOD 1
        // JFrame is a GUI window to add components to
        JFrame frame = new JFrame();

        // Setting the title of the window
        frame.setTitle("My JFrame Title");

        // Set the size of the window
        frame.setSize(400, 600); // x-width, y-width

        frame.setVisible(true); // by default the frame is invisible
        // to see the window appear, set visibility to true

        // When we click on the X button to close the frame/window
        // It does not close it and terminate the program but just hides
        // To close and terminate the program upon clicking X button:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // By default it is HIDE_ON_CLOSE
        // There's also DO_NOTHING_ON_CLOSE

        // To prevent someone from resizing the window, use
        frame.setResizable(false);

        // CHANGING THE ICON ON THE WINDOW
        ImageIcon frameIcon = new ImageIcon("cpp.png"); // creates an image icon
        frame.setIconImage(frameIcon.getImage()); // change icon of frame

        // Change bg color
        // 1. Default Colors
        // frame.getContentPane().setBackground(Color.GREEN);
        // 2. Custom Colors
        // frame.getContentPane().setBackground(new Color(123,50,250)); // RGB
        frame.getContentPane().setBackground(new Color(0xFFFFFF)); // HEX
        */

        // METHOD 2
        Method2 frame2 = new Method2();
    }
}