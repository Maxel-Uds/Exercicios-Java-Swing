import action.Action;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Application {

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.PLAIN, 24)));
        JOptionPane.showMessageDialog(null, "Acerte a sequência de cores que será mostrada! " +
                        "\nAs sequências ficam mais difíceis a cada rodada aumentando um elemento cada vez. " +
                        "\nCada acerto te dá 5 pontos e se errar o jogo acaba.",
                "Intruções",
                JOptionPane.INFORMATION_MESSAGE);

        Action.initGame();
    }
}
