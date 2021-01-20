package practice.Structure.Adapter;

import static java.lang.StrictMath.sqrt;

public class RoundToSqareAdapter extends RoundPeg {
    SqarePeg peg;

    public RoundToSqareAdapter(SqarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        return (sqrt(2)*(peg.width)) / 2;
    }
}
