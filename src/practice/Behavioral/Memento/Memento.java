package practice.Behavioral.Memento;

public class Memento {
    private int ms;
    private String level;

    public Memento (int ms, String level){
        this.level = level;
        this.ms = ms;
    }

    public int getMs() {
        return ms;
    }

    public String getLevel() {
        return level;
    }
}
