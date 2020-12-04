package ru.sychev.other;

public class Home {
    private int floor;

    public Home (int floor) {
        if (floor > 0) {
            this.floor = floor;
        }
        else throw new IllegalArgumentException ("floors must be positive");
    }

    public String toString (){
        if (((floor - 1) % 10 == 0 && floor != 11)){
            return "Дом с " + floor + " этаж" + "ом";
        }
        else return "Дом с " + floor + " этаж" + "ами";
    }
}
