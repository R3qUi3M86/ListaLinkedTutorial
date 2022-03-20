package com.linkTutorial;

public class ListaElementowArray<T> {
    private static final int INITIAL_CAPACITY = 2;
    private Elem[] elements = new Elem[INITIAL_CAPACITY];
    private int capacity = INITIAL_CAPACITY;
    private int length = 0;


    void add(T value) {
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

    public int length() {
        return length;
    }
}
