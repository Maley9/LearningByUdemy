package com.company.Interfejsy;

public class Example {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();


        // NIE MOZEMY STWORZYC INSTANCJI NA BAZIE INTERFACE
        Vehicle vehicle = car;

        System.out.println(vehicle.getTopSpeed());
        vehicle.move();
        vehicle.stop();

        Vehicle car2 = new Car();
        car2.turn();

        Car sumCar = (Car)car2;
        System.out.println("car2 " + sumCar.getTopSpeed());

        //PLANE

        Plane plane = new Plane();

        plane.move();
        System.out.println(plane.getTopSpeed());

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = car2;
        vehicles[2] = plane;

        vehicles[2].move();

        if(vehicles[2] instanceof Plane){
            Plane somePlane = (Plane)vehicles[2];
            somePlane.turn();

            Flying flyingVehicle = somePlane;
            flyingVehicle.increaseHeight();

        }
    }
}
