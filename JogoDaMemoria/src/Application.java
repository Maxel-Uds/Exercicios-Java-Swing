import action.AbstractAction;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Application {

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.PLAIN, 24)));
        JOptionPane.showMessageDialog(null, "Acerte os pares escondidos " +
                        "\nVocê terá 5 segundos pra visualizar as peças " +
                        "\nCada acerto te dá 5 pontos e cada erro tira 3 pontos",
                        "Intruções",
                        JOptionPane.INFORMATION_MESSAGE);

        AbstractAction.initGame();
    }
}
