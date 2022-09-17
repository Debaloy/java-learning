import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        /*
         * Flow Layout
         * Places components in a row, sized at their preferred size.
         * If the horizontal space in the container is too small, the
         * FlowLayout class uses the next available row.
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        /*
        * FlowLayout Constructor Options
        * 1) Parameter 0 [where the components will stick to]
        *    By default the components will be placed on the top row and centered
        *     - FlowLayout.LEADING, the components will be at the left
        *     - FlowLayout.CENTER, this is the default
        *     - FlowLayout.TRAILING, the components will stick to the right 
        * 2) Parameter 1 [Horizontal Spacing between the components] [int]
        * 3) Parameter 2 [Vertical Spacing between the components] [int]
        */
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));

        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));
        // frame.add(new JButton("0"));

        // We can add these buttons to a panel and then add the panel to the frame as well
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.LIGHT_GRAY);
        // Panels have FlowLayout by default
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));

        frame.add(panel);
    }
}
