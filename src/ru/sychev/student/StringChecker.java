package ru.sychev.main;

import ru.sychev.student.Checker;

public class StringChecker implements Checker<String> {

    @Override
    public boolean check(String t){
        return  "ok".equals(t) || "not ok".equals(t);
    }

}
