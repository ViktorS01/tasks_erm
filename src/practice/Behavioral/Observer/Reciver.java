package practice.Behavioral.Observer;

public class Reciver implements Observer{
    public void handleEvent(int temp, int press) {
        System.out.println("Погода изменилась. Новая темпа: " + temp + " и давление: " + press);
    }

}
