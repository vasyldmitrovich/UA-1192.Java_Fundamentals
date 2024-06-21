package com.softserve.edu13.hw.hw1;

public class APP {
    public static void main(String[] args) {
        String original = "Andrew Tandyryak";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        StringBuilder encryptedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) ('A' + (currentChar - 'A' + n) % 26);
                encryptedString.append(encryptedChar);
            }

            else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) ('a' + (currentChar - 'a' + n) % 26);
                encryptedString.append(encryptedChar);
            }

            else {
                encryptedString.append(currentChar);
            }
        }
        return encryptedString.toString();
    }

    public static String decrypt(String s, int n) {

        return encrypt(s, 26 - (n % 26));
    }
}
