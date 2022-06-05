package panels;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {

    private JTextField textField;

    public TextFieldPanel() {
        setLayout(new FlowLayout());

        textField = new JTextField(25);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEnabled(false);
        add(textField);
    }

    public JTextField getTextField() {
        return textField;
    }
}
