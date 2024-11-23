package board;

import javax.swing.JPanel;

public class BoardController {
    private Board board;
    private BoardView boardView;

    public BoardController() {
        board = new Board();
        boardView = new BoardView(board);
    }

    public Board getBoard() {
        return board;
    }

    public JPanel getView() {
        return boardView;
    }
}
