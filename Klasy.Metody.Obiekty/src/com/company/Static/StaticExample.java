package com.company.Static;



//// STATYCZNA METODA MOZE BYC WYWOLANA

class PlaneWithStatic{
    static int nextId = 0;
    int id;
    int x,y;

    static int getId(){
        /*
        System.out.println(id);
         non-static variable id cannot be referenced from a static context!
         */
        return nextId++;
    }

    PlaneWithStatic(){
        id = getId();
        nextId++;
    }

}

public class StaticExample {

    public static int add(int a, int b){
        return a+b;
    }

    public int substract(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();
        PlaneWithStatic plane4 = new PlaneWithStatic();

        PlaneWithStatic.nextId = 7;

        System.out.println(PlaneWithStatic.nextId + " <- PlaneWithStatic.NextId");
        System.out.println(plane1.nextId + "  <-static plan1.NextId");
        System.out.println(plane2.id + " <- plane2.Id + Inkrementacja");
        System.out.println(plane3.id + " <- plane3.Id + Inkrementacja");
        System.out.println(plane4.id + " <- plane4.Id + Inkrementacja");


        //WYWOLANIE METODY STATYCZNEJ
        System.out.println(StaticExample.add(4, 2));

        //WYWOLANIE METODY NON-STATIC
        StaticExample substract = new StaticExample();
        System.out.println(substract.substract(10, 12));
    }
}

