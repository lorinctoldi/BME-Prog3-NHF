package menu;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuView extends JPanel {
    private final ArrayList<JButton> buttons;

    public MenuView(Menu model) {
        this.buttons = new ArrayList<>();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.CENTER_ALIGNMENT);

        ArrayList<String> options = model.getOptions();
        for (String option : options) {
            JButton button = new JButton(option);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            buttons.add(button);
            add(Box.createRigidArea(new Dimension(0, 20)));
            add(button);
        }

        add(Box.createRigidArea(new Dimension(0, 50)));
    }

    public ArrayList<JButton> getButtons() {
        return buttons;
    }
}
