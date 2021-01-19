package practice.Behavioral.Observer.Ermak;

public class Human implements Observer{
    @Override
    public void handEvent() {
        System.out.println("Hum - УРА");
    }

    @Override
    public void handEvent2() {
        System.out.println("Hum ...");
    }
}
