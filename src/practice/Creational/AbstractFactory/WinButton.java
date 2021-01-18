package practice.Creational.AbstractFactory;

public class WinButton implements Button{
    @Override
    public void paint(){
        System.out.println("Button for Win");
    }
}
