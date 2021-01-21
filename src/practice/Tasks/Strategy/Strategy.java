package practice.Tasks.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Strategy {

    List <Behavior> animals = new ArrayList<>();

    public void winter(){
        for (Behavior x: animals){
            x.actionInWinter();
        }
    }
    public void summer(){
        for (Behavior x: animals){
            x.actionInSummer();
        }
    }

     public Strategy (Behavior...animal){
        for (Behavior x: animal){
            animals.add(x);
        }
     }
}
