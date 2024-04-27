package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class MoodQuestion {

    public static void startQuiz(Scanner scanner) throws IOException {
        String answer;
        System.out.println("How are you?");
        answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }
}
