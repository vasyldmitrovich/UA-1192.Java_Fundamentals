package com.softserve.edu09.pt;

public class HeavyBox {
   private int weight;
   public String contents;// Why public?

   //constructor
   public HeavyBox(int weight, String contents) {
      this.weight = weight;
      this.contents = contents;
   }
   // Геттери і сеттери для полів weight і contents
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

   @Override
   public String toString() {
      return "HeavyBox{" +
              "weight=" + weight +
              ", contents='" + contents + '\'' +
              '}';

   }
}


