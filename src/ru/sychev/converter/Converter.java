package ru.sychev.converter;

public abstract class Converter{
    abstract void  read (String str);
    abstract  void conv();
    abstract  void write (String str);

    public void convert (String in, String out){
        read(in);
        conv();
        write(out);
    }
}

//шаблонный метод
