package game;

public class Game {
  private String name;
  private int elo;
  

  public Game(String name, int elo) {
    this.name = name;
    this.elo = elo;
  }

  public String getName() {
    return this.name;
  }

  public int getElo() {
    return this.elo;
  }
}
