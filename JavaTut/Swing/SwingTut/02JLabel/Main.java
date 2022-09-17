import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // FRAME IS MADE AT THE END

        // JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel();    // create a label
        label.setText("women");    // set text of label
        // OR
        // JLabel label = new JLabel("Bring that bussy here boy")

        // By default it is using BorderLayout
        // Components are centered

        // Adding an image
        ImageIcon image = new ImageIcon("java.png");
        label.setIcon(image);

        // Creating a border
        Border border = BorderFactory.createLineBorder(Color.RED, 3);

        // Changing the layout of text and image
        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);  // TOP, CENTER, BOTTOM of image icon

        // Change text color
        label.setForeground(Color.GREEN);

        // Change font style
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Font("type", style, size)

        // Change gap between icon and text
        label.setIconTextGap(-20);

        // Change bg color of the label
        label.setBackground(Color.BLACK);   // set bg color
        label.setOpaque(true);    // display bg color

        // Since label takes the entirety of the frame by default
        // the whole bg is BLACK, using border to understand:
        label.setBorder(border);
        // But the size of the label can be limited if needed.

        // To move the icon and text within a label:
        // Changing vertical alignment of icon and text inside a label
        label.setVerticalAlignment(JLabel.CENTER);  // TOP, CENTER, BOTTOM
        // Changing horizontal alignment of icon and text inside a label
        label.setHorizontalAlignment(JLabel.CENTER); // LEFT, CENTER, BOTTOM


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        // Setting a new layout manager
        // frame.setLayout(null);   // uncomment this when not using the pack() at line 79
        // Due to this, we will have to manually type where we want the label to be

        // label.setBounds(300, 80, 500, 500);  // uncomment when not using line 79
        // This limits the boundary of the label
        // It cannot spread to the whole frame but takes only how much is assigned to it
        // Resizing the frame/window, the label stays where it's x and y is set to

        // adding label to frame
        frame.add(label);

        // the pack method of frame:
        // accomodates all the components and resized to fit them
        // use without the label.setBounds and setLayout

        frame.pack();
        // Note:
        // Use the pack method once you have added all the components to the frame
    }
}
