package com.company;

import java.io.Serializable;

public class Bird extends Animal implements Flyable, Serializable {

    @Override
    public void fly() {
        System.out.println("Flyyy");
    }


    public void eat(){
        System.out.println("Birds are eating");
    }

}
