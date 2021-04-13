package com.company.InterfaceStaticFinal;

public class Parrot implements Bird{

    @Override
    public int getNumleg() {
        return 2;
    }

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public void eat() {
        System.out.println("eating");

    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");

    }

    @Override
    public void searchForfood() {
        System.out.println("Parrot is searching for food");
    }
}
