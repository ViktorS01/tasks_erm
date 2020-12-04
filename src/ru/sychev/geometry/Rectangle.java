package ru.sychev.geometry;
import ru.sychev.staticc.bigarea.BigAreaa;
import ru.sychev.staticc.clonable.Clonable;

public class Rectangle <T extends Number> extends Sqare implements BigAreaa, Clonable {
    public int length;

    public Rectangle(Point <T> point, int len, int length){
        if (length < 0) throw new IllegalArgumentException("ERROR!");
        this.length = length;
        this.point = point;
        this.len = len;
    }

    public double getArea () {
        return this.getLen() * length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) throw new IllegalArgumentException("ERROR!");
        this.length = length;
    }

    public BrokenLine getBrokenLine (){
        return new BrokenLine(
                new Point(point.x , point.y),
                new Point(point.x.intValue() + len, point.y),
                new Point(point.x.intValue() + len, point.y.intValue() + len),
                new Point(point.x, point.y.intValue() + len)
        );
    }
}
