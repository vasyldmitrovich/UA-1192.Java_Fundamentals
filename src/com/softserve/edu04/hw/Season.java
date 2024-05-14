package com.softserve.edu04.hw;

public enum Season {
    Winter("Winter season","\nExams time"),Spring("Spring", "\nSemester 1"),Summer("Summer", "\nHolidays"),Autumn("Autumn", "\nSemester2");

    String name;
    String description;

    Season(){
    }

    Season(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getInfo(){
        return "\nName of season: " + name + "\nInfo about education process: " + description;
    }

    public void showme(){
        System.out.println(getInfo());
    }
}
