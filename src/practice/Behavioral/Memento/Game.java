package practice.Behavioral.Memento;

public class Game {
    public int ms;
    public String level;

    public void setGame (int ms, String level){
        this.level = level;
        this.ms = ms;
    }

    public String toString (){
        return "Level: " + level + ", Time: " + ms + " ms;";
    }

    public Memento createMemento (){
        return new Memento(ms, level);
    }

    public void setMemento (Memento memento){
        level = memento.getLevel();
        ms = memento.getMs();
    }
}
