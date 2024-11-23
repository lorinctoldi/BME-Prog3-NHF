package piece;

import board.Board;

public interface Piece {
  // boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board);

  int getRow();

  int getCol();

  void setRow(int row);

  void setCol(int col);

  Color getColor();

  PieceType getType();

  enum PieceType {
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
  }
  
  enum Color {
    WHITE, BLACK
  }  
}
