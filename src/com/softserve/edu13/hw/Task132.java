package com.softserve.edu13.hw;

import com.softserve.edu07.hw.task72.Passengers;

import java.util.regex.Pattern;

public class Task132 {
/*
Create method to validate date according to format "mm.dd.yy"
 */

    public static boolean validate(String date){// Nice, it is nice
        return Pattern.matches("^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$", date);
    }

}
