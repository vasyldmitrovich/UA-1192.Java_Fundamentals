package com.softserve.edu01.pt;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            AverageTask.makeCalculation(sc);
            MathOperations.makeOperations(sc);
            MoodQuestion.startQuiz(sc);
            ReverseTask.makeReversion(sc);
        } catch (IOException ignored) {}

    }
}
