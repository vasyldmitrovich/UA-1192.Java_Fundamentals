package com.softserve.edu13.hw13;

public class task1 {

    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + n);
                if (Character.isLowerCase(c)) {
                    if (shifted > 'z') {
                        shifted -= 26;
                    }
                } else if (Character.isUpperCase(c)) {
                    if (shifted > 'Z') {
                        shifted -= 26;
                    }
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
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - n);
                if (Character.isLowerCase(c)) {
                    if (shifted < 'a') {
                        shifted += 26;
                    }
                } else if (Character.isUpperCase(c)) {
                    if (shifted < 'A') {
                        shifted += 26;
                    }
                }
                decrypted.append(shifted);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        String original = "abcXYZ";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
