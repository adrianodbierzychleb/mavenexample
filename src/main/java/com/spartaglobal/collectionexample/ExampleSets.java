package com.spartaglobal.collectionexample;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    //set unordered list with no duplicates
    private Set<String> newSet = new HashSet<String>();

    public void workingWithourSet(){
        newSet.add("cheese");
        newSet.add("beer");
        newSet.add("bread");


    }

    public void printSet(){
        System.out.println(newSet.contains("bread"));

        for(String shoppingItem : newSet){
            System.out.println(shoppingItem);
        }

    }


}
