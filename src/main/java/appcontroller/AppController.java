package appcontroller;

import javax.swing.*;

import board.BoardView;

import java.awt.*;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import menu.MenuController;
import form.FormController;
import game.GameController;

public class AppController {
    private JFrame frame;
    private MenuController menuController;
    private FormController formController;
    private GameController gameController;

    public AppController() {
        frame = new JFrame("Game Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sakk");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height - 25;

        frame.setSize(screenWidth, screenHeight);
        frame.getContentPane().setBackground(new Color(22, 21, 19));
        frame.setLayout(new GridBagLayout());

        frame.setLocationRelativeTo(null);
    }

    public void start() {
        showMenu();
        frame.setVisible(true);
    }

    private void switchToView(JPanel view) {
        frame.getContentPane().removeAll();
        frame.add(view);
        frame.revalidate();
        frame.repaint();
    }

    public void showMenu() {
        if (menuController == null) {
            menuController = new MenuController(this);
        }
        switchToView(menuController.getView());
    }

    public void showForm() {
        if (formController == null) {
            formController = new FormController(this);
        }
        switchToView(formController.getView());
    }

    public void newGame(String name, int elo) {
        gameController = new GameController(this, name, elo);
        switchToView(gameController.getView());
    }

    public JFrame getFrame() {
        return frame;
    }
}
