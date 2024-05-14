package com.softserve.academy.edu05.pt;

import java.util.Arrays;
import com.softserve.academy.edu05.pt.Pt5;

public class App {

    public static void main(String[] args) {
        int[] arrayInt = {25, 65, 32, 12, 45};

        System.out.println(Arrays.toString(Pt5.task1()));

        System.out.println(Pt5.task2(arrayInt));

        System.out.println(Pt5.task3(arrayInt));

        System.out.println(Pt5.task4(23));

        System.out.println(Arrays.toString(Pt5.task5()));

        Pt5.task6();
    }


}
