package com.linkTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListaElementow<String> mojaList = new ListaElementow<>();
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

        ListaElementowInterfejs<Integer> listaElementowBedacychIntami = new ListaElementowArray<>();
        listaElementowBedacychIntami.add(1);
        listaElementowBedacychIntami.add(5);
        listaElementowBedacychIntami.add(3);

        ListaElementowInterfejs<Integer> listaElementowBedacychIntamiInna = new ListaElementow<>();
        listaElementowBedacychIntamiInna.add(1);
        listaElementowBedacychIntamiInna.add(3);
        listaElementowBedacychIntamiInna.add(4);

        //ListaElementowInterfejs<Integer> zlaLista = new ListaElementowInterfejs<Integer>() ; <- to nie zadziala
        Util<Integer> test = new Util<>();
        System.out.println("suma: "+test.sum(listaElementowBedacychIntami));
        System.out.println("suma (2): "+test.sum(listaElementowBedacychIntamiInna));

        Wiertarka wiertarka = new Wiertarka();
        Pies pies = new Pies();

        test.makeSomeNoise(wiertarka);
        test.makeSomeNoise(pies);

        NowyRodzajPsa nowyPies = new NowyRodzajPsa();
        NowyRodzajWiertarki nowaWiertarka = new NowyRodzajWiertarki();

        test.makeAbstractNoise(nowyPies);
        test.makeAbstractNoise(nowaWiertarka);
/*
        for(ListaElementowArray<String> el : listaElementowArray){

        }*/
        Iterator<String> iter = ((ListaElementowArray<String>) listaElementowArray).iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        for(String test5 : listaElementowArray){
            System.out.println(test5);
        }

        Util<String> innyUtil = new Util<>();
        System.out.println(innyUtil.getFirstElementValue(listaElementowArray).getValue());
    }
}