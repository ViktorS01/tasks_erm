package ru.sychev.student;

public class Creating implements SomeDo<String, Integer>{
    @Override
    public Integer act(String t) {
        return t.length();
    }
}

