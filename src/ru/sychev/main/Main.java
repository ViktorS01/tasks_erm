package ru.sychev.main;
import ru.sychev.animals.Bird;
import ru.sychev.animals.Sparrow;
import ru.sychev.geometry.*;
import ru.sychev.geometry.newPoint.MoveAll;
import ru.sychev.human.Human;
import ru.sychev.karatist.*;
import ru.sychev.music.Album;
import ru.sychev.music.Author;
import ru.sychev.music.MusicalTrack;
import ru.sychev.staticc.SumStr;
import ru.sychev.staticc.cat.CalMeow;
import ru.sychev.staticc.cat.CatsMeow;
import ru.sychev.animals.Cat;
import ru.sychev.staticc.bigarea.BigAreaa;
import ru.sychev.math.*;
import ru.sychev.staticc.clonable.Clonable;
import ru.sychev.staticc.len.Lenable;
import ru.sychev.other.*;
import ru.sychev.student.*;
import ru.sychev.weapon.Gun;
import ru.sychev.weapon.MachineGun;
import ru.sychev.weapon.Shooter;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        //11.1
        System.out.println(sum(2,3,4,1));
        //11.2
        Sparrow spark = new Sparrow();
        sing(spark);
        //11.3
                Circle a = new Circle(2,new Point(2,3));
                Triangle b = new Triangle(new Point(1,2), new Point(3,4), new Point(5,6));
                Sqare c = new Sqare(new Point(1,2), 3);
                Rectangle d = new Rectangle(new Point(1,2), 2,3);
                System.out.println(bigarea(a,b,c,d));


        //11.4

                Cat br = new Cat("Bobby");
                Cat ar = new Cat("Vasya");
                CalMeow cal = new CalMeow(ar);
                System.out.println(cal.getResMeow());
        /*
        //12.3
                System.out.println(sum(7, new Fraction(11, 3), new BigInteger("12345678912345678912"),
                5, 3.21));
        */
        //11.5
        //        Line line = new Line(new Point(1,2),new Point(3,4));
        //        ClosedLine cl = new ClosedLine(new Point(1,2),new Point(3,4),new Point(3,4));
        //        System.out.println(getLen(line,cl, new ImpLen ("sdsfds"), () -> "asd".length(), "dfdsf"::length));
        /*
        //11.6
                Sqare sq = new Sqare(new Point(1,2),5);
                System.out.println(sq.getBrokenLine());
        //12.4
                System.out.println(powString(args));
        //12.5
            Point my_point = new Point(2,3);
            java.awt.Point not_my_point = new java.awt.Point(2,3);

        //6.10
            City city_1 = new City("A");
            City city_2 = new City("B");
            Ways cw_1 = new Ways(city_2,12);
            //Ways cw_2 = new Ways(city_2, 14);
            city_1.addWay(cw_1);
            city_1.removeWay(cw_1);
            System.out.println(city_1.toString());

        //11.7
            Clonable[] mass = new Clonable[3];
            mass[0] =  new Sqare(new Point(1,2),12);
            mass [1] = new Line(new Point(1,2), new Point(2,3));
            mass [2] = new Triangle(new Point(1,2), new Point(4,5), new Point(4,5));
            System.out.println(getPolygonalChain(mass));

        //11.8
            Shooter sh1 = new Shooter("Kostyan");
            sh1.setGun(new Gun(10));
            Shooter sh2 = new Shooter("Face");
            Shooter sh3 = new Shooter("Bob");
            sh3.setGun(new MachineGun(30));

            sh1.shoot();
            sh2.shoot();
            sh3.shoot();

        //11.9
            City c_a = new City("A");
            City c_b = new City("B");
            City c_c = new City("C");
            City c_d = new City("D");
            City c_e = new City("E");

            c_a.addWay(c_b,12,true);
            c_a.addWay(c_c,12,true);
            c_b.addWay(c_c,12);
            c_b.addWay(c_d,12, true);
            c_d.addWay(c_e,12,true);
            c_e.addWay(c_c,12);

        // myException
            Fraction fa = new Fraction(5);
            Fraction fb = new Fraction(0);
            //fa.divideFraction(fb).intValue();

        //clone
            Object oa = new Object ();
            Object ob = new Object ();
            Clonable.clone(fa,fb);

        //student
        String[] x = {"ok", "not ok", "ok"};
        Student<String> Tolyan = new Student<String>("Tolya", x,new StringChecker());
        System.out.println(Tolyan);


        //2 задача
        List<String> list = new ArrayList<>();
        list.add(new String ("12345"));
        System.out.println(doSomething(list, new Creating()));
        list.add(new String ("123456445"));
        System.out.println(doSomething(list, new Creating()));

        //3 задача
        System.out.println("--------------");
        System.out.println(reduce(list, (j, y)-> j + y));

        //4 задача
        //SumStr sumString = new SumStr("12345");
        //System.out.println(sum(sumString));

        //5 задача - прокси
        Cat br = new Cat("Bobby");
        Cat ar = new Cat("Vasya");
        CalMeow cal = new CalMeow(ar);
        System.out.println(cal.getResMeow());
        */

        Line line_1 = new Line(new Point(1,2),new Point(3,4));
        Line line_2 = new Line(new Point(1,2),new Point(3,4));
        MoveAll group1 = new MoveAll(line_1,line_2);

        Line line_3 = new Line(new Point(1,2),new Point(3,4));
        Line line_4 = new Line(new Point(1,2),new Point(3,4));
        MoveAll group2 = new MoveAll(line_3, line_4);

        MoveAll group3 = new MoveAll(group1,group2);
        group3.move(-2,5);
        System.out.println(group3);


        BabyKaratist baby = new BabyKaratist("Петя");
        Combo combo1 = new Combo("combo1", baby2 -> baby2.kick(), AsHit.getAsHit());
        combo1.execute(baby);


