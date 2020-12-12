package ru.sychev.karatist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo{
    private String name;
    private List<Hit> hits = new ArrayList<>();

    public Combo(String name, Hit...hits){
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

    public void execute (BabyKaratist babyKaratist){
        for (Hit h: hits){
            h.hit(babyKaratist);
        }
    }

    public List<Hit> getHits() {
        return hits;
    }
}
