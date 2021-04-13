package com.company.Wyjatki;


class TestExepction extends Exception {

    public TestExepction() {
        super("testEx happend");
    }

    public TestExepction(String message) {
        super(message);
    }
}

public class TryKacz {

    public int devide(int num, int devisor)throws ArithmeticException{
        return num/devisor;
    }

    public int test(int num) throws TestExepction{
        if(1==1) throw new TestExepction();
        return 1;
    }

    public static void main(String[] args) {
        int numArr[] = {0,1,2,3,4,5};

        try {
            // int a = numArr[10];
            int b = numArr[0];
            if(b==0)throw new ArithmeticException("Dzielenie przez zero");

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("finally, niezaleznie od bledu pojawi się");
        }

        TryKacz tryKacz = new TryKacz();
        try {
            tryKacz.devide(10,0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Dzielenie przez zero");
        }
        try {
            tryKacz.test(1);
        }catch (TestExepction e){
            e.printStackTrace();
        }finally {
            System.out.println("Test                                                                ");
        }

    }
}
