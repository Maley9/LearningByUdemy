package com.company.inheritens;

public class SuperCar extends Car{

    SuperCar(){
        type = "Super Car";
        topSpeed = 300;
    }

    public void setSportMode(){
        System.out.println("Sport Mode Activeted");
    }

}
