import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame() {
        this.setLayout(new FlowLayout());

        String[] animals = { "dog", "cat", "bird" };

        /*
         * We will have to use the wrapper class data type for the items
         * Eg: int[] numbers = {1,2,3,4}
         *     passing this to the constructor is wrong, the correct way is:
         *     Integer[] numbers = {1,2,3,4}
         *     Double[] constants = {3.14, 9.8}
         */

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // to write into the combo box use:
        comboBox.setEditable(true);

        // to get amount of items in combo box:
        System.out.println(comboBox.getItemCount());

        // to add an item to the combo box:
        comboBox.addItem("horse");

        // to insert an item in to an index:
        comboBox.insertItemAt("pig", 0);
        // this item will be present in the list at index 0
        // but it won't be selected by default
        // the previous item at index 0 will be selected
        // to avoid that, use:
        comboBox.setSelectedIndex(0);

        // to remove an item:
        comboBox.removeItem("cat");

        // to remove from a certain index:
        comboBox.removeItemAt(0);

        // to remove all items:
        comboBox.removeAllItems();
        
        this.add(comboBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
    
}
