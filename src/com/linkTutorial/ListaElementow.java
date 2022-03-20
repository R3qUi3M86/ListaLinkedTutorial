package com.linkTutorial;

public class ListaElementow<T> implements ListaElementowInterfejs<T> {
    Elem<T> firstElement = null;
    
//    private int size = 0;

    public void add(T value){
//        size++;
        Elem<T> current = firstElement;
        if (current == null){
            firstElement = new Elem<>();
            firstElement.setValue(value);
        } else {
            while (current.getNextElement() != null){
                current = current.getNextElement();
            }
            current.setNextElement(new Elem<>());
            current.getNextElement().setValue(value);
        }
    }

    public int length() {
        Elem<T> current = firstElement;
        int counter = 0;
        while (current != null) {
                current = current.getNextElement();
                counter++;
        }
        return counter;
    }


    public Elem<T> getFirstElement(){
        return firstElement;
    }
}
