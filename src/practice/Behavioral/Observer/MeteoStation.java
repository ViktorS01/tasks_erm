package practice.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observerable{
    public int temp;
    public int presser;

    List<Observer> obserevers = new ArrayList<>();

    public void setMeteo (int temp, int presser){
        this.temp = temp;
        this.presser = presser;
        isNotifier();
    }

    public void add(Observer o) {
        obserevers.add(o);
    }


    public void remove(Observer o) {
        obserevers.remove(o);
    }


    public void isNotifier() {
        for (Observer x: obserevers){
            x.handleEvent(temp,presser);
        }
    }
}
