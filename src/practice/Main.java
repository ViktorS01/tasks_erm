package practice;

import practice.Adapter.*;
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

    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
