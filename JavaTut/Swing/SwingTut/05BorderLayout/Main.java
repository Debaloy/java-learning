import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        /*
         * Border Layout Manager
         * Places components in 5 areas
         * NORTH, SOUTH, EAST, WEST, CENTER
         *  - All extra space is placed in the center area
         */

        int width_margin = 10;
        int height_margin = 10;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        // To set margin between the components, pass the x_margin and y_margin
        // in parameter of the BorderLayout constructor
        // 10, 0 => there will be a 10px gap in the EAST and WEST components
        // 0, 10 => there will be a 10px gap in the NORTH and SOUTH components
        // 10, 10 => all components will have a 10px margin from all sides
        frame.setLayout(new BorderLayout(width_margin, height_margin));

        // Each panel can also have sub-panels inside them with a LayoutManager

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        /*
         * The NORTH and SOUTH panels will only expand in width on resizing
         * The EAST and WEST panels will only expand in height on resizing
         * The CENTER panel will expand in both width and height on resizing
         */
    }
}
