package ru.sychev.animals;

public class Dog {
    String name;

    public Dog (String name) {
        this.name = name;
    }

    public void say (){
        System.out.println("GAAV!");
    }

    public void say(int N){
        String result;

        result = name + ": " + "GAAV!";
        N--;

        while (N > 0) {
            result += "-gav!";
            N--;
        }

        System.out.println(result);
    }

    public String toString(){
        return "Собака: " + name;
    }
}
