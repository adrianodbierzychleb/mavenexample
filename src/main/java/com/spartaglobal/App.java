package com.spartaglobal;

import com.spartaglobal.collectionexample.AxampleQueues;
import com.spartaglobal.collectionexample.ExampleLists;
import com.spartaglobal.collectionexample.ExampleQueuesTwo;
import com.spartaglobal.collectionexample.ExampleSets;
import com.spartaglobal.maps.ExampleMaps;
import com.spartaglobal.mavenexample.JavaAPIExamples;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


//        JavaAPIExamples number = new JavaAPIExamples();
//        number.mathExample();
//        number.timerExample();
//        number.dateTime();
//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingWithourSet();
//        exampleSets.printSet();

//        ExampleLists exampleLists = new ExampleLists();
//        exampleLists.printList();
//        AxampleQueues exampleQueues = new AxampleQueues();
//        exampleQueues.queueRunner();
//        ExampleQueuesTwo exampleQueuesTwo = new ExampleQueuesTwo();
//        exampleQueuesTwo.workingWithDeque();

        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(3));
        exampleMaps.loopThroughMap();


    }
}
