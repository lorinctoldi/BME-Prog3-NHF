package piece;

public class Bishop implements Piece {
  private Color color;
  private int row;
  private int col;

  public Bishop(Color color, int row, int col) {
    this.color = color;
    this.row = row;
    this.col = col;
  }
  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public PieceType getType() {
    return PieceType.BISHOP;
  }

  @Override
  public int getRow() {
    return row; // Return the current row
  }

  @Override
  public int getCol() {
    return col; // Return the current column
  }

  @Override
  public void setRow(int row) {
    this.row = row; // Return the current row
  }

  @Override
  public void setCol(int col) {
    this.col = col; // Return the current column
  }

  @Override
  public String toString() {
    return color + " Pawn";
  }
}
