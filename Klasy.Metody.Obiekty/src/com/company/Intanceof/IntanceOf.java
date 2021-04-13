package com.company.Intanceof;


class Animal{
    protected String name;
    protected float weight;
    protected int numLegs;
}

class Dog extends Animal{
    protected void bark(){
        System.out.println("HAŁ HAŁ MADAFAKER");
    }
}

class Bird extends Animal{
    protected void fly(){
        System.out.println("LECEM BO CHCEM");
    }
}

class Parrot extends Bird{
    protected void learnWord(){
        System.out.println("JA MOWIE");
    }
}

public class IntanceOf {
    public static void main(String[] args) {

        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        System.out.println(result); //true

        Animal animal = new Animal();
        System.out.println(animal instanceof Dog); //false

        Bird bird = new Bird();
        System.out.println(bird instanceof Animal); //true

        Parrot parrot = new Parrot();
        System.out.println(parrot instanceof Parrot); //true
        System.out.println(animal instanceof Parrot); //false
    }
}
