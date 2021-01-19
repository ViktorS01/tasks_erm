package practice.Behavioral.Visitor;

public interface Visitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(CarDetails carDetails);
    void visit(CarBody carBody);
}
