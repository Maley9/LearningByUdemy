package com.company.Interfejsy;

public class Car implements Vehicle{

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("STOP");

    }

    @Override
    public void turn() {

        System.out.println("Turning");
    }

    @Override
    public float getTopSpeed() {
        return 200;
    }
}