//        System.out.println("*********************");
//        Object x = new Integer(2);
//
//        Stack st = new Stack();
//        st.push(2);
//        st.push("3");
//        st.push(new Integer(4));
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        x = st.peek();
//        System.out.print("x = ");
//        System.out.println(x);
//
        System.out.println("*********************");
        Checker checker = new Checker() {
            @Override
            public boolean check(Object o) {
                return true;
            }
        };
        List rate = new ArrayList();
        Student student = new Student("Petya", rate, checker);
        System.out.println(student);
        student.addRating(2);
        System.out.println(student);
        student.addRating(5);
        System.out.println(student);
        student.addRating(4);
        System.out.println(student);
        student.undo();
        System.out.println(student);
        student.undo();
        System.out.println(student);
        student.undo();
        System.out.println(student);
        System.out.println("*********************");

        Human.NameBuilder nb = Human.getNameBuilder();
        Human m = nb.setName("Петя").setPatronymic("Иванович").setSurname("Иванов").getName();



    }

    public static double sum (SumStr sumstr, Number...numbers){
        double res = 0.0;
        for (Number x: numbers){
            res += x.doubleValue();
        }
        return res;
    }

    public static  Clonable getPolygonalChain (Clonable...clonables){
        List<Point> res = new ArrayList<>();
        for (Clonable x: clonables){
            res.addAll(x.getBrokenLine().getPoints());
        }
        return new BrokenLine(res);
    }
    public static double powString (String[] args){
        double res = 0;
        res = pow(parseInt(args[0]),parseInt(args[1]));
        return res;
    }
    public static double getLen(Lenable...lenables){
        double res = 0.0;
        for (Lenable x: lenables){
            res += x.getLength();
        }
        return res;
    }
    public static void say (CatsMeow...cats){
        for (CatsMeow x: cats){
            x.say();
        }
    }

    public static double bigarea(BigAreaa...bigArea){
        double res = 0;
        for(BigAreaa x: bigArea){
            res += x.getArea();
        }
        return res;
    }

    public static void sing(Bird...birds){
        for(Bird bird: birds){
            bird.Song();
        }
    }

    public static ArrayList clone (Clonable...objects) {
        ArrayList <Clonable> listClone = new ArrayList<>();
        for (Clonable x: objects){
            listClone.add((Clonable) clone(x));
        }
        return listClone;
    }

    public static <T, R> List <R> doSomething (List<T> something, SomeDo<T, R> d){
        List <R> newList = new ArrayList();
        for (T obj : something){
            newList.add(d.act(obj));
        }
        return newList;
    }

    public static <T> T reduce (List<T> something, Returning<T> type){
        if (something.isEmpty()) return null;
        T res = something.get(0);
        for (int i = 1; i < something.size(); i++){
            res = type.ret(something.get(i), res);
        }
        return res;
    }
}