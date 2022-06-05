package panels;

import action.AbstractAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationButtonPanel extends JPanel implements ActionListener {

    private final JButton sum;
    private final JButton sub;
    private final JButton div;
    private final JButton mult;
    private final JButton equal;
    private final JButton clear;

    private final JTextField textField;

    public OperationButtonPanel(JTextField textField) {
        this.textField = textField;

        setLayout(new GridLayout(3, 2));

        sum = new JButton("+");
        sum.addActionListener(this);
        add(sum);

        sub = new JButton("-");
        sub.addActionListener(this);
        add(sub);

        div = new JButton("/");
        div.addActionListener(this);
        add(div);

        mult = new JButton("x");
        mult.addActionListener(this);
        add(mult);

        equal = new JButton("=");
        equal.addActionListener(this);
        add(equal);

        clear = new JButton("C");
        clear.addActionListener(this);
        add(clear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractAction.calculate(textField, e, clear, equal, sum, sub, mult, div);
    }
}
