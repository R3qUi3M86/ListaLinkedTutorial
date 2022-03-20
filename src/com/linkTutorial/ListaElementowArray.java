package com.linkTutorial;

import java.util.Iterator;
import java.util.function.Consumer;

public class ListaElementowArray<T> implements ListaElementowInterfejs<T>, Iterable<T>, Iterator<T> {
    private static final int INITIAL_CAPACITY = 2;
    private Elem<T>[] elements = new Elem[INITIAL_CAPACITY];
    private int capacity = INITIAL_CAPACITY;
    private int length = 0;
    private int currentIteration = 0;


    public void add(T value) {
        Elem<T> elem = new Elem<>();
        elem.setValue(value);
        if(length < capacity){
            elements[length++] = elem;
        } else {
            capacity *= 2;
            Elem[] newElements = new Elem[capacity];
            for (int i = 0; i < length; i++) {
                newElements[i] = elements[i];
            }
            newElements[length++] = elem;
            elements = newElements;
        }

    }

    @Override
    public Elem<T> get(int index) {
        if(index>=length()) return null;
        return elements[index];
    }

    public int length() {
        return length;
    }

    @Override
    public boolean hasNext() {
        return currentIteration<length;
    }

    @Override
    public T next() {
        return (elements[currentIteration++]).getValue();
    }

    @Override
    public Iterator<T> iterator() {
        currentIteration = 0;
        return this;
    }

}
