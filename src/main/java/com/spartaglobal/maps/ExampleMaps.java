package com.spartaglobal.maps;

import com.spartaglobal.collectionexample.ExampleQueuesTwo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();

    public ExampleMaps(){
        studentsInClass.put(1,"Ed");
        studentsInClass.put(2, "Nik");
        studentsInClass.put(3,"Fab");

    }

    public String returnValue(int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();

        for(String str:values){
            System.out.println(str);
        }

    }



}
