package ru.sychev.animals;

public class Cuckoo extends Bird {
    @Override
    public void Song() {
        for (int i = 1; i < Math.random()*10; i++){
            System.out.println("КУ-КУ, ЕПТА!");
        }
    }
}
