import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
    MyFrame2() {
        // Wihtout implementing the ActionListener
        // Using lambda function

        JButton button = new JButton();
        button.setBounds(150, 150, 200, 50);
        button.addActionListener(e -> System.out.println("pog"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);

        this.add(button);
    }
}
