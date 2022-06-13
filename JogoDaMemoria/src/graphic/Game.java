package graphic;

import panels.ButtonPanel;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Game extends JFrame {

    public Game() throws HeadlessException {
        super("Jogo da Memória");
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.PLAIN, 24)));

        JOptionPane.showMessageDialog(null, "Acerte os pares escondidos " +
                "\nVocê terá 5 segundos pra visualizar as peças " +
                "\nCada acerto te dá 5 pontos e cada erro tira 3 pontos",
                "Intruções",
                JOptionPane.INFORMATION_MESSAGE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(400, 200);
        setLayout(new BorderLayout());

        var buttons= new JPanel();
        buttons.setLayout(new BorderLayout());
        buttons.add(BorderLayout.CENTER, new ButtonPanel());

        add(BorderLayout.CENTER, buttons);

        setVisible(true);
    }
}
