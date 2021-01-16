package ru.sychev.geometry;

import java.util.ArrayList;
import java.util.List;

public class MoveAll implements Moveable{
    List<Moveable> movelist = new ArrayList<>();

    public MoveAll(Moveable... moveables) {
        for (Moveable x : moveables) {
            movelist.add(x);
        }
    }

    @Override
    public void move(int x, int y) {
        for (Moveable j : movelist){
            j.move(x,y);
        }
    }

    public String toString (){
        return movelist.toString();
    }
}
