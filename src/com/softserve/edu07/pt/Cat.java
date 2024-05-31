package com.softserve.edu07.pt;

 class Cat implements Animal {

     @Override
     public void voice() {
         System.out.println("Cat says: Meow");
     }

     @Override
     public void feed() {
         System.out.println("The cat eats its jelly food\n");

     }
 }


