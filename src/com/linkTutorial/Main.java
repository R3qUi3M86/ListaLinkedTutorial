package com.linkTutorial;

public class Main {

    public static void main(String[] args) {

        ListaElementowInterfejs<String> mojaList = new ListaElementow<>();
        mojaList.add("Ala ma kota");
        mojaList.add("Lata pszczola");
        mojaList.add("3tetete3");
        mojaList.add("4e");
        mojaList.add("5 element");

        System.out.println(mojaList.get(0).getValue());
        System.out.println(mojaList.get(1).getValue());
        System.out.println(mojaList.get(2).getValue());
        ListaElementowInterfejs<String> emptyList = new ListaElementow<>();
        ListaElementowInterfejs<String> singleList = new ListaElementow<>();
        singleList.add("ONLY ONE");

//        System.out.println(mojaList.length());
//        System.out.println(emptyList.length());
//        System.out.println(singleList.length());

        ListaElementowInterfejs<String> listaElementowArray = new ListaElementowArray<>();

        listaElementowArray.add("test1");
        listaElementowArray.add("test2");
        listaElementowArray.add("test3");

        System.out.println(listaElementowArray.get(0).getValue());
        System.out.println(listaElementowArray.get(1).getValue());
        System.out.println(listaElementowArray.get(2).getValue());
        System.out.println(listaElementowArray.length());

    }
}