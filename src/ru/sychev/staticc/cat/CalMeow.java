package ru.sychev.staticc.cat;

import ru.sychev.animals.Cat;

public class CalMeow implements CatsMeow{
    int resMeow = 0;
    public CatsMeow catsMeow;

    public CalMeow (CatsMeow cat){
        this.catsMeow = cat;
    }

    @Override
    public void say() {
        catsMeow.say();
        resMeow++;
    }

    public int getResMeow() {
        return resMeow;
    }
}
