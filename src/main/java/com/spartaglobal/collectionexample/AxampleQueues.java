package com.spartaglobal.collectionexample;

import java.util.LinkedList;
import java.util.Queue;

public class AxampleQueues {
    private Queue<String> stringQueue = new LinkedList<>();
    //first in first out
    public AxampleQueues() {

        stringQueue.add("one");
        stringQueue.add("two");
        stringQueue.add("three");

    }

    public void queueRunner(){
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.remove());
        for (String element : stringQueue) {
            System.out.println(element);
        }


    }

}
