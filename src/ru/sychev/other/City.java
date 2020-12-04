package ru.sychev.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    String name;
    List<Ways> ways = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City (String name, Ways ways){
        this(name, ways, false);
    }

    public City (String name, Ways ways, boolean flag){
        this.name = name;
        addWay(ways.city, ways.price, flag);
    }

    public String toString() {
        String result = this.name + "\n";

        for (Ways x : ways) {
            result += "\t" + x + "\n";
        }

        return result;
    }

    public void addWays(Ways... ways) {
        for (Ways x : ways) addWay(x);
    }

    public void addWay (City city, int price, boolean flag){
        if (cityChecked(city) == false)
            throw new IllegalArgumentException("The city may have one way.");
        if (flag == true) {
            this.ways.add(new Ways(city, price));
            city.addWay(this, price);
        }
        else {
            this.ways.add(new Ways(city, price));
        }
    }

    public void addWay (Ways ways){
        if (cityChecked(ways.city) == false)
            throw new IllegalArgumentException("The city may have one way.");
        this.ways.add(new Ways(ways.city, ways.price));
    }

    public void addWay (City city, int price){
        if (cityChecked(city) == false)
            throw new IllegalArgumentException("The city may have one way.");
        this.ways.add(new Ways(city, price));
    }

    public void removeWay (Ways ways){
        this.ways.remove(ways);
    }

    public boolean cityChecked (City city){
        for (Ways x : ways) {
            if (x.city == city)
                return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public ArrayList getWays(ArrayList ways){
        return ways;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Objects.equals(ways, city.ways);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ways);
    }
}