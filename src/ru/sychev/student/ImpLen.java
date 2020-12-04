package ru.sychev.student;

import ru.sychev.staticc.len.Lenable;

public class ImpLen implements Lenable {
    String str;

    public ImpLen (String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}
