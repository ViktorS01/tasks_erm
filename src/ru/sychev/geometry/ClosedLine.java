package ru.sychev.geometry;

import java.util.ArrayList;
import java.util.List;

import ru.sychev.staticc.clonable.Clonable;
import ru.sychev.staticc.len.Lenable;

public class ClosedLine extends BrokenLine implements Lenable, Clonable {

    public ClosedLine(Point...points){
        super(points);
    }

    public ClosedLine(){
    }

    @Override
    public double getLength(){
        double result = super.getLength();
        if (super.getLength() < 3) {
            return result;
        }

        int x = getPoints().get(0).x.intValue() - getPoints().get(getPoints().size() - 1).x.intValue();
        int y = getPoints().get(0).y.intValue() - getPoints().get(getPoints().size() - 1).y.intValue();
        result += Math.sqrt(x * x + y * y);

        return result;
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(points);
    }

    public List<Point> getPoints(){
        return points;
    }

    @Override
    public String toString(){
        return "Замкнутая линия " + points;
    }




}
