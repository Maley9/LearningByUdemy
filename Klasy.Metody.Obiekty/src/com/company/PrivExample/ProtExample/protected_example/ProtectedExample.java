package com.company.PrivExample.ProtExample.protected_example;

import com.company.PrivExample.ProtExample.protected_example.pacage2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String name = computer.getName();
        System.out.println(name);

    }
}
