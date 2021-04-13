package com.company.InterfaceStaticFinal;

public class Example1 {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.searchForfood();

        System.out.println(parrot.getWingSpan());

        System.out.println(Flying.getDefaultNumWings());
    }
}
