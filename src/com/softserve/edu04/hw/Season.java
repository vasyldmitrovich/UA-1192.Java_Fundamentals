package com.softserve.edu04.hw;

enum Season{
    WINTER("Winter exams"), SPRING("Second semester"), SUMMER("Vacation"), FALL("First semester");

    private String period;

    Season(String period){
        this.period = period;
    }

    public String getPeriod(){
        return period;
    }

}