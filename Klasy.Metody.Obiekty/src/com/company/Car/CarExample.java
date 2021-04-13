package com.company.Car;


class Radio{
    int yearProd;
    int volume;
    String station;

    Radio(){
        this.yearProd = 2000;
        volume = 100;  //TO SAMO co this.volume =100;
    }

    Radio(int yearProd){
        this(); /// WYWOLANIE KONSTRUKTORA BEZARGUMENTOWEGO
        this.yearProd = yearProd;
        this.changeStation("rock");  // Mozemy odwolać się też do METODY
    }

    public void changeStation(String newStation){
        this.station = newStation;
    }

    public Radio getRadio(){
        return this;
    }

    public void printRadioInfo(Radio radio){
        System.out.println(radio.yearProd);
    }

}


class Car {

    String manufacturer, color, name;
    int year;
    float topSpeed;


    public Car(String manufacturer, String color, String name, int year, float topSpeed) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.name = name;
        this.year = year;
        this.topSpeed = topSpeed;
    }


    public void printInfo(){
        System.out.println(this.manufacturer + " " + this.name + " "
                + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car ford = new Car("ford", "red", "fiesta", 11, 230.0f);
        ford.printInfo();

        //RADIO

        Radio oldRadio = new Radio(1999);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(oldRadio);


    }

}
