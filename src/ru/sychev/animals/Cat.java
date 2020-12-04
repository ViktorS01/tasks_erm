package ru.sychev.animals;
import ru.sychev.staticc.cat.CatsMeow;

public class Cat implements CatsMeow{
    String name;

    public Cat (String name){
        this.name = name;
    }

    public String toString(){
        return "Кот: " + name;
    }

    public void say(int N){
        String result;

        result = name + ": " + "мяу!";
        N--;

        while (N > 0) {
            result += "-мяу!";
            N--;
        }

        System.out.println(result);
    }

    public void say(){
        System.out.println("МЯУ!");
    }
}
