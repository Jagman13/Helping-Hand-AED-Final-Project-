package Business.Validation;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ruchi
 */
public class MyaddressVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[a-zA-Z0-9'\\.\\-\\s\\,]*$";

        if (text.length() == 0) {
            input.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(input, "You cannot leave the box empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.isEmpty() || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.CYAN);
                JOptionPane.showMessageDialog(input, "Please enter valid Address", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
