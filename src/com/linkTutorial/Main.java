package com.linkTutorial;

public class Main {

    public static void main(String[] args) {

        ListaElementow<String> mojaList = new ListaElementow<>();
        mojaList.add("Ala ma kota");
        mojaList.add("Lata pszczola");
        mojaList.add("3");
        mojaList.add("4e");
        mojaList.add("5 element");

        ListaElementow<String> emptyList = new ListaElementow<>();
        ListaElementow<String> singleList = new ListaElementow<>();
        singleList.add("ONLY ONE");

//        System.out.println(mojaList.length());
//        System.out.println(emptyList.length());
//        System.out.println(singleList.length());

        ListaElementowArray<String> listaElementowArray = new ListaElementowArray<>();

        listaElementowArray.add("test1");
        listaElementowArray.add("test2");
        listaElementowArray.add("test3");

        System.out.println(listaElementowArray.length());

    }
}