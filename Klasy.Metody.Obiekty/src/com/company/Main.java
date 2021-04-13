package com.company;

class Rectangle {
    float side1;
    float side2;
    float surfaceArea;

    Rectangle(float s1, float s2){
        this.side1 = s1;
        this.side2 = s2;
    }

}

class MyMath {

    //Parametr rect przekazywany jest przez referencje

    public void calcRectangleSurface(Rectangle rect){
        rect.surfaceArea = rect.side1 * rect.side2;
    }
}


public class Main {

    public static void main(String[] args) {
        MyMath math = new MyMath();
        Rectangle rectangle = new Rectangle(5.0f,10.0f);
        math.calcRectangleSurface(rectangle);

        System.out.println(rectangle.surfaceArea);
    }
}
