package com.softserve.edu09.pt;

import java.util.Objects;

public class Content {

    private String name;
    private int weight;

    public Content(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
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
        Content content = (Content) o;
        return weight == content.weight && Objects.equals(name, content.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
