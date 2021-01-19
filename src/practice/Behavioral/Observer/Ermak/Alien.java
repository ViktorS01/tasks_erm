package practice.Behavioral.Observer.Ermak;

public class Alien implements  Observer{
    @Override
    public void handEvent() {
        System.out.println("Alien - УРА");
    }

    @Override
    public void handEvent2() {
        System.out.println("Alien - НЕТ");
    }

}
