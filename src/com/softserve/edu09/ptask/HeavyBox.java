package com.softserve.edu09.ptask;

public class HeavyBox {
    private int weight;
    private String contents_fields;

    public HeavyBox(int weight, String contents_fields) {
        this.weight = weight;
        this.contents_fields = contents_fields;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents_fields() {
        return contents_fields;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setContents_fields(String contents_fields) {
        this.contents_fields = contents_fields;
    }
}
