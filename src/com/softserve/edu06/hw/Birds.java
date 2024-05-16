package com.softserve.edu06.hw;

class Birds {
    public static void birds() {

    }
    String name;

    Birds(String name) {
        this.name = name;
    }

    void fly() {

    }
}

class Eagle extends Birds {
    Eagle(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " Eagle , who can fly soo high");
    }
}

class Swallow extends Birds {
    Swallow(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + "Swallow , who can fly also");
    }
}

class Penguin extends Birds {
    Penguin(String name) {
        super(name);
    }
}

class Kiwi extends Birds {
    Kiwi(String name) {
        super(name);
    }
}
