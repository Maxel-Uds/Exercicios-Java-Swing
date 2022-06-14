package panels;

import action.Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ButtonPanel extends JPanel implements ActionListener {

    public ButtonPanel() {
        setLayout(new GridLayout(2, 2));

        var buttonRed = new  JButton();
        buttonRed.setBackground(Color.RED);

        var buttonGreen = new  JButton();
        buttonGreen.setBackground(Color.GREEN);

        var buttonBlue = new  JButton();
        buttonBlue.setBackground(Color.BLUE);

        var buttonYellow = new  JButton();
        buttonYellow.setBackground(Color.YELLOW);

        Action.getGameButtons().addAll(Arrays.asList(buttonRed, buttonGreen, buttonBlue, buttonYellow));
        Action.getGameButtons().forEach(jButton -> {
            jButton.addActionListener(this);
            jButton.setBorderPainted(true);
            add(jButton);
        });

        Action.createSequence();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Action.checkPlay((JButton) e.getSource());
    }
}
