package com.softserve.edu06.pt;

import java.util.Arrays;

public class Task63 {

    public static void execute(){
        System.out.println("Lets print some lines");

    Line[] lines = new Line[]{
            new Line(new Point(0, 4), new Point(2,2)),
            new ColorLine(new Point(1, 1), new Point(6,6), "red"),
            new Line(new Point(3, 7), new Point(15,21)),
            new ColorLine(new Point(3, 3), new Point(10,10), "green"),
            new Line(new Point(-1, 1), new Point(4,-8))
    };

        Arrays.stream(lines).forEach(line -> System.out.println(line.print()));
    }

}
