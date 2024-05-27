package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task93 {

    public static void execute(){
        ArrayList<Integer> myCollection = create(10);
        SimpleCollectionOperator sco = new SimpleCollectionOperator();
        System.out.println("Initial collection: " + myCollection);
        System.out.println();

        System.out.println("All positions of element more than 5");
        ArrayList<Integer> newCollection = sco.getPositions(5, myCollection);
        System.out.println(newCollection);
        System.out.println();

        System.out.println("Remove from collection elements, which are greater then 20.");
        System.out.println(sco.removeGreater(20,myCollection));
        System.out.println();

        System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5.");
        sco.insert(myCollection);
        System.out.println();

        System.out.println("Sort and print collection");
        myCollection.sort(Comparator.naturalOrder());
        System.out.println(myCollection);



    }

    public static ArrayList<Integer> create(int length){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i< length; i++){
            list.add(random.nextInt(50));
        }

        return list;
    }
}
