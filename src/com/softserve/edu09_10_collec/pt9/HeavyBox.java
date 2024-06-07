package com.softserve.edu09_10_collec.pt9;

import java.util.Objects;

public class HeavyBox {// Good
    private int weight;
    private String contents;

    public HeavyBox() {
    }

    public HeavyBox(String contents, int weight) {
        this.contents = contents;
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight && Objects.equals(contents, heavyBox.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, contents);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "contents='" + contents + '\'' +
                ", weight=" + weight +
                '}';
    }
}
