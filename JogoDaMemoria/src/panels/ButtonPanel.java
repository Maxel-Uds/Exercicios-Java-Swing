package panels;

import action.AbstractAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class ButtonPanel extends JPanel implements ActionListener {

    private final ArrayList<JToggleButton> buttons = new ArrayList<>();
    private final ArrayList<JToggleButton> buttonsCopy = new ArrayList<>();
    private final ArrayList<JToggleButton> buttonsSelected = new ArrayList<>();

    public ButtonPanel() {
        setLayout(new GridLayout(4, 4));
        Font font = new Font("Arial", Font.PLAIN, 100);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1; i <= 8; i++) {
            numbers.add(i);
        }

        for (int j = 1; j <= 2; j++) {
            Collections.shuffle(numbers);

            for(int i = 0; i < 8; i++) {
                var button = new  JToggleButton(String.valueOf(numbers.get(i)));
                var buttonCopy = new  JToggleButton(String.valueOf(numbers.get(i)));

                button.addActionListener(this);
                button.setEnabled(false);
                button.setFont(font);
                add(button);
                buttonsCopy.add(buttonCopy);
                buttons.add(button);
            }
        }

        hideButtons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = (JToggleButton) e.getSource();

        if(button.getText().isBlank() && buttonsSelected.size() < 2) {
            buttonsSelected.add(button);
            AbstractAction.setButtons(button, buttonsCopy, buttons);
        }

        if(buttonsSelected.size() == 2) {
            try {
                AbstractAction.checkPlay(buttonsCopy, buttons,  buttonsSelected);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            buttonsSelected.clear();
        }
    }

    private void hideButtons() {
        var timer = new Timer(5000, (e -> {
            for(JToggleButton button : buttons) {
                button.setText("");
                button.setEnabled(true);
            }
        }));

        timer.setRepeats(false);
        timer.start();
    }
}