package com.softserve.edu13.pt;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PracticalTasksMethods ptm = new PracticalTasksMethods();
        ptm.DayOfTheWeek();
        ptm.getDateOf();
        List<String> list = Arrays.asList("Soft", "Serve", "Academy", "BBB", "CCC");
        List<String> sorted = ptm.sortList(list);
        System.out.println(list);
        System.out.println(sorted);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listAfter = ptm.count(arr, ptm.notEven);
        listAfter.forEach(System.out::println);

    }

}
