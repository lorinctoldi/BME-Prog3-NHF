package form;

public class Form {
    private String name;
    private int elo;

    public Form() {
        this.name = "";
        this.elo = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
}
