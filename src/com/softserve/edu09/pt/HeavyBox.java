package com.softserve.edu09.pt;

import java.util.Scanner;

public class HeavyBox {
    private int weight;
    private String contents;
    public static Scanner scanner = new Scanner(System.in);
    public HeavyBox(){
        System.out.println("Create new Heavy box");
        System.out.println("Enter box content");
        contents=scanner.nextLine();
        System.out.println("Enter box weight");
        weight=scanner.nextInt();
        scanner.nextLine();
    }
    public HeavyBox(int weight,String contents){
        this.weight=weight;
        this.contents=contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

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
}
