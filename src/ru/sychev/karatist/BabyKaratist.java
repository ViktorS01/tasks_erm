package ru.sychev.karatist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BabyKaratist {
    String name;
    List<Combo> comboList= new ArrayList<>();

    public BabyKaratist(String name){
        this.name = name;
    }

    public BabyKaratist(String name, Combo... c){
        this.name = name;
        setCombo (c);
    }

    public void setCombo (Combo...c){
        comboList.addAll(Arrays.asList(c));
    }

    public String getName() {
        return name;
    }

    public List<Combo> getComboList() {
        return comboList;
    }

    @Override
    public String toString(){
        return name;
    }
}
