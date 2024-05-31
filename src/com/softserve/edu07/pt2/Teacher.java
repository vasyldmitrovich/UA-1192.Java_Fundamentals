package com.softserve.edu07.pt2;

 public class Teacher extends Staff{

     static final String TYPE_PERSON="Teacher";

     public Teacher(String name){
         super(name);
         System.out.println("I am a: "+ TYPE_PERSON);

     }
     public int salary() {
         return 15000;
     }

     @Override
     public void print() {
     }
 }
