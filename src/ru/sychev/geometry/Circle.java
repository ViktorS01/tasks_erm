package ru.sychev.geometry;
import ru.sychev.staticc.bigarea.BigAreaa;

public class Circle extends Figure implements BigAreaa {
    public int radius;
    Point centre;

    public Circle (int radius, Point centre){
        this.centre = centre;
        if (radius < 0) throw new IllegalArgumentException("Illegal radius!");
        this.radius = radius;
    }

    public Circle(){}

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) throw new IllegalArgumentException("Illegal radius!");
        this.radius = radius;
    }

    public String toString (){
        return "Circle, radius: " + radius + " , point centre: " + centre;
    }
}
