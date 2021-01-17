package practice.Structure.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{

    List<Graphic> children= new ArrayList<>();


    public void draw() {
        for (int i = 0; i < children.size(); i++){
            children.get(i).draw();
        }
    }


    public void move(int x, int y) {
        for (Graphic iterator: children){
            iterator.move(x, y);
        }
    }

    public void add (Graphic children){
        this.children.add(children);
    }

    public void remove(Graphic children){
        this.children.remove(children);
    }

    @Override
    public String toString() {
        return "CompoundGraphic{" +
                "children=" + children.toString() +
                '}';
    }
}
