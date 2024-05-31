package com.softserve.edu09.pt.pt1;

import java.util.List;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox() {
    }

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    ;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public HeavyBox changeWeight(List<HeavyBox> heavyBoxList, int index, int weight) {
        HeavyBox change = heavyBoxList.get(index);
        change.setWeight(weight);
        return change;
    }

    public HeavyBox removeSomeBox(List<HeavyBox> heavyBoxList, int index) {
        return heavyBoxList.remove(index);
    }

    @Override
    public String toString() {
        String lines = "-".repeat(40);
        String gap = "\n";
        return lines + gap + "Type: " + getClass().getSimpleName() + gap +
                "Weight: " + weight + gap +
                "Content: " + contents + gap + lines;
    }
}
