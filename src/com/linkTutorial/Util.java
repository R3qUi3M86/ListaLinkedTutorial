package com.linkTutorial;

public class Util<V> {
    int sum(ListaElementowInterfejs<Integer> lista){
        int result = 0;
        for(int i = 0; i< lista.length(); i++){
            result += lista.get(i).getValue();
        }
        return result;
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
