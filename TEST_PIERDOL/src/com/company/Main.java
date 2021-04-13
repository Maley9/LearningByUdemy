package com.company;

import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {

       String name = "Ola";

       if(name == "Olaa"){
           System.out.println("TAK");
       }
       else{
           System.out.println("NO");
       }


        StringBuilder read = new StringBuilder();
       read.append("Hello ").append("World");
       read.append(192);
       read.insert(12, "Lol");
       read.delete();
        System.out.println(read);


    }
}
