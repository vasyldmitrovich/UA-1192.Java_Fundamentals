package com.softserve.edu09.pt.pt1;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PracticalTask1 {
    public static void main(String[] args) {// Good

        practicalTask1();

    }

    public static void practicalTask1() {
        List<HeavyBox> heavyBoxList = new ArrayList<HeavyBox>();
        HeavyBox hbObj = new HeavyBox();
        heavyBoxList.add(new HeavyBox(8, "Books")); //will be change
        heavyBoxList.add(new HeavyBox(14, "Tools"));
        heavyBoxList.add(new HeavyBox(12, "Garbage")); //will remove
        hbObj.changeWeight(heavyBoxList, 0, 999);
        hbObj.removeSomeBox(heavyBoxList, 2);
        for (HeavyBox string : heavyBoxList) {
            System.out.println(string);
        }
    }
}