package practice.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIterator<T> implements Iterator {

    ArrayList<T> objects = new ArrayList<T>();
    Integer index = 0;

    public SimpleIterator(ArrayList<T> objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        if (index < objects.size()){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return objects.get(index++);
    }

    @Override
    public String toString() {
        return "" + objects.get(index - 1);
    }
}
