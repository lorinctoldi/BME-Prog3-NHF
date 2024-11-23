package form;

import javax.swing.*;

public class FormView extends JPanel {
    private JTextField nameField;
    private JTextField eloField;
    private JButton submitButton;
    private JButton cancelButton;

    public FormView(Form model) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel nameLabel = new JLabel("Név:");
        nameField = new JTextField(model.getName(), 20);

        JLabel eloLabel = new JLabel("ELO pontszám:");
        eloField = new JTextField(model.getElo() == 0 ? "" : String.valueOf(model.getElo()), 20);

        submitButton = new JButton("Tovább");
        cancelButton = new JButton("Vissza");

        add(nameLabel);
        add(nameField);
        add(eloLabel);
        add(eloField);
        add(submitButton);
        add(cancelButton);
    }

    public String getNameInput() {
        return nameField.getText().trim();
    }

    public String getEloInput() {
        return eloField.getText().trim();
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}