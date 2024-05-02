package com.softserve.edu03.hw;


public class AppHw33 {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        for(int i=0; i < 5; i++){
            persons[i] = new Person();
            persons[i].input();
        }
        for (Person person: persons) {
            person.output();
        }




    }
}



