import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;    
    
    MyFrame() {
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        burgerButton = new JRadioButton("Burger");
        hotdogButton = new JRadioButton("Hotdog");

        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        /*
         * We will also need to make a ButtonGroup otherwise
         * all the buttons can be selected.
         * 
         * PS: We can also asign icons to the radio buttons
         * button.setIcon(new ImageIcon("file.png"));
         * OR
         * button.setSelectedIcon(new ImageIcon("file.png"));
         */

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotdogButton);
        
        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        }

        if (e.getSource() == burgerButton) {
            System.out.println("You ordered burger!");
        }
        
        if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog!");
        }
    }
}
