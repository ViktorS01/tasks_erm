package practice;

import practice.Behavioral.Command.*;
import practice.Behavioral.Iterator.Classs;
import practice.Behavioral.Iterator.Ork;
import practice.Behavioral.Iterator.SimpleIterator;
import practice.Behavioral.Mediator.Admin;
import practice.Behavioral.Mediator.Chat;
import practice.Behavioral.Mediator.Userr;
import practice.Behavioral.Memento.File;
import practice.Behavioral.Memento.Game;
import practice.Behavioral.Observer.Ermak.Alien;
import practice.Behavioral.Observer.Ermak.Human;
import practice.Behavioral.Observer.Ermak.Moon;
import practice.Behavioral.Observer.MeteoStation;
import practice.Behavioral.Observer.Reciver;
import practice.Behavioral.State.Red;
import practice.Behavioral.State.TrafficLights;
import practice.Behavioral.Strategy.Strategy;
import practice.Behavioral.Strategy.Sum;
import practice.Behavioral.Strategy.Umn;
import practice.Behavioral.TamplateMethod.A;
import practice.Behavioral.TamplateMethod.B;
import practice.Behavioral.TamplateMethod.C;
import practice.Behavioral.Visitor.*;
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

        //memento
        Game game = new Game();
        game.setGame(120000, "Level_1");
        System.out.println(game);

        File file = new File(game.createMemento());
        game.setGame(145000, "Level_4");

        System.out.println(game);

        game.setMemento(file.getMemento());
        System.out.println(game);

        //observer
        Reciver reciver = new Reciver();
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.add(reciver);
        meteoStation.setMeteo(30, 145);

        //observer - erm
        Human human = new Human();
        Alien alien = new Alien();
        Moon moon = new Moon();
        moon.add(human);
        System.out.println("\n");
        moon.add(alien);
        System.out.println("\n");
        moon.add(human);
        System.out.println("\n");
        moon.add(human);
        System.out.println("\n");
        moon.add(alien);
        System.out.println("\n");
        moon.add(human);

        //mediator
        Chat chat = new Chat();
        Admin admin = new Admin(chat);
        Userr userr1 = new Userr(chat);
        Userr userr2 = new Userr(chat);
        chat.addUsers(userr1,userr2);
        chat.setAdmin(admin);

        userr1.sendMessage("Салам, я юзер");
        admin.sendMessage("Салам, я админ");

        //TemplateMethod
        C c = new A();
        C c2 = new B();
        c.tempMethod();
        c2.tempMethod();

        //State
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.setColorLights(new Red());
        for (int i = 0; i < 10; i++){
            trafficLights.showColor();
            trafficLights.nextColor();
        }

        //Strategy
        Strategy strategy = new Strategy();
        strategy.setMathOperation(new Sum());
        System.out.println(strategy.operation(2.5,4.3));
        strategy.setMathOperation(new Umn());
        System.out.println(strategy.operation(2.3, 2.5));

        //Visitor
        Visitor meh = new Worker();
        Visitor walker = new Walker();
        Element wheel = new Wheel();

        wheel.accept(meh);
        wheel.accept(walker);

        Element carDet = new CarDetails();
        carDet.accept(meh);


    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
