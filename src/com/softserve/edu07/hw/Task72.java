package com.softserve.edu07.hw;
import com.softserve.edu07.hw.task72.*;

public class Task72 {

    public static void execute(){
        Boat calipso = new Boat();

        calipso.setPassengers(20);
        calipso.setVolume(100);
        calipso.isSailing();
        System.out.println(String.format("There are %d passengers on board, and volume is %d", calipso.getPassengers(), calipso.getVolume()));
        System.out.println();

        Bus schoolBus = new Bus();

        schoolBus.setPassengers(20);
        schoolBus.setRoute("North side - Center");
        schoolBus.drive();
        System.out.println(String.format("School bus carries %d kids, they are going by route \"%s\"", schoolBus.getPassengers(), schoolBus.getRoute()));


    }
}
