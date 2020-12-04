package ru.sychev.geometry;
import ru.sychev.geometry.newPoint.Moveable;
import ru.sychev.staticc.clonable.Clonable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BrokenLine <T extends Number> implements Clonable, Moveable {

    public List<Point <Integer>> points = new ArrayList<>();

    public BrokenLine (List<Point <Integer>> points){
        this.points = points;
    }

    public BrokenLine(Point <Integer>...points){
        for(Point  p : points)
            this.points.add(new Point (p.x, p.y));
    }

    public BrokenLine addPoints(Point <Integer> ...points){
        for(Point p: points)
            this.points.add(new Point (p.x, p.y));
        return this;
    }

    public BrokenLine addPoints(ArrayList<Point <Integer>> points){
        for(Point p: points)
            this.points.add(new Point(p.x, p.y));
        return this;
    }

    public void move (int x, int y){
        for (Point<Integer> l : points){
            l.x += x;
            l.y += y;
        }
    }

    public List<Point <Integer>> getPoints(){
        return points;
    }

    public String toString() {
        String ret = "Линия [";

        for (int i = 0; i < points.size() - 1; ++i)
            ret += points.get(i) + ", ";

        ret += points.get(points.size() - 1) + "]";

        return ret;
    }

    private double lengthOfLine(Point <T> begin, Point <T> end) {
        return Math.sqrt((end.x.intValue() - begin.x.intValue()) * (end.x.intValue() - begin.x.intValue()) + (end.y.intValue() - begin.y.intValue()) * (end.y.intValue() - begin.y.intValue()));
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(points);
    }

    public double getLength() {
        double ret = 0.0;

        for (int i = 0; i < this.points.size() - 1; ++i) {
            Point begin = this.points.get(i);
            Point end = this.points.get(i + 1);

            ret += lengthOfLine(begin, end);
        }

        return ret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}