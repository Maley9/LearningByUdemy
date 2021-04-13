package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal eagle = new Bird();
        Animal falcon = new Bird();
        Animal robin = new Bird();
        eagle.eat();

     //   Bird realRobin = (Bird) robin;


        Animal lizard1 = new Lizard();
        Animal lizard2 = new Lizard();
        Animal lizard3 = new Lizard();


        // REFERENCJE OGARNIAMY JAK NAJBARDZIEJ OGOLNY OBIEKT - starać się
        // nie używać np ARRAYLIST tylko LIST!
        List<Animal> zoo = new ArrayList<>();
        zoo.add(eagle);
        zoo.add(falcon);
        zoo.add(robin);

        zoo.add(lizard1);
        zoo.add(lizard2);
        zoo.add(lizard3);

        new Main().feedAll(zoo);
        List<Animal> quickZoo = new LinkedList<>();
        quickZoo.add(eagle);
        new Main().feedAll(quickZoo);


    }

    public void feedAll(List<Animal> zoo){

        for(Animal a : zoo){
            a.eat();
        }

    }


}
