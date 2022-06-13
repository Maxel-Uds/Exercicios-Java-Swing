package graphic;

import panels.ButtonPanel;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public Game() throws HeadlessException {
        super("Jogo da Memória");

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
