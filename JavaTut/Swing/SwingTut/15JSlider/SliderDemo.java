import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        /*
         * JSlider constructor arguments
         *   - min: minimum value of the slider/scale
         *   - max: maximum value of the slider/scale
         *   - value: the value it will stay on by default
         */

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10); // ticks every 10 units

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25); // the bigger ticks

        slider.setPaintLabels(true);

        slider.setFont(new Font("MV Boli", Font.ITALIC, 15));

        // To make the slider vertical:
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        // Label that will display the unit
        label.setText(slider.getValue() + "°C");
        label.setFont(new Font("consolas", Font.BOLD, 20));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue() + "°C");
    }
    
}
