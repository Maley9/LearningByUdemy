package com.company.ObjectExamp;

class Carobject{

   private String manufacturer;
   private String model;
   private int year;

    public Carobject(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Carobject{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        Carobject car = new Carobject("Ford", "Fiesta", 2010);
        System.out.println(car.toString());
        System.out.println(car.hashCode());

        Carobject car2 = new Carobject("Dodge", "Charger", 1950);
        Carobject car3 = new Carobject("Dodge", "Charger", 1950);

        if(car3.equals(car2)){
            System.out.println("Rowne referencje");
        }
        else{
            System.out.println("inne obiekty");
        }
    }
}
