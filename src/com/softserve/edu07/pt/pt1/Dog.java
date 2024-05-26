package com.softserve.edu07.pt.pt1;

public class Dog implements Animal {
    private String name;
    private String breed;
    private String voice;
    private boolean feed;

    public Dog() {
    }

    public Dog(String name, String breed, String voice, boolean feed) {
        this.name = name;
        this.breed = breed;
        this.voice = voice;
        this.feed = feed;
    }

    private String getName() {
        return "Name: " + name;
    }

    private String getBreed() {
        return "Breed: " + breed;
    }

    private String getVoice() {
        return voice;
    }

    @Override
    public String voice() {
        return "This dog is saying: " + getVoice();
    }

    @Override
    public String feed() {
        if (!feed) {
            return "Is hungry";
        }
        return "Isn't hungry";
    }

    @Override
    public String getInfo() {
        String gap = "\n";
        return "-".repeat(40) + gap + "Type: " + getClass().getSimpleName() +
                gap + getName() + gap + getBreed() + gap + voice() + gap + feed() + gap + "-".repeat(40);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", voice='" + voice + '\'' +
                ", feed=" + feed +
                '}';
    }
}

