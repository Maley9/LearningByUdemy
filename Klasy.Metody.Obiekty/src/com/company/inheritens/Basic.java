package com.company.inheritens;

public class Basic {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.printInfo();

        Car car2 = new Car("Dodge", 200.0f);
        car2.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar superCar = new SuperCar();

        superCar.printInfo();
        superCar.setSportMode();

    }
}
