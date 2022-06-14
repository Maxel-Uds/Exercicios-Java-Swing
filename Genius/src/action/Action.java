package action;

import graphic.Genius;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Action {

    private static final List<JButton> gameButtons = new ArrayList<JButton>();
    private static final List<JButton>  sequenceButtons = new ArrayList<JButton>();
    private static final String[] options = {"Reiniciar", "Sair"};
    private static Integer sequenceSize = 1;
    private static Integer points = 0;
    private static Integer plays = 0;
    private static Genius game;

    public static void checkPlay(JButton button) {
        if(!sequenceButtons.get(plays).equals(button)) {
                endGame();
        }
        else if((sequenceButtons.size() - 1) == plays) {
            points += 5;
            plays = 0;
            sequenceSize++;
            sequenceButtons.clear();
            nextRound();
            createSequence();
        }
        else {
            plays++;
        }
    }

    public static void createSequence() {
        for(int i = 0; i < sequenceSize; i++) {
            sequenceButtons.add(gameButtons.get(randomNumber()));
        }

        turnOnSequence();
    }

    private static void turnOnSequence() {
        enableButtons(false);

        new Thread(() -> {
            sequenceButtons.forEach(button -> {
                try {
                    Thread.sleep(800);
                    turnOnButton(button);
                    Thread.sleep(800);
                } catch (InterruptedException ignored) {}
            });

            enableButtons(true);
        }).start();
    }

    private static void turnOnButton(JButton button) {
        var color = button.getBackground();
        button.setBackground(Color.white);

        new Thread(() -> {
            try {
                Thread.sleep(700);
                turnOffButton(button, color);
            } catch (Exception ignored){}
        }).start();
    }

    private static void turnOffButton(JButton button, Color color) {
        button.setBackground(color);
    }

    private static void nextRound() {
        JOptionPane.showMessageDialog(null,
                "Fim da rodada! Sua pontuação é: " + points + "\n Prepare-se para a próxima rodada!",
                "Fim da Rodada", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void endGame() {
        Integer option = JOptionPane.showOptionDialog(null,
                ("O jogo acabou, sua pontuação é: " + points + "\nRodadas jogadas: " + sequenceSize + "\nDeseja jogar novamente?"),
                "Fim do jogo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);

        if(option.equals(0)) {
            game.dispose();
            points = 0;
            plays = 0;
            sequenceSize = 1;
            gameButtons.clear();
            sequenceButtons.clear();
            initGame();
        }
        else {
            System.exit(0);
        }
    }

    private static void enableButtons(Boolean bol) {
         gameButtons.forEach(button -> button.setEnabled(bol));
    }

    public static void initGame() {
        game = new Genius();
    }

    public static Integer randomNumber() {
        var random = new Random();
        return random.nextInt(3);
    }

    public static List<JButton> getGameButtons() {
        return gameButtons;
    }
}
