package game;

import javax.swing.JPanel;

import appcontroller.AppController;
import board.BoardController;

public class GameController {
  private BoardController boardController;

  public GameController(AppController appController, String name, int elo) {
    boardController = new BoardController();
  }

  public JPanel getView() {
    return boardController.getView();
  }
}
