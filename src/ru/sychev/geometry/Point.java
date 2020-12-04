package ru.sychev.geometry;

import java.util.Objects;

public class Point < T extends Number>  implements Cloneable {
    T x;
    T y;

    public Point(final T x, final T y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals (Object point){
        if (point.equals(this)) return  true;
        if (point.equals(null)) return  false;
        if (point.getClass() != this.getClass()) return  false;
        //return this.x == ((Point<?>)point).x && this.y == ((Point<?>)point).y;
        return Objects.equals(this.x,((Point<?>)point).x) && Objects.equals(this.y,((Point<?>)point).y);
    }

    @Override
    public int hashCode(){
        int hash = 3;
        hash = 89 * hash + this.x.intValue();
        hash = 89 * hash + this.y.intValue();
        return hash;
    }

    @Override
    public Point <T> clone () throws CloneNotSupportedException {
        Point point_clone = (Point)super.clone();
        return point_clone;
    }

    public String toString (){
        return "{ " + x + ", " + y + " }";
    }
}
