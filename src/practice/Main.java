package practice;

import practice.Adapter.*;
import practice.Composite.Circle;
import practice.Composite.CompoundGraphic;
import practice.Composite.Dot;
import practice.Decorator.*;

public class Main {

    public static void main(String[] args) {
        //Adapter
        System.out.println("ADAPTER");
        System.out.println(sum(new Adapter("123"), 132));

        //RoundToSqareAdapter
        RoundPeg peg = new RoundPeg(12);
        RoundHole hole = new RoundHole(14);
        SqarePeg sp = new SqarePeg(2);
        hole.fits(peg);
        RoundToSqareAdapter adapter= new RoundToSqareAdapter(sp);

        hole.fits(adapter);

        String name = "ads";
        String data = "sdfsd";
        FileDataSource fileDataSource = new FileDataSource(name);
        fileDataSource.writeData(data);

        DataSourceDecarator enc = new EncryptionDecarator(new FileDataSource(name));
        enc.writeData(data);
        DataSource dataSource = new FileDataSource(name);
        dataSource.writeData(data);

        System.out.println(dataSource.readData());
        System.out.println(enc.readData());


        Circle cir = new Circle(3,4,5);
        Dot dot = new Dot(3,4);
        CompoundGraphic cg = new CompoundGraphic();
        cg.add(cir);
        cg.add(dot);
        cg.move(4,5);
        System.out.println(cg.toString());

    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
