package ru.sychev.staticc.cat;

import ru.sychev.animals.Cat;

public class CalMeow implements CatsMeow{
    int resMeow = 0;
    public CatsMeow asd;

    public CalMeow (CatsMeow cat){
        this.asd = cat;
    }

    @Override
    public void say() {
        asd.say();
        resMeow++;
    }

    public int getResMeow() {
        return resMeow;
    }
}
