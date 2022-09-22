import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myBtn = new JButton("Open New Window");
    
    LaunchPage() {
        myBtn.setBounds(100, 160, 200, 40);
        myBtn.setFocusable(false);
        myBtn.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(myBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myBtn) {
            frame.dispose(); // close the frame
            NewWindow myWindow = new NewWindow();
        }        
    }
}
