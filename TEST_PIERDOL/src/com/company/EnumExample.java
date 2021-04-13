package com.company;

public class EnumExample {

    enum SoundVolume {LOW, MEDIUM, HIGH, MAX};

    public static void main(String[] args) {

        SoundVolume phone_sound = SoundVolume.LOW;
        System.out.println(phone_sound);
    }
}
