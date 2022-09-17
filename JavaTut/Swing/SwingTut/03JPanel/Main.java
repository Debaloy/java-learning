import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // Creating label for red panel
        JLabel redLabel = new JLabel();
        redLabel.setText("I am in red panel!");
        ImageIcon redIcon = new ImageIcon("react.png");
        redLabel.setIcon(redIcon);
        redLabel.setBounds(20, 40, 300, 100);
        // When using the setBounds method, no use of using setVertical or setHorizontal Alignment methods

        // Creating label for blue panel
        JLabel blueLabel = new JLabel();
        blueLabel.setText("Hi! I am in blue panel");
        ImageIcon blueIcon = new ImageIcon("node.png");
        blueLabel.setIcon(blueIcon);

        // Creating label for green panel
        JLabel greenLabel = new JLabel();
        greenLabel.setText("I am in green panel");
        ImageIcon greenIcon = new ImageIcon("redux.png");
        greenLabel.setIcon(greenIcon);
        greenLabel.setVerticalAlignment(JLabel.CENTER);
        greenLabel.setHorizontalAlignment(JLabel.CENTER);

        
        // JPanel is a GUI component that functions as a container to hold other components
        // We can add a JPanel to a JFrame
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);
        redPanel.add(redLabel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 250, 250, 250);
        bluePanel.add(blueLabel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(250, 0, 500, 500);
        // Panels use FlowLayout by default, components are added row by row
        // To change it:
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(greenLabel);
        // Note:
        // setting the layout after adding a component will clear out all the previous components

        /* 
         * If the panels have null set as their layout, all the components added to it
         * will have to be assigned positions using the setBounds method
         * Eg: the redPanel has null layout, hence the label is set manually
         */
        
        // JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.setLayout(null);

        // Adding the panels
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
