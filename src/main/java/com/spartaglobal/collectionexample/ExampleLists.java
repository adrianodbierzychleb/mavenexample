package com.spartaglobal.collectionexample;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {

    private List<String> hobbies = new ArrayList<>();

    public ExampleLists() {

        workingWithOurList();
    }

    public void workingWithOurList(){
        hobbies.add("football");
        hobbies.add("coding");
        hobbies.add("motosport");

    }

    public void printList(){
//        System.out.println(" we are suing the Iterator....");
//        for(Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
//            String element = iterator.next();
//            System.out.println(element);
//        }

        for (String element: hobbies ) {
            System.out.println(element);
        }
    }


}
