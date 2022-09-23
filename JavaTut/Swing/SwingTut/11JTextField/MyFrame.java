import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    
    MyFrame() {
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("consolas", Font.PLAIN, 20));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(new Color(0x282828));
        textField.setCaretColor(Color.WHITE); // Caret = text cursor
        textField.setText("Message");

        button = new JButton("Submit");
        button.addActionListener(this);
        
        this.add(textField);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button.setEnabled(false);
            textField.setEditable(false); // to prevent user from typing/modifying it
            String text = textField.getText();
            System.out.println("You typed:\n" + text);
        }
    }
}
