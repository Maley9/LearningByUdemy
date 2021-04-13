package com.company.Abstract;

public class AbstractExample {
    public static void main(String[] args) {

        Employee employee = new Employee("Janusz", "Nowak", 32);
        employee.printInfo();

        Manager manager = new Manager("Olek", "Drugi",
                33, "Januszex");

        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName() + " " + person.getAge());

     //   Person person1 = new Person(); //blad !!
    }
}
