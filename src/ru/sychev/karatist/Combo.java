package ru.sychev.karatist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo{
    private String name;
    private List<Karate> hits = new ArrayList<>();

    public Combo(String name, Karate...hits){
        this.name = name;
        this.hits.addAll(Arrays.asList(hits));
    }

    public String getName() {
        return name;
    }

    public Combo setName(String name) {
        this.name = name;
        return this;
    }

    public List<Karate> getHits() {
        return hits;
    }
}
