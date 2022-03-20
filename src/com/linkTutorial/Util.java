package com.linkTutorial;

public class Util<V> {
    int sum(ListaElementowInterfejs<Integer> lista){
        int result = 0;
        for(int i = 0; i< lista.length(); i++){
            result += lista.get(i).getValue();
        }
        return result;
    }
    Elem<V> getFirstElementValue(ListaElementowInterfejs<V> lista){
        return lista.get(0);
    }
    void makeSomeNoise(DajacyDzwiek rzecz){
        rzecz.makeNoise();
    }

    void makeBrzydkiNoise(Wiertarka wiertarka){
        wiertarka.makeNoise();
    }
    void makeBrzydkiNoise(Pies pies){
        pies.makeNoise();
    }

    void makeAbstractNoise(Drzwiekowa rzecz){
        rzecz.makeNoise();
    }
}
