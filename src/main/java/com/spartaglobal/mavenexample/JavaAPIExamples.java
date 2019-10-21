package com.spartaglobal.mavenexample;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAPIExamples {

    public void mathExample(){
        System.out.println(Math.sqrt(25));
    }

    private TimerTask timerTask(){
        return new TimerTask() {
            @Override
            public void run() {
                System.out.println("here is a rabbit");
            }
        };
    }

    public void timerExample(){
        Timer timer = new Timer();
        timer.schedule(timerTask(),10,100);
        System.out.println(timer);
    }


    public void dateTime(){
       // System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(1996, 5,1);
     //   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.getDayOfWeek());
    }
}
