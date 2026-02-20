package co.edu.uptc.util;
import java.util.NoSuchElementException;

public class IteratorDL<T> implements java.util.Iterator<T> {

    DoubleLinkedList<T> list;
    int index;

    public  IteratorDL(DoubleLinkedList<T> list){
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
        throw new NoSuchElementException();
    }
        T data = list.get(index);
        index++;
        return data;
    }
    
}