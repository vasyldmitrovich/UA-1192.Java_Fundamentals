package com.softserve.edu09.pt;

public class StringToIntParser {

    public static int[] parse(String input){
        int[] result;
        String[] splitted = input.split(",");// Ok
        result = new int[splitted.length];

        for (int i=0; i<splitted.length; i++){
            result[i] = Integer.parseInt(splitted[i].strip());
        }

        return  result;
    }
}
