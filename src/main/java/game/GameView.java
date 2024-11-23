package game;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {
    private JButton backButton;

    public GameView(String name, int elo) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // backButton = new JButton("Vissza");
        // backButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // add(Box.createRigidArea(new Dimension(0, 20)));
        // add(backButton);
        // add(Box.createVerticalGlue());
    }

    public JButton getBackButton() {
        return backButton;
    }
}
