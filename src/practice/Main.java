package practice;

import practice.Behavioral.Command.*;
import practice.Behavioral.Iterator.Classs;
import practice.Behavioral.Iterator.Ork;
import practice.Behavioral.Iterator.SimpleIterator;
import practice.Creational.AbstractFactory.*;
import practice.Creational.Builder.Car;
import practice.Creational.Builder.CarBuilder;
import practice.Creational.Builder.Director;
import practice.Creational.FactoryMethod.Dialog;
import practice.Creational.FactoryMethod.WindowsDialog;
import practice.Creational.Clone.Point;
import practice.Creational.Singleton.Singleton;
import practice.Structure.Adapter.*;
import practice.Structure.Composite.Circle;
import practice.Structure.Composite.CompoundGraphic;
import practice.Structure.Composite.Dot;
import practice.Structure.Decorator.*;
import practice.Structure.Facade.Facade;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Structure pattern
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

        //Creational pattern
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

        //Builder
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car);

        //Prototype (clone)
        Point point = new Point(2,3);
        Point point1 = point.clone();
        System.out.println(point1.toString());

        //Singleton
        Singleton singleton = Singleton.getInstance("Data..");
        singleton.getInstance("Data2");
        System.out.println(singleton.getValue());

        //Behavior pattern
        //Command
        Comp comp = new Comp();
        Command power = new CommandPower(comp);
        Command wot = new CommandOnWOT(comp);
        Command mes = new CommandKostyaMes(comp);
        User user = new User(mes,wot,power);

        user.message();
        user.WOT();
        user.vkl();
        CommandHistory history = new CommandHistory();
        history.push(power);
        history.push(power);
        history.push(wot);
        history.push(mes);
        System.out.println(history.toString());

        //iterator
        Ork kostya = new Ork("Kostya");
        Ork kostya2 = new Ork("Kostya2");
        Ork kostya3 = new Ork("Kostya3");
        Ork kostya4 = new Ork("Kostya4");
        Ork kostya5 = new Ork("Kostya5");
        Classs allKostya = new Classs(kostya, kostya2, kostya3, kostya4, kostya5);
        SimpleIterator simpleIterator = new SimpleIterator(allKostya.getOrks());
        while (simpleIterator.hasNext()){
            simpleIterator.next();
            System.out.println(simpleIterator.toString());
        }


    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
