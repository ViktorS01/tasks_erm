package practice.Tasks.TaskErm;

public class Generate implements Up{
    War war;

    public Generate(War war){
        this.war = war;
    }

    public War upgrade() {
        if (war instanceof Solder) {
            return new Tank("g",12,12);
        } else return new Plane();
    }
}
