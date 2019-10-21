package com.spartaglobal.collectionexample;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ExampleQueuesTwo {
    //last in first out
    private Deque<String> carPark = new LinkedList<>();

    public ExampleQueuesTwo() {
        carPark.add("car1");
        carPark.add("car2");
        carPark.add("car3");

    }

    public void workingWithDeque(){
//        for(String car : carPark){
//            System.out.println(car);
//        }
        //poll removes
        carPark.removeLast();
        System.out.println(carPark.peekLast());

    }


}
