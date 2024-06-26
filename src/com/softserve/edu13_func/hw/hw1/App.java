package com.softserve.edu13_func.hw.hw1;

public class App {

        // Encrypt method
        public static String encrypt(String s, int n) {
            StringBuilder encrypted = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base + n) % 26 + base);
                }
                encrypted.append(c);
            }

            return encrypted.toString();
        }

        // Decrypt method
        public static String decrypt(String s, int n) {
            return encrypt(s, 26 - n);
        }

        public static void main(String[] args) {
            String original = "abc";
            int shift = 3;

            String encrypted = encrypt(original, shift);
            System.out.println("Encrypted: " + encrypted); // Output: "def"

            String decrypted = decrypt(encrypted, shift);
            System.out.println("Decrypted: " + decrypted); // Output: "abc"
        }
    }


