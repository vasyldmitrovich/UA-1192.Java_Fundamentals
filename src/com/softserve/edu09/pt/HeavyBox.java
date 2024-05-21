package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeavyBox {

    private static final String[] CONTENTS = {"ball", "cube", "pyramid", "sphere", "cat"};
    private static final Random RAND = App.RAND;

    //remove field weight and add method weight() that
    //sum all contents' weight
    private int weight;
    private final List<Content> contents;

    public HeavyBox() {
        weight = 0;
        contents = new ArrayList<>();
    }

    public static HeavyBox generateBox() {
        HeavyBox box = new HeavyBox();

        for (int i = 0; i < RAND.nextInt(3) + 1; i++) {
            String content = CONTENTS[RAND.nextInt(CONTENTS.length)];
            int weight = RAND.nextInt(10) + 1;
            box.addContent(content, weight);
        }

        return box;
    }

    public void addContent(String name, int weight) {
        contents.add(new Content(name, weight));
        this.weight += weight;
    }

    public void addContent(Content content) {
        contents.add(content);
        weight += content.getWeight();
    }

    public Content getContent(int index) {
        try {
            return contents.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void removeContent(Content content) {
        contents.remove(content);
        weight -= content.getWeight();
    }

    public int getWeight() {
        return weight;
    }

    public void clearContents() {
        contents.clear();
        weight = 0;
    }

    public void printContents() {
        System.out.println("HeavyBox " + hashCode() + " {");

        for (Content content : contents) {
            System.out.printf("\tContent: %s, Weight: %d%n",
                    content.getName(), content.getWeight());
        }

        System.out.println("}");
    }

}
