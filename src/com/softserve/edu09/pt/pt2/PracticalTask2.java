package com.softserve.edu09.pt.pt2;

import java.util.Set;

public class PracticalTask2 {

    public static void main(String[] args) {// Ok
        boolean check = false;
        NumsMethods nM = new NumsMethods();
        String numbers = nM.input();
        String[] inputtedNumbers = nM.inputToArray(numbers);
        Set<String> noreps = nM.noRepeats(inputtedNumbers);
        nM.findDups(inputtedNumbers);
    }
}

