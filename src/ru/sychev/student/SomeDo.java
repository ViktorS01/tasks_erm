package ru.sychev.student;

import java.util.List;

public interface SomeDo <T, R> {
    R act(T t);
}
