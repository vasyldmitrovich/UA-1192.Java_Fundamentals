package ratio.softserve.academy;

import ratio.softserve.academy.edu01.hw.HomeWork1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, HomeWorkInterface> works = new HashMap<>();
        works.put(1, new HomeWork1());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the homework you want to run:");
        System.out.println("Select from the following options:");
        System.out.println(works.keySet() + "\n");

        HomeWorkInterface homeWork = works.get(scanner.nextInt());
        System.out.println("Enter the number of the homework part you want to run:");
        System.out.println("Select from the following parts:");
        System.out.println(homeWork.getSteps().keySet() + "\n");
        int homeworkNumberStep = scanner.nextInt();

        if (null != homeWork) {
            homeWork.accept(homeworkNumberStep);
        } else {
            System.out.println("Invalid homework number.");
        }
    }
}