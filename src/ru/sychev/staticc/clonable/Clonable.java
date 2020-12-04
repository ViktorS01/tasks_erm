package ru.sychev.staticc.clonable;

import ru.sychev.geometry.BrokenLine;
import ru.sychev.geometry.ClosedLine;
import ru.sychev.geometry.Point;

public interface Clonable extends Cloneable{
    public BrokenLine getBrokenLine ();

    static void clone (Object...x){};
}
