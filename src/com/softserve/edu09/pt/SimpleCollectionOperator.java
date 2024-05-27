package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SimpleCollectionOperator {

    public ArrayList<Integer> getPositions(int ref, ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > ref) {
                result.add(i);
            }
        }

        return result;
    }

    public ArrayList<Integer> removeGreater(int ref, ArrayList<Integer> numbers) {

        return new ArrayList<>(numbers.stream().filter(integer -> integer < ref).collect(Collectors.toList()));
    }

    public void insert(ArrayList<Integer> numbers) {
        LinkedList<Integer> list = new LinkedList<>(numbers);

        list.add(2, 1);
        list.add(8, -3);
        list.add(5, -4);

        numbers = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("position - %s, value of element - %s%n", i, list.get(i));
        }
    }
}
