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

    @Override
    public Elem<T> get(int index) {
        if(index>=length()) return null;
        if(index==0) return firstElement;
        Elem<T> current = firstElement.getNextElement();
        int i = 1;
        while(true){
            if(index==i){
                return current;
            } else {
                current = current.getNextElement();
                i++;
            }
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
