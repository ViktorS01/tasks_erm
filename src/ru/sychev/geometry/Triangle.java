package ru.sychev.geometry;
import ru.sychev.staticc.bigarea.BigAreaa;
import ru.sychev.staticc.clonable.Clonable;

public class Triangle <T extends Number> extends Figure implements BigAreaa, Clonable {
    public Point <T> trian1, trian2, trian3;

    public Triangle(Point <T> trian1, Point <T> trian2, Point <T> trian3){
        this.trian1 = trian1;
        this.trian2 = trian2;
        this.trian3 = trian3;
    }

    @Override
    public double getArea() {
        double res;
        ClosedLine line = new ClosedLine(trian1,trian2,trian3);
        res = line.getLength();
        return res;
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(
                new Point(trian1.x, trian1.y),
                new Point(trian2.x, trian2.y),
                new Point(trian3.x, trian3.y)
        );
    }

    public String toString (){
        return "Triangle with points: " + trian1 + ", " + trian2 + ", " + trian3;
    }
}
