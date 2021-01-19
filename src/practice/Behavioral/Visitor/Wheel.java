package practice.Behavioral.Visitor;

public class Wheel implements Element{
    String name;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Wheel (){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
