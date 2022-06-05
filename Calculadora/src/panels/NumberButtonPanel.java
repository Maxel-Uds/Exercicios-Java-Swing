package panels;

import action.AbstractAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonPanel extends JPanel implements ActionListener {

    private JTextField textField;

    public NumberButtonPanel(JTextField textField) {
        this.textField = textField;

        setLayout(new GridLayout(4, 3));

        var button1 = new JButton("1");
        button1.addActionListener(this);
        add(button1);

        var button2 = new JButton("2");
        button2.addActionListener(this);
        add(button2);

        var button3 = new JButton("3");
        button3.addActionListener(this);
        add(button3);

        var button4 = new JButton("4");
        button4.addActionListener(this);
        add(button4);

        var button5 = new JButton("5");
        button5.addActionListener(this);
        add(button5);

        var button6 = new JButton("6");
        button6.addActionListener(this);
        add(button6);

        var button7 = new JButton("7");
        button7.addActionListener(this);
        add(button7);

        var button8 = new JButton("8");
        button8.addActionListener(this);
        add(button8);

        var button9 = new JButton("9");
        button9.addActionListener(this);
        add(button9);

        var empty1 = new JButton();
        empty1.setEnabled(false);
        add(empty1);

        var button0 = new JButton("0");
        button0.addActionListener(this);
        add(button0);

        var empty2 = new JButton();
        empty2.setEnabled(false);
        add(empty2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractAction.appendNumber(textField, e);
    }
}
