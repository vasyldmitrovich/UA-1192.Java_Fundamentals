package com.softserve.edu09.pt;

import java.util.ArrayList;

public class Task91 {
/*
Create a dynamic array containing objects of the HeavyBox class which includes int weight
and String contents fields. Output its contents using for-each loop.
• Change the weight of the first box by 1.
• Remove the last box.
• Output result to the console. Remove all boxes and output result to the console.
 */

    public static void execute() {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        String[] contents = new String[]{"Nuts", "Bolts", "Nails", "Clay", "Candies"};
        int[] weights = new int[]{4, 6, 5, 3, 4};

        for (int i = 0; i < 5; i++){
            boxes.add(new HeavyBox(contents[i], weights[i]));
        }
        System.out.println("Initial content:");
        System.out.println(boxes);

        boxes.get(0).setWeight(1);
        boxes.remove(boxes.size()-1);

        System.out.println("Modified content:");
        System.out.println(boxes);

        boxes.clear();
        System.out.println("Cleared content:");
        System.out.println(boxes);

    }

}
