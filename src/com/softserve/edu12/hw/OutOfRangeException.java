package com.softserve.edu12.hw;

public class OutOfRangeException extends Exception{
    public OutOfRangeException(int start, int end, int number) {
        super("You enter number " + number + " which is out of range [" + start + " - " + end + "]");
    }
}
