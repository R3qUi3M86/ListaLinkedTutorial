package com.linkTutorial;

public class Main {

    public static void main(String[] args) {

        ListaElementow<String> mojaList = new ListaElementow<>();
        mojaList.add("Ala ma kota");
        mojaList.add("Lata pszczola");
        mojaList.add("sfa");

        System.out.println(mojaList.getFirstElement().getValue());

    }
}