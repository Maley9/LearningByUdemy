package com.company.InterfaceStaticFinal;

public interface Eating {
    public void eat();

    public default void searchForfood(){
        System.out.println("Searching for food");
    }
}
