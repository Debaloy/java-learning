import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        /*
         * Grid Layout
         * Places components in a grid of cells.
         * Each component takes all the available space within it's cell,
         * and each cell is the same size
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);

        frame.setLayout(new GridLayout(3, 3, 10, 5));

        /*
         * GridLayout Constructor Options
         * 1) Parameter 0 [number of rows]
         * 2) Parameter 1 [number of columns]
         * 3) Parameter 2 [horizontal spacing between each component]
         * 4) Parameter 3 [vertical spacing between each component]
         * 
         * By default it is set to 1 row and n columns
         * n being the number of components added
         */

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        // If we add another component, the grid will fill up
        // as we only have 3x3 cells
        // So instead the compiler will automatically make a 4x4 instead
        // to accomodate the newly added component(s)

        frame.add(new JButton("0"));
    }
}
