package practice.Behavioral.Visitor;

public class CarBody implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
