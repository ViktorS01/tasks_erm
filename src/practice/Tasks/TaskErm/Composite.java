package practice.Tasks.TaskErm;

import java.util.ArrayList;
import java.util.List;

public class Composite{
    List <War> units = new ArrayList<>();
    int damage;

    public void Shoot() {
        for (War x: units){
            x.Shoot();
        }
    }

    public void walk() {
        for (War x: units){
            x.walk();
        }
    }

    public void getHit(int damage) {
        for (War x: units){
            this.damage = damage;
            x.getHit(damage);
        }
    }

    public void add(War war){
        units.add(war);
    }

}
