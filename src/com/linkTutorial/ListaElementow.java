package com.linkTutorial;

public class ListaElementow<T> {
    Elem<T> firstElement = null;

    public void add(T value){
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

    public Elem<T> getFirstElement(){
        return firstElement;
    }
}
