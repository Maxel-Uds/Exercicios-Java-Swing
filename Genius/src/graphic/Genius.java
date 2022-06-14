package graphic;

import panels.ButtonPanel;

import javax.swing.*;
import java.awt.*;

public class Genius extends JFrame {

    public Genius() {
        super("Joda Memória - Genius");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(BorderLayout.CENTER, new ButtonPanel());

        setVisible(true);
    }
}
