package com.company.Abstract;

public class Employee extends Person {

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override  //nadpisywanie
    public void printInfo() {
        System.out.println("Employee " + this.getName());
    }
}
