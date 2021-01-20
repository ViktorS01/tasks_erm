package practice.Structure.FlyWeight;

public class Square implements Shape{
    int size = 4;
    public void draw(int x, int y) {
        System.out.println("Квадрат с координатами x=" + x + ", y=" + y + " и стороной " + size + " нарисован");
    }
}
