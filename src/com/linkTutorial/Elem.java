package com.linkTutorial;

public class Elem<V> {
    private V value;
    private Elem<V> nextElement;

    public void setValue(V val){
        value = val;
    }

    public V getValue() {
        return value;
    }

    public void setNextElement(Elem<V> next){
        nextElement = next;
    }

    public Elem<V> getNextElement() {
        return nextElement;
    }
}
