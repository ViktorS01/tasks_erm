package practice;

import practice.Behavioral.ChainOfResponsibility.*;
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
import practice.Creational.Builder.*;
import practice.Creational.FactoryMethod.Dialog;
import practice.Creational.FactoryMethod.WebDialog;
import practice.Creational.FactoryMethod.WindowsDialog;
import practice.Creational.Clone.Point;
import practice.Creational.Singleton.Singleton;
import practice.Structure.Adapter.*;
import practice.Structure.Bridge.Kia;
import practice.Structure.Bridge.Sedan;
import practice.Structure.Composite.Circle;
import practice.Structure.Composite.CompoundGraphic;
import practice.Structure.Composite.Dot;
import practice.Structure.Decorator.*;
import practice.Structure.Facade.Facade;
import practice.Structure.FlyWeight.Shape;
import practice.Structure.FlyWeight.ShapeFactory;
import practice.Structure.Proxy.Image;
import practice.Structure.Proxy.ProxyImage;
import practice.Structure.Proxy.RealImage;
import practice.Tasks.AbstractFabric.ElfFabric;
import practice.Tasks.AbstractFabric.Fabric;
import practice.Tasks.AbstractFabric.Heroy;
import practice.Tasks.Chain.*;
import practice.Tasks.Command.CommandDateNow;
import practice.Tasks.Command.CommandPrintHello;
import practice.Tasks.Strategy.Behavior;
import practice.Tasks.Strategy.Sheep;
import practice.Tasks.Strategy.Wolf;
import practice.Tasks.TaskErm.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        String name = "dataName";
        String data = "data";

        DataSource fileDataSource = new FileDataSource(name);
        fileDataSource.setData(data);

        DataSource dataSourceDecarator1 = new EncryptionDecarator(new FileDataSource(name));
        dataSourceDecarator1.setData(data);

        DataSource dataSourceDecarator2 = new CompressionDecarator(new FileDataSource(name));
        dataSourceDecarator2.setData(data);

        System.out.println(fileDataSource.getData());
        System.out.println(dataSourceDecarator1.getData());
        System.out.println(dataSourceDecarator2.getData());

        //Proxy
        Image image = new ProxyImage("src:/dsfds/dsfsd.jpg");
        image.display();

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
        Dialog dialog = new WindowsDialog();
        dialog.render();

        Dialog dialog1 = new WebDialog();
        dialog1.render();

        //Abstract Factory Method
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

        HouseBuilder houseBuilder = new HouseBuilder();
        director.makeHouse(houseBuilder);
        House house = houseBuilder.getResult();
        System.out.println(house);

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
        User user = new User(new CommandPower(comp), new CommandOnWOT(comp), new CommandKostyaMes(comp));
        user.message();
        user.WOT();
        user.vkl();

        CommandHistory history = new CommandHistory();
        history.push(new CommandPower(comp));
        history.push(new CommandPower(comp));
        history.push(new CommandOnWOT(comp));
        history.push(new CommandKostyaMes(comp));

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

        //ChainOfResponsibility
        SMSLogger logger0 = new SMSLogger(Level.ERROR);
        FileLogger fileLogger1 = new FileLogger(Level.DEBUG);
        EmailLogger emailLogger2 = new EmailLogger(Level.INFO);
        logger0.next(fileLogger1);
        fileLogger1.next(emailLogger2);

        logger0.writeMessage("Error", Level.ERROR);
        logger0.writeMessage("DEBUG!!", Level.DEBUG);
        logger0.writeMessage("INFO", Level.INFO);


        //Bridge
        practice.Structure.Bridge.Car car123 = new Sedan(new Kia());
        car123.showDetails();

        //FlyWeight
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("круг"));

        Random random = new Random();
        for(Shape x: shapes){
            x.draw(random.nextInt(100), random.nextInt(100));
        }

        practice.Tasks.Strategy.Strategy strategy1 = new practice.Tasks.Strategy.Strategy(new Wolf(), new Sheep());
        strategy1.summer();
        //strategy1.winter();

        practice.Tasks.Command.User user1 = new practice.Tasks.Command.User(new CommandDateNow(), new CommandPrintHello());
        user1.toDo("date","now");
        user1.toDo("print","hello");

        War solder = new Solder("a", 16, 48);
        War solder1 = new Solder("b", 12,100);
        War solder2 = new Solder("c", 99,76);
        Generate generate = new Generate(solder);
        solder = generate.upgrade();
        solder.getUnit();
        Composite composite = new Composite();
        composite.add(solder);
        composite.add(solder1);
        composite.add(solder2);
        composite.getHit(12);
        composite.Shoot();
        composite.walk();


        Otdel decanat = new Decanat();
        Otdel pfu = new PFU();
        Otdel safeOtdel = new SafeOtdel();
        Otdel otdelKadrov = new OtdelKadrov();
        Otdel rektor = new Rektor();

        decanat.next(pfu);
        pfu.next(safeOtdel);
        safeOtdel.next(otdelKadrov);
        otdelKadrov.next(rektor);
        rektor.next(null);

        decanat.toDo("fff");

        Fabric fabric = new ElfFabric();
        Heroy elf = fabric.createBoyBigDistantion();
        elf.say();


    }

    public static double sum(Number... numbers) {
        double res = 0.0;
        for (Number x : numbers) {
            res += x.doubleValue();
        }
        return res;
    }
}
