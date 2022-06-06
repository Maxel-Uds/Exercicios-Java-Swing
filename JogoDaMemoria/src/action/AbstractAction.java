package action;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AbstractAction {

    private static Integer points = 0;

    public static void setButtons(JToggleButton button, ArrayList<JToggleButton> buttonsCopy, ArrayList<JToggleButton> buttons) {
        button.setEnabled(false);
        button.setText(buttonsCopy.get(buttons.indexOf(button)).getText());
        button.setBackground(Color.BLACK);
    }

    public static void checkPlay(ArrayList<JToggleButton> buttonsCopy, ArrayList<JToggleButton> buttons, ArrayList<JToggleButton> buttonsSelected) {
        var auxList = Arrays.asList(buttonsSelected.get(0), buttonsSelected.get(1));

        if(!buttonsCopy.get(buttons.indexOf(auxList.get(1))).getText().equals(buttonsCopy.get(buttons.indexOf(auxList.get(0))).getText())) {
            var timer = new Timer(500, e ->
                    auxList.forEach(button -> {
                        button.setEnabled(true);
                        button.setSelected(false);
                        button.setText("");
                        button.setBackground(null);
                    }
            ));

            points -= 3;
            timer.setRepeats(false);
            timer.start();
        }
        else {
            points += 5;
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
