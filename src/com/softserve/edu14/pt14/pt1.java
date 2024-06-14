package com.softserve.edu14.pt14;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pt1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long countEmptyStrings = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings: " + countEmptyStrings);

        List<String> listWithoutEmptyStrings = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("List without empty strings: " + listWithoutEmptyStrings);

        String result = listWithoutEmptyStrings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase strings joined by comma: " + result);
    }
}
