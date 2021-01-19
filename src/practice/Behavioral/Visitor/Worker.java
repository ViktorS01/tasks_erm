package practice.Behavioral.Visitor;

public class Worker implements Visitor{
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Починил колесо");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Починил двигатель");
    }

    @Override
    public void visit(CarDetails carDetails) {
        System.out.println("Починил детали");
    }

    @Override
    public void visit(CarBody carBody) {
        System.out.println("Починил кузов");
    }
}
