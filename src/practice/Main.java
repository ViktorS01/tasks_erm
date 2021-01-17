package practice;

import practice.Crational.AbstractFactory.*;
import practice.Crational.FactoryMethod.Dialog;
import practice.Crational.FactoryMethod.WindowsDialog;
import practice.Structure.Adapter.*;
import practice.Structure.Composite.Circle;
import practice.Structure.Composite.CompoundGraphic;
import practice.Structure.Composite.Dot;
import practice.Structure.Decorator.*;
import practice.Structure.Facade.Facade;
import ru.sychev.karatist.BabyKaratist;

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

        //decorator
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

        //Proxy

        //Composite
        Circle cir = new Circle(3,4,5);
        Dot dot = new Dot(3,4);
        CompoundGraphic cg = new CompoundGraphic();
        cg.add(cir);
        cg.add(dot);
        cg.move(4,5);
        System.out.println(cg.toString());

        //Facade
        Facade facade = new Facade();
        facade.onComp();

        //Factory Method
        Dialog dialog;
        dialog = new WindowsDialog();
        dialog.render();

        //Abstract Method
        CheckBox checkBox;
        Button button;
        GUIFactory guiFactory = new MacFactory();
        button = guiFactory.createButton();
        button.paint();

        GUIFactory guiFactory1 = new WinFactory();
        checkBox = guiFactory1.createCheckBox();
        checkBox.paint();
    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
