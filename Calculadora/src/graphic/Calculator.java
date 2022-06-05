package graphic;

import panels.NumberButtonPanel;
import panels.OperationButtonPanel;
import panels.TextFieldPanel;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() throws Exception {
        super("Calculadora");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(400, 200);
        setLayout(new BorderLayout());

        var textFieldPanel = new TextFieldPanel();
        add(BorderLayout.NORTH, textFieldPanel);

        var numbersButtons = new JPanel();
        numbersButtons.setLayout(new BorderLayout());
        numbersButtons.add(BorderLayout.CENTER, new NumberButtonPanel(textFieldPanel.getTextField()));
        numbersButtons.add(BorderLayout.EAST, new OperationButtonPanel(textFieldPanel.getTextField()));

        add(BorderLayout.CENTER, numbersButtons);

        setVisible(true);
    }
}
