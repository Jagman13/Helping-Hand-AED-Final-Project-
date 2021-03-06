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
public class MyDoubleVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();

        if (text.length() == 0) {
            input.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(input, "You cannot leave the box empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (text.length() > 0) {
            try {
                double i = Double.parseDouble(text);
                input.setBackground(Color.white);
                if (i <= 0) {
                    input.setBackground(Color.cyan);
                    JOptionPane.showMessageDialog(input, "Please enter positive numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter numeric value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
