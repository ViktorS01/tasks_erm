package ru.sychev.geometry.newPoint;

import java.util.ArrayList;
import java.util.List;

public class Point implements Cloneable{
    private List<Integer> value = new ArrayList<>(3);

    public Point(int x) {
        value.add(x);
    }

    public Point(int x, int y){
        this(x);
        value.add(y);
    }

    public Point(int x, int y, int z) {
        this(x, y);
        value.add(z);
    }

    public int getX() {
        return value.get(0);
    }

    public int getY() {
        if (value.size() < 2) throw new IllegalArgumentException("no coordinate Y" );
        return value.get(1);
    }

    public List getCoord(){
        return value;
    }

    public int getZ() {
        if (value.size() < 3) throw new IllegalArgumentException("no coordinate Z");
        return value.get(2);
    }

    public Point setX(int x) {
        value.add(0, x);
        return this;
    }

    public Point setY(int y) {
        value.add(1,y);
        return this;
    }

    public Point setZ(int z) {
        value.add(2,z);
        return this;
    }

    public Point Clone () throws CloneNotSupportedException{
        Point clone_point = (Point)super.clone();
        clone_point.value = new ArrayList<>(this.value);
        return clone_point;
    }

    public String toString(){
        return "{ " + getX() + (value.size() > 1 ? ":" + getY() : "") + (value.size() > 2 ? ":" + getZ() : "") + " }";
    }

}
