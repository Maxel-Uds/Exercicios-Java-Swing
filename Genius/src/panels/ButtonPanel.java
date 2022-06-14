package panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ButtonPanel extends JPanel implements ActionListener {

    private final List<JButton>  gameButtons = new ArrayList<JButton>();
    private final List<JButton>  sequenceButtons = new ArrayList<JButton>();
    private final List<JButton>  playerSequenceButtons = new ArrayList<JButton>();
    private Integer sequenceSize = 1;
    private Integer count = 0;

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

        gameButtons.addAll(Arrays.asList(buttonRed, buttonGreen, buttonBlue, buttonYellow));
        gameButtons.forEach(jButton -> {
            jButton.addActionListener(this);
            jButton.setBorderPainted(true);
            add(jButton);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        createSequence();
    }

    private void createSequence() {
        sequenceButtons.clear();
        for(int i = 0; i < sequenceSize; i++) {
            sequenceButtons.add(gameButtons.get(randomNumber()));
        }

        sequenceSize++;
        turnOnOffSequence();
    }

    private void turnOnOffSequence() {
        new Thread(() -> {
            try {
                for(int i = 0; i < sequenceSize - 1; i++) {
                    Thread.sleep(800);
                    turnOnButton(sequenceButtons.get(i));
                    Thread.sleep(800);
                }
            } catch (Exception ignored){}
        }).start();
    }

    private void turnOnButton(JButton button) {
        var color = button.getBackground();
        button.setBackground(Color.white);

        new Thread(() -> {
            try{
                Thread.sleep(800);
            } catch (Exception ignored){}
            EventQueue.invokeLater(() -> turnOffButton(button, color));
        }).start();
    }

    private void turnOffButton(JButton button, Color color) {
        button.setBackground(color);
    }

    public Integer randomNumber() {
        var random = new Random();
        return random.nextInt(3);
    }
}
