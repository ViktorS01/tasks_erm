package practice.Structure.FlyWeight;

public class Circle implements Shape{
    int radius = 3;
    public void draw(int x, int y) {
        System.out.println("Круг с координатами x=" + x + ", y=" + y + " и радиусом " + radius + " нарисован");
    }
}
