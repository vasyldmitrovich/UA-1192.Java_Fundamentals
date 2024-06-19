package com.softserve.edu13.hw;

public class Task1 {

    public static void main(String[] args) {
        String original = "abc";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("unencrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                char shifted = (char) (c + n);

                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    shifted = (char) (c - (26 - n));
                }

                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                char shifted = (char) (c - n);

                if ((Character.isLowerCase(c) && shifted < 'a') || (Character.isUpperCase(c) && shifted < 'A')) {
                    shifted = (char) (c + (26 - n));
                }

                decrypted.append(shifted);
            } else {
                decrypted.append(c);
            }
        }

        return decrypted.toString();
    }
}