package com.linkTutorial;

public class ListaElementow<T> {
    Elem<T> firstElement = null;
    private int size = 0;

    public void add(T value){
        size++;
        Elem<T> current = firstElement;
        if (current == null){
            firstElement = new Elem<T>();
            firstElement.setValue(value);
        } else {
            while (current.getNextElement() != null){
                current = current.getNextElement();
            }
            current.setNextElement(new Elem<T>());
            current.getNextElement().setValue(value);
        }
    }

    public int length() {
        return size;
    }
    

    public Elem<T> getFirstElement(){
        return firstElement;
    }
}
