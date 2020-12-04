package ru.sychev.math;

public class FractionExeption extends RuntimeException{
    public FractionExeption (String mes, Throwable runtimeException){
        super(mes, runtimeException);
    }

    public FractionExeption (String mes){
        super(mes);
    }
}
