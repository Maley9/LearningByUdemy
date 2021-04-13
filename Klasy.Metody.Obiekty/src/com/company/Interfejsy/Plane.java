package com.company.Interfejsy;

public class Plane implements Vehicle, Flying {
    @Override
    public void move() {
        System.out.println("Flying");
    }

    @Override
    public void stop() {
        System.out.printf("STOP");
    }

    @Override
    public void turn() {
        System.out.println("GO to right");
    }

    @Override
    public float getTopSpeed() {
        return 2000;
    }

    @Override
    public void increaseHeight() {
        System.out.println("Go higher");

    }

    @Override
    public void decreaseHeight() {
        System.out.println("WE ARE FALLING!!");


    }
}
