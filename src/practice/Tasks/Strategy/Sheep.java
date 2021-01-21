package practice.Tasks.Strategy;

public class Sheep implements Behavior{
    public void actionInWinter() {
        System.out.println("Овцы танцуют зимнюю ламбаду.");
    }

    public void actionInSummer() {
        System.out.println("Овцы танцуют летнюю ламбаду.");
    }
}
