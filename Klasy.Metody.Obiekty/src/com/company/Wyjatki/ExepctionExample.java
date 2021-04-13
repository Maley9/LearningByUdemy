package com.company.Wyjatki;

public class ExepctionExample {
    public static void main(String[] args) {

        int numArr[] = {0,1,2,3,4,5};

        try {
           // int a = numArr[10];
            int b = numArr[2];
            int result = b/0;

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("finally, niezaleznie od bledu pojawi się");
        }
    }
}
