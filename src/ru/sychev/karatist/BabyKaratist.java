package ru.sychev.other;

public class BabyKaratist implements Karate{
    String name;

    BabyKaratist(String name){
        this.name = name;
    }

    public void hand (){
        System.out.println("КИЯ!!!");
    }

    public void foot (){
        System.out.println("AAAAAAAAAAA!");
    }

    public void footInAJump (){
        System.out.println("ПОЛУЧАЙ!");
    }
}
