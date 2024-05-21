package com.softserve.edu09.pt;

import java.util.*;

public class App {

    public static final Random RAND = new Random(System.currentTimeMillis());
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateBoxTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateNumbersTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateCollectionTask();
    }

    private static void demonstrateBoxTask() {
        List<HeavyBox> boxes = generateBoxes(3);
        printBoxesContent(boxes);
        System.out.println();

        demonstrateChangeWeightTask(boxes);
        System.out.println();

        removeLastBoxTask(boxes);
        System.out.println();

        removeAllBoxes(boxes);

        if (boxes.isEmpty()) {
            System.out.println("There is no boxes");
        }
    }

    private static List<HeavyBox> generateBoxes(int size) {
        List<HeavyBox> boxes = new ArrayList<>(size);
        for (int i = 0; i < 3; i++) {
            HeavyBox box = HeavyBox.generateBox();
            boxes.add(box);
        }
        return boxes;
    }

    private static void printBoxesContent(List<HeavyBox> boxes) {
        System.out.println("Boxes:");
        for (HeavyBox box : boxes) {
            box.printContents();
        }
    }

    private static void demonstrateChangeWeightTask(List<HeavyBox> boxes) {
        System.out.println("Change box weight (via content):");
        Content firstBoxContent = boxes.get(0).getContent(0);
        firstBoxContent.setWeight(firstBoxContent.getWeight() + 1);
        boxes.get(0).printContents();
    }

    private static void removeLastBoxTask(List<HeavyBox> boxes) {
        boxes.remove(boxes.size() - 1);
        //or next but hashcode/equals required and more complex
//        boxes.remove(boxes.get(boxes.size() - 1));
        printBoxesContent(boxes);
    }

    private static void removeAllBoxes(List<HeavyBox> boxes) {
        boxes.clear();
        printBoxesContent(boxes);
    }

    private static void demonstrateNumbersTask() {
        System.out.print("Input line of numbers by comma ',': ");
        String numbersLine = SC.nextLine();
        String[] numbers = numbersLine.split(",");

        numbers = removeDuplicates(numbers);
        System.out.println("Without duplicates:");
        System.out.println(Arrays.toString(numbers));
    }

    private static String[] removeDuplicates(String[] strings) {
        List<String> list = new ArrayList<>();

        for (String string : strings) {
            if (!list.contains(string)) {
                list.add(string);
            }
        }

        return list.toArray(new String[0]);
    }

    private static void demonstrateCollectionTask() {
        List<Integer> myCollection = generateIntegersList(10);
        printCollection(myCollection);
        System.out.println();

        List<Integer> moreThanFivePositions = moreThanFivePositions(myCollection);
        printCollection(moreThanFivePositions);
        System.out.println();

        removeMoreThanTwenty(myCollection);
        printCollection(myCollection);
        System.out.println();

        resetSomeValues(myCollection);
        specialIntegersPrint(myCollection);
        System.out.println();

        System.out.println("Sorted:");
        myCollection.sort(Integer::compareTo);
        printCollection(myCollection);
    }

    private static void printCollection(Iterable<?> collection) {
        System.out.println("Some collection:");
        System.out.print('[');

        Iterator<?> iter = collection.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().toString());

            if (iter.hasNext()) {
                System.out.print(' ');
            }
        }
        System.out.println(']');
    }

    private static List<Integer> generateIntegersList(int size) {
        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            list.add(RAND.nextInt(200) - 100);
        }

        return list;
    }

    private static List<Integer> moreThanFivePositions(List<Integer> list) {
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                positions.add(i);
            }
        }

        return positions;
    }

    private static void removeMoreThanTwenty(List<Integer> list) {
        int index = 0;

        while (index < list.size()) {
            if (list.get(index) > 20) {
                list.remove(index);
            } else {
                index++;
            }
        }
    }

    //after removing numbers more than 20,
    //we can't be sure our collection still will have 8/5/1 elements
    private static void resetSomeValues(List<Integer> list) {
        try {
            list.set(1, 2);
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            list.set(8, -3);
        } catch (IndexOutOfBoundsException ignored) {}
        try {
            list.set(5, -4);
        } catch (IndexOutOfBoundsException ignored) {}
    }

    private static void specialIntegersPrint(List<Integer> list) {
        System.out.println("Special print:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("\tposition - %d, value of element - %d%n",
                    i, list.get(i));
        }
    }
}
