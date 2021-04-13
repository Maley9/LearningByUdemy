package com.company.ObjectJavaLesson;

import java.util.ArrayList;
import java.util.List;

public class Ob {
    public static void main(String[] args) {
        Object text = new String("First");
        String text2 = (String) text;
        System.out.println(text2);
        System.out.println(text2 == text);

        if(text instanceof Number){
            Number text3 = (Number) text;
        }

        int i = (int)18.9;   /// UCINA I TAK
        double z = (int)18.8;  // TEZ UCINA
        System.out.println(i + " " + z);


        //AUTOBOXING
        /*
            int = integer
            long = Long
            char = Character

        */
        List<Integer> nazwa = new ArrayList<>();
        nazwa.add(i);
        System.out.println(nazwa);


    }

}
