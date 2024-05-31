package com.softserve.edu07.pt;

 class Dog implements Animal {
     @Override
     public void voice() {
         System.out.println("Dog says: Woof!");
     }

     @Override
     public void feed() {
         System.out.println("The dog eats some tasty bone");

     }
 }
