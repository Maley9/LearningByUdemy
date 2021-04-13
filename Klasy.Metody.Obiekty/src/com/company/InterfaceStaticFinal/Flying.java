package com.company.InterfaceStaticFinal;

public interface Flying {

    public static final float DEFAULT_WINGSPAN = 0.7f;

    public void fly();

    public default void flyHigher(){
        System.out.println("flying higher");
    }

    public default float getWingSpan(){
        return DEFAULT_WINGSPAN;
    }

    public static int getDefaultNumWings(){
        return 2;
    }
}
