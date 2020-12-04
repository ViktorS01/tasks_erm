package ru.sychev.geometry;
import ru.sychev.geometry.newPoint.Moveable;
import ru.sychev.staticc.clonable.Clonable;
import ru.sychev.staticc.len.Lenable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line implements Clonable, Lenable, Moveable {
    Point start;
    Point end;

    public Line (int x1, int y1, int x2, int y2){
        this.start = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }

    public Line (Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void move (int x, int y){
        start = new Point((int)this.start.x + x, (int)this.start.y + y);
        end = new Point((int)this.end.x + x, (int)this.end.y + y);
    }

    public String toString (){
        return "Линия от " + start + " до " + end;
    }

    public double getLength (){
        double res = Math.sqrt(Math.pow((end.x.intValue() - start.x.intValue()),2) + Math.pow((end.y.intValue() - start.y.intValue()),2));
        return res;
    }

    public void setStart(int x1, int y1) {
        this.start.x = x1;
        this.start.y = y1;
    }

    public void setEnd(int x2, int y2) {
        this.end.x = x2;
        this.end.y = y2;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public BrokenLine getBrokenLine (){
        return new BrokenLine (
                new Point(start.x , start.y),
                new Point(end.x , end.y)
        );
    }

    @Override
    public boolean equals (Object line){
        if (line == this) return  true;
        if (line == null) return  false;
        if (line.getClass() != this.getClass()) return  false;
        return this.start.equals(((Line)line).start) && this.end.equals(((Line)line).end);
    }

    @Override
    public int hashCode(){
        return Objects.hash(start,end);
    }

    @Override
    public Line clone () throws CloneNotSupportedException{
        Line line_clone = (Line)super.clone();
        line_clone.start = new Point(start.x, start.y);
        line_clone.end = new Point(end.x, end.y);
        return line_clone;
    }
}
