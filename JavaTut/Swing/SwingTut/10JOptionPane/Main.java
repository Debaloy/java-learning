import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*
         * JOptionPane
         * Pops up a dialog box that prompts users for a value
         * or informs them of something
         */

        // Type 1: Message Dialog Box
        // To alert the user about something
        // OK button is present

        JOptionPane.showMessageDialog(
            null,
            "Some plain message.",
            "PLAIN_MESSAGE",
            JOptionPane.PLAIN_MESSAGE
        );

        /*
         * Parent Component:
         * Message: The message to display
         * Title: Title of the dialog box
         * Message Option:
         *   - PLAIN_MESSAGE
         *   - INFORMATION_MESSAGE
         *   - QUESTION_MESSAGE
         *   - WARNING_MESSAGE
         *   - ERROR_MESSAGE
         */

        // Example of the other types

        // INFORMATION_MESSAGE
        JOptionPane.showMessageDialog(
            null,
            "Some information.",
            "INFORMATION_MESSAGE",
            JOptionPane.INFORMATION_MESSAGE
        );

        // QUESTION_MESSAGE
        JOptionPane.showMessageDialog(
            null,
            "Some question.",
            "QUESTION_MESSAGE",
            JOptionPane.QUESTION_MESSAGE
        );

        // WARNING_MESSAGE
        JOptionPane.showMessageDialog(
            null,
            "Some warning.",
            "WARNING_MESSAGE",
            JOptionPane.WARNING_MESSAGE
        );

        // ERROR_MESSAGE
        JOptionPane.showMessageDialog(
            null,
            "Some error.",
            "ERROR_MESSAGE",
            JOptionPane.ERROR_MESSAGE
        );

        // Type 2: Confirm Dialog Box
        // To confirm an action
        // YES, NO and CANCEL button

        int option = JOptionPane.showConfirmDialog(
            null,
            "Do you know C/CPP?",
            "Title",
            JOptionPane.YES_NO_CANCEL_OPTION
        );

        System.out.println(option);

        /*
         * Parent Component:
         * Message: The message to display
         * Title: Title of the dialog box
         * Message Option:
         *   - YES_NO_CANCEL_OPTION
         *       YES returns 0, NO 1 and CANCEL 2
         *       -1 if closed by clicking on X
         *   - YES_NO_OPTION
         */

        // Type 3: Input Dialog Box
        // To take input [input is string]
        // returns String

        String answer = JOptionPane.showInputDialog("What is your name?");
        System.out.println(answer);

        // Type 4: Option Dialog Box
        // Combines all the above 3 types
        /*
         * ---- Constructor arguments ----
         * Parent Component: To which container/component it belongs (can be left null)
         * Message: Message to display
         * Title: Title of the dialog box
         * Option Type:
         * Message Type:
         * Icon: you can give your own icon too (can be left null)
         * Options: (can be left null)
         * Initial Value: which option you want selected by default
         */

        ImageIcon icon = new ImageIcon("fire.png");

        // Creating our own options
        String[] responses = { "Option 1", "Option 2", "Option 3" };

        JOptionPane.showOptionDialog(
            null,
            "message",
            "title",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0
        );
    }
}