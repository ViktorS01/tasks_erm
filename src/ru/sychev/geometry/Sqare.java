package ru.sychev.geometry;
import ru.sychev.staticc.bigarea.BigAreaa;
import ru.sychev.geometry.Figure;
import ru.sychev.staticc.clonable.Clonable;

public class Sqare <T extends Number> extends Figure implements BigAreaa, Clonable {
    Point <T> point;
    public int len;

    public int getLen(){
        return len;
    }

    public void setLen(int s){
        if (s > 0)
            this.len = s;
        else throw new IllegalArgumentException("Len must be positive");
    }

    public Sqare (Point <T> point, int len){
        if (len > 0)
        this.len = len;
        else throw new IllegalArgumentException("Len must be positive");
        this.point = point;
    }

    public Sqare (){

    }

    public Sqare (int x, int y, int len){
        if (len > 0)
            this.len = len;
        else throw new IllegalArgumentException("Len must be positive");
        this.point = new Point(x, y);
    }

    public String toString (){
        return "Квадрат в точке " + point + ", со стороной " + len;
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(
                new Point(point.x , point.y),
                new Point(point.x.intValue() + len, point.y),
                new Point(point.x.intValue() + len, point.y.intValue() + len),
                new Point(point.x, point.y.intValue() + len)
        );
    }

    public double getArea(){
        return len * len;
    }

}
