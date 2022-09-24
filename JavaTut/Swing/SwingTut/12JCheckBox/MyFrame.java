import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon crossIcon, checkIcon;
    
    MyFrame() {
        this.setSize(500, 200);
        this.setLayout(new FlowLayout());

        checkIcon = new ImageIcon("check.png");
        crossIcon = new ImageIcon("cross.png");

        button = new JButton("Submit");
        button.addActionListener(this);
        
        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);   // to get rid of the dotted border
        checkBox.setFont(new Font("consolas", Font.PLAIN, 18));
        checkBox.setIcon(crossIcon);
        checkBox.setSelectedIcon(checkIcon);
        
        this.add(checkBox);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
