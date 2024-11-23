package menu;

import java.util.ArrayList;

public class Menu {
  ArrayList<String> options;

  public Menu() {
      options = new ArrayList<>();
      options.add("Új játék");
      options.add("Játék betöltése");
      options.add("Kilépés");
  }

  public ArrayList<String> getOptions() {
      return options;
  }
}
