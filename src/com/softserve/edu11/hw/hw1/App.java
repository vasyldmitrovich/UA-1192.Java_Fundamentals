package com.softserve.edu11.hw.hw1;

public class App {
    public static void main(String[] args) {
        SentenceHelper sentenceHelper = new SentenceHelper();
        sentenceHelper.run();
        sentenceHelper.reverseSecondWord(sentenceHelper.getSentenceInArray());
    }
}
