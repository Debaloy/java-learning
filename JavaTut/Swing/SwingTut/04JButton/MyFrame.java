import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.AttributeSet.ColorAttribute;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon image = new ImageIcon("click.png");

        ImageIcon labelIcon = new ImageIcon("pog.png");

        label = new JLabel("POG!");
        label.setIcon(labelIcon);
        label.setBounds(200, 150, 200, 200);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(150, 150, 200, 50);
        button.addActionListener(this);
        button.setText("Click Me!");
        button.setFocusable(false); // gets rid of the dotted border around the text
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 14));
        button.setIconTextGap(-2);
        button.setForeground(Color.RED);
        button.setBackground(new Color(0xfef4f5));
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("pog");
            // To disable a button:
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
