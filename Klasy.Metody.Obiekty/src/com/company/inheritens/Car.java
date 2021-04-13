package com.company.inheritens;

public class Car extends Vehicle{
    Car(){

        // super(); -- ODWOLANIE SIE DO KLASY NADRZEDNIEJ


        this.type = "car";
        this.manufacturer = "ford";
        this.topSpeed = 200;
    }

    Car(String manufacturer, float topSpeed){

        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }

}
