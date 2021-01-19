package practice.Behavioral.Visitor;

public class Engine implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
