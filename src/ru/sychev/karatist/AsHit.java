package ru.sychev.karatist;
//одиночка
public class AsHit implements Hit{

    private static AsHit f = new AsHit();

    private AsHit(){}

    public static AsHit getAsHit (){
        return f;
    }

    @Override
    public void hit(BabyKaratist bk){
        bk.kick();
    }
}
