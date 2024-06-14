package com.softserve.edu13.hw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Task131 {
    private LinkedList<String> alphabet;

    public Task131() {
        setAlphabet("abcdefghijklmnopqrstuvwxyz");
    }

    public Task131(String alphabet) {
        setAlphabet(alphabet);
    }


    public static void execute(){
        Task131 task131 = new Task131();
        String example = "abcZaBraCad15abra";

        System.out.println("Initial string: " + example);
        String encrypted = task131.encrypt(example, 3);
        System.out.println("Encrypted string: " + encrypted);
        System.out.println("Decrypted string: " + task131.decrypt(encrypted, 3));
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = Arrays.stream(alphabet.split("")).collect(Collectors.toCollection(LinkedList::new));
    }


    public String encrypt(String s, int n) {

        return process(s, n, true);
    }

    public String decrypt(String s, int n) {

        return process(s, n, false);
    }

    public String process(String s, int n, boolean enc) {
        if (s.isEmpty()) return "The string is empty";
        if (n == 0) return s;
        if (n < 0) return "Encryption shift is negative";

        StringBuilder encrypted = new StringBuilder();

        Predicate<String> isLetter = element -> Pattern.matches("^[A-Za-z]+$", element);
        Function<String, Integer> getNewIndex = element -> {
            int index;
            if (enc) {
                index = (alphabet.indexOf(element.toLowerCase()) + n) % alphabet.size();
            } else {
                index = alphabet.indexOf(element.toLowerCase()) - n;
                if(index < 0){
                    index = (alphabet.size() + index % alphabet.size()) % alphabet.size();
                }
            }
            return index;

        };

        Arrays.stream(s.split("")).forEach(s1 -> {
            if (isLetter.test(s1)) {
                String result = alphabet.get(getNewIndex.apply(s1));
                if (Character.isUpperCase(s1.charAt(0))) {
                    encrypted.append(result.toUpperCase());
                } else {
                    encrypted.append(result);
                }
            } else encrypted.append(s1);
        });

        return encrypted.toString();
    }

}
