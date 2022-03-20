package com.linkTutorial;

public abstract class Drzwiekowa implements DajacyDzwiek{
    //abstract void makeNoise();

    @Override
    public void makeNoise() {
        System.out.println("defaultowa implementacja");
    }
}
