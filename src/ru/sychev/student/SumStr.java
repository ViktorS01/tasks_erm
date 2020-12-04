package ru.sychev.staticc;

public class SumStr extends Number{
    String str;

    public SumStr (String str){
        this.str = str;
    }

    @Override
    public int intValue() {
        int res = 0;
        char [] strToChar = str.toCharArray();
        for (char x: strToChar){
            res += (int)x;
        }
        return res;
    }

    @Override
    public long longValue() {
        long res = 0;
        char [] strToChar = str.toCharArray();
        for (char x: strToChar){
            res += (long)x;
        }
        return res;
    }

    @Override
    public float floatValue() {
        float res = 0;
        char [] strToChar = str.toCharArray();
        for (char x: strToChar){
            res += x;
        }
        return res;
    }

    @Override
    public double doubleValue() {
        double res = 0;
        char [] strToChar = str.toCharArray();
        for (char x: strToChar){
            res += x;
        }
        return res;
    }
}
