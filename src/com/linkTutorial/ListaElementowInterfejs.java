package com.linkTutorial;

import jdk.jshell.spi.ExecutionControl;

import java.util.Iterator;

public interface ListaElementowInterfejs<V> extends Iterable<V>, Iterator<V> {
    int length();
    void add(V val);
    Elem<V> get(int index);
    default Iterator<V> iterator(){
        return null;
    }

    @Override
    default V next(){
        return null;
    };

    @Override
    default boolean hasNext(){
        return false;
    };
}
