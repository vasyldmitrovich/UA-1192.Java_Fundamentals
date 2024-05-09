package com.softserve.edu04.hw;

import com.softserve.edu04.hw.entity.Dog;
import com.softserve.edu04.hw.entity.Faculty;
import com.softserve.edu04.hw.entity.StudySeason;
import com.softserve.edu04.hw.enums.Breed;
import com.softserve.edu04.hw.enums.HTTPError;
import com.softserve.utils.ScannerUtils;

import java.util.*;

public class AppHomework {
    public static void main(String[] args) {
        //hw1
        checkNumberRange();
        System.out.println("---------------------------------------");
        //hw2
        getMaxAndMinValues();
        System.out.println("---------------------------------------");
        //hw3
        getErrorByCode();
        System.out.println("---------------------------------------");
        //hw4
        createFacultyFromConsole();
        System.out.println("---------------------------------------");
        //hw5
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Tim", Breed.LABRADOR, 3));
        dogs.add(new Dog("Sofia", Breed.BORDER_COLLIE, 6));
        dogs.add(new Dog("Lola", Breed.AUSTRALIAN_SHEPHERD, 1));
//        dogs.add(new Dog("Tim", Breed.BORDER_COLLIE, 5));  // Added for demonstrating duplicate handling


        HashSet<String> dogNames = new HashSet<>();
        dogs.forEach(d -> {
            if (!dogNames.add(d.getName())) {
                System.out.println("We have the same names: " + d.getName());
            }
        });

        Optional<Dog> maxAgeDog = dogs.stream().max(Comparator.comparing(Dog::getAge));
        System.out.println(maxAgeDog.get());
    }


    private static void checkNumberRange() {
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(ScannerUtils.getValue("Input Number", Double.class));
        }
        Optional<Double> max = numbers.stream().max(Double::compare);
        Optional<Double> min = numbers.stream().min(Double::compare);
        if ( max.get() <= 5.0 && min.get() >= -5.0) {
            System.out.println("All numbers belong to the range -5.0 to 5.0");
        } else {
            System.out.println("Not all numbers belong to the range -5.0 to 5.0");
        }
    }

    private static void getMaxAndMinValues(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(ScannerUtils.getValue("Input Number", Integer.class));
        }
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.printf("Max is: %s | Min is: %s ", max.get() , min.get());
        System.out.println();
    }

    private static void getErrorByCode(){
        Integer errorCode = ScannerUtils.getValue("Input Error Code: ", Integer.class);
        HTTPError httpError = HTTPError.getErrorByCode(errorCode);
        System.out.println(httpError);
    }

    private static void createFacultyFromConsole(){
        Integer studentsCount = ScannerUtils.getValue("Enter students count ", Integer.class);
        String seasonInput = ScannerUtils.getValue("Enter season ", String.class);
        StudySeason season;
        try {
         season = StudySeason.valueOf(seasonInput.toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid season entered. Defaulting to Winter.");
            season = StudySeason.WINTER;
        }
        Faculty faculty = new Faculty(season, studentsCount);
        System.out.println("Faculty created with " + faculty.getStudentsCount() + " students during the " + faculty.getStudySeason());
    }
}
