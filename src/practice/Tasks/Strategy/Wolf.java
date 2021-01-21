package practice.Tasks.Strategy;

public class Wolf implements Behavior {
    public void actionInWinter() {
        System.out.println("Волки сбиваются в зимнюю вечеринку.");
    }

    public void actionInSummer() {
        System.out.println("Волки сбиваются в летнюю вечеринку");
    }
}
