package practice.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Image implements Graphic{
    String name;
    List<Integer> coordinates = new ArrayList<>();
    int width;
    int height;
    int x;
    int y;

    public Image(){

    }
    public Image(String name, int height, int width, ArrayList coordinates) {
        this.name = name;
        this.x = coordinates.indexOf(0);
        this.y = coordinates.indexOf(1);
        this.width = width;
        this.height = height;
    }

    public void draw (){
        System.out.println("Нарисовали!");
    }

    public int getExtent (){
        return width * height;
    }

    public void store (){
        this.x = coordinates.indexOf(0);
        this.y = coordinates.indexOf(1);
    }

    public void load(){
        System.out.println(" ura");
        draw();
    }
}
