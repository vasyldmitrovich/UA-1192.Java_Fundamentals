package com.softserve.edu04_cond.enum_examples;

public enum Season {

    //***Enum 1***
    WINTER, SPRING, SUMMER, AUTUMN


    //***Enum 2***
/*
    WINTER("Winter1"),
    SPRING("Spring1"),
    SUMMER("Summer1"),
    AUTUMN("Autumn1");

    private String name;
    //
    private Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " ***toString() = " + name;
    }

    public Season nextSeason() {
        if (this == Season.WINTER) {
            return SPRING;
        }
        if (this == Season.SPRING) {
            return SUMMER;
        }
        if (this == Season.SUMMER) {
            return Season.AUTUMN;
        }
        return Season.WINTER;
    }
*/

    //***Enum 3***
/*
    WINTER("Winter") {
        public Season nextSeason() { return SPRING; }
    },
    SPRING("Spring") {
        public Season nextSeason() {
            System.out.println("****");
            return SUMMER; }
    },
    SUMMER("Summer") {
        public Season nextSeason() { return AUTUMN; }
    },
    AUTUMN("Autumn") {
        public Season nextSeason() { return WINTER; }
    };

    private String name;
    //
    private Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract Season nextSeason();
*/


    //***Enum 4***
/*
    WINTER("Winter", "Dec", "Jan", "Feb") {
        public Season nextSeason() {
            return SPRING;
        }
    },
    SPRING("Spring", "March", "App", "may") {
        public Season nextSeason() {
            return SUMMER;
        }
    },
    SUMMER("Summer", "Jun", "Jul", "Aug") {
        public Season nextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("Autumn", "", "", "") {
        public Season nextSeason() {
            return WINTER;
        }
    };

    private String name;
    private String firstMonth;
    private String secondMonth;
    private String thirdMonth;

    //
    private Season(String name, String firstMonth, String secondMonth,
                   String thirdMonth) {
        this.name = name;
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
    }

    @Override
    public String toString() {
        return name + getMonth();
    }

    public String getMonth() {
        return "  month: " + firstMonth + ", " + secondMonth + ", " + thirdMonth;
    }

    public abstract Season nextSeason();  //I did abstract method
*/
}
