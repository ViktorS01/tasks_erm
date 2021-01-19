package practice.Behavioral.Observer.Ermak;

import java.util.ArrayList;
import java.util.List;

public class Moon implements Observable{

    List<Observer> observers = new ArrayList<>();

    public void add(Observer o) {
        observers.add(o);
        if(o instanceof Alien ) {
            isNotifier();
        }
        if(o instanceof Human ) {
            isNotifier2();
        }
    }

    public void remove(Observer o) {
        observers.remove(o);
    }

    public void isNotifier() {
        for (Observer x: observers){
            if (x  instanceof  Alien)
            x.handEvent();
            else x.handEvent2();
        }
    }

    public void isNotifier2() {
        for (Observer x: observers){
            if (x  instanceof  Human)
            x.handEvent();
            else x.handEvent2();
        }
    }
}
