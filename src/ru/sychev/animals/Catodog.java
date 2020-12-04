package ru.sychev.animals;

//Шаблон - что-то между фасадом и мостом (прием композиция)
public class Catodog {
    Cat cat;
    Dog dog;

    public Catodog (String name){
        this.cat = new Cat(name);
        this.dog = new Dog(name);
    }

    public void say(){
        cat.say();
        dog.say();
    }

    public void meow (){
        cat.say();
    }

    public void gav (){
        dog.say();
    }

    public String toString (){
        return "Котопес: " + cat.name;
    }
}
