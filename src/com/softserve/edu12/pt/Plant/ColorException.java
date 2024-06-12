package com.softserve.edu12.pt.Plant;

public class ColorException  extends IllegalArgumentException{

    public ColorException() {
        super("You entered wrong plant color");
    }
}
