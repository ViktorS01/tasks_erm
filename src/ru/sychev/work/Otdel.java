package ru.sychev.work;

public class Otdel {
    String nameOtdela;
    Person boss;

    public Otdel (String nameOtdela, Person boss){
        this.boss = boss;
        this.nameOtdela = nameOtdela;
    }

    public Otdel (String nameOtdela){
        this.nameOtdela = nameOtdela;
    }
}
