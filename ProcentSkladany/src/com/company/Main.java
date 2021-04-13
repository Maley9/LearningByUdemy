package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;


        System.out.println("Podaj kapital początkowy");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Podaj roczne oprocentowanie");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ile lat chcesz oszczedzac");
        numYears = in.nextInt();

        finalCapital = startCapital * Math.pow(1+(yearlyInterest/100.0d), numYears);
        System.out.println(Math.round(finalCapital));
    }
}
