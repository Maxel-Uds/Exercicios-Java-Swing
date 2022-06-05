package action;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AbstractAction {

    private static Integer points = 0;

    public static void setButtons(JToggleButton button, ArrayList<JToggleButton> buttonsCopy, ArrayList<JToggleButton> buttons) {
        button.setSelected(true);
        button.setText(buttonsCopy.get(buttons.indexOf(button)).getText());
    }

    public static void checkPlay(ArrayList<JToggleButton> buttonsCopy, ArrayList<JToggleButton> buttons, ArrayList<JToggleButton> buttonsSelected) {
        var btn1 = buttonsSelected.get(0);
        var btn2 = buttonsSelected.get(1);

        if(!buttonsCopy.get(buttons.indexOf(buttonsSelected.get(1))).getText().equals(buttonsCopy.get(buttons.indexOf(buttonsSelected.get(0))).getText())) {
            var timer = new Timer(500, (e -> {
                btn1.setSelected(false);
                btn1.setText("");

                btn2.setSelected(false);
                btn2.setText("");
            }));

            points -= 3;
            timer.setRepeats(false);
            timer.start();
        }
        else {
            points += 5;
            btn1.setEnabled(false);
            btn2.setEnabled(false);

            btn1.setBackground(Color.BLACK);
            btn2.setBackground(Color.BLACK);
            checkEndgame(buttons);
        }
    }

    private static void checkEndgame(ArrayList<JToggleButton> buttons) {
        var upButtons = buttons.stream()
                .filter(button -> !button.getText().equals(""))
                .collect(Collectors.toList());

        if(upButtons.size() == buttons.size()) {
            JOptionPane.showMessageDialog(null, ("O jogo acabou, sua pontuação é: " + points));
        }
    }
}
