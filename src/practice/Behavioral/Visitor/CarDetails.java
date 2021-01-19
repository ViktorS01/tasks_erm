package practice.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDetails implements Element{

    List <Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element x: elements){
            x.accept(visitor);
        }
        visitor.visit(this);
    }

    public CarDetails (){
        this.elements = Arrays.asList(new Engine(), new Wheel(), new CarBody());
    }



}
