package practice.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Classs {
    ArrayList <Ork> orks = new ArrayList<>();

    public  void addOrk (Ork ork){
        orks.add(ork);
    }

    public Classs (Ork...ork){
        for (Ork x : ork){
            this.orks.add(x);
        }
    }

    public ArrayList <Ork> getOrks() {
        return orks;
    }
}
