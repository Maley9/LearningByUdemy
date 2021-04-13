package com.company.KwadratyTrojkaty;

class Rec {
    float side1, side2, surfaceArea;

    Rec(){
        this(5.04f);
    }

    Rec(float side){
        this.side1 = this.side2 = side;
    }

    Rec(float s1, float s2){
        this.side1 = s1;
        this.side2 = s2;

    }

}

public class Rectangle {
    public static void main(String[] args) {
        Rec rectangle = new Rec();
        rectangle.surfaceArea = rectangle.side1 + rectangle.side2;
        System.out.println("Bok1: " + rectangle.side1 + " Bok2 " + rectangle.side2
         + " Wynik " + rectangle.surfaceArea);
    }
}