package practice.Behavioral.Visitor;

public class Walker implements Visitor{

    public void visit(Wheel wheel) {
        System.out.println("Псмотрел на колеса");
    }

    public void visit(Engine engine) {
        System.out.println("Посмотрел на двигатель");
    }

    public void visit(CarDetails carDetails) {
        System.out.println("Посмотрел на детали");
    }

    public void visit(CarBody carBody) {
        System.out.println("Посмотрел на кузов");
    }
}
