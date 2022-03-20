package com.linkTutorial;

public interface ListaElementowInterfejs<V> {
    int length();
    void add(V val);
    Elem<V> get(int index);
}
