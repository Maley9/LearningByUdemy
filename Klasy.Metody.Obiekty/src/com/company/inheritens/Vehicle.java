package com.company.inheritens;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle(){
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }

    public void printInfo(){
        System.out.println("Typ " + this.type + " Manufacturer " + this.manufacturer +
                " top speed " + this.topSpeed);
    }

}
