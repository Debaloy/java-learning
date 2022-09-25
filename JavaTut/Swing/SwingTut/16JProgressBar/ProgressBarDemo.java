import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(); // we can pass min and max value in here as well

    ProgressBarDemo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setLayout(null);
        
        progressBar.setValue(0);
        progressBar.setBounds(10, 10, 385, 50);
        progressBar.setStringPainted(true); // adds a % in the middle of the progress bar

        progressBar.setFont(new Font("MV Boli", Font.BOLD, 20));
        progressBar.setForeground(new Color(0x282828)); // fill color
        progressBar.setBackground(new Color(0xfef3f4)); // back color
        
        frame.add(progressBar);

        fillProgressBar();
    }

    public void fillProgressBar() {
        int counter = 0;

        while (counter <= 101) {
            progressBar.setValue(counter);
            counter++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        progressBar.setString("Done! :D");
    }
}
