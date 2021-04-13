package com.company.FinalClassExample;

class Employee{
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Manager extends Employee{
    String responsibility;
}

class Director extends Manager{
    String department;
}
final class CEO extends Manager {
    String companyName;
}

// NIE MOZNA JUZ DZIEDZICZYC PO CEO
// NIE MOŻNA RÓWNIEŻ DZIEDZICZY PO WIELU KLASACH !!


public class Final {
    public static void main(String[] args) {
        CEO ceo = new CEO();

    }
}
