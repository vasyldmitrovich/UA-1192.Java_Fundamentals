package com.softserve.edu11.hw.hw1;

public class SentenceHelper {// Ok
    private String sentence = "I study Java in SoftServe Academy";
    private String[] sentenceInArray = sentence.split(" ");

    public String[] getSentenceInArray() {
        return sentenceInArray;
    }

    public void run() {
        String longestWord = findLongest(sentenceInArray);
        lettersQuant(longestWord);
    }

    public String findLongest(String[] words) {
        System.out.println(sentence);
        String longestWord = words[0];
        for (var word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in sentence \"" + sentence + "\" is: " + longestWord);
        return longestWord;
    }

    public int lettersQuant(String word) {
        System.out.println("The number of letter in word \"" + word + "\" " + "is: " + word.length());
        return word.length();
    }

    public void reverseSecondWord(String[] words) {
        StringBuilder secWord = new StringBuilder(words[1]);
        System.out.println("Second word is: " + secWord);
        secWord.reverse();
        System.out.println("Second word in reverse: " + secWord);
    }


    public static void main(String[] args) {
        SentenceHelper sentenceHelper = new SentenceHelper();
        sentenceHelper.run();
        sentenceHelper.reverseSecondWord(sentenceHelper.sentenceInArray);
    }
}


