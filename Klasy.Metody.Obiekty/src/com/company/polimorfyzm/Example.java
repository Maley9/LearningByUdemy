package com.company.polimorfyzm;


class Employee {
    private String name;
    private  String jobTitle;
    private int salary;


    public Employee(){
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public void doWork(){
        System.out.println("GO TO WORK");
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Employee " + name);
    }
}

class Manager extends Employee {

    private String departmentName;

    public Manager() {
        departmentName = "Unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee() {
        System.out.println("Employee hired");
    }
        public void giveRise(Employee employee){
            System.out.println("Employee got rise");
        }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printInfo(){
        System.out.println("Manager " + getName());
    }
}

class CEO extends Manager{
    private int sharesNum;

    public CEO() {
        sharesNum = 100;
    }

    public CEO(String name, String jobTitle, int salary, String departmentName, int sharesNum) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNum = sharesNum;
    }

    public void signContract(){
        System.out.println("SIGNED");
    }

    public int getSharesNum() {
        return sharesNum;
    }

    public void setSharesNum(int sharesNum) {
        this.sharesNum = sharesNum;
    }

    public void printInfo(){
        System.out.println("CEO " + getName());
    }
}

public class Example {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "praca", 1000);
        Manager manager = new Manager("Janusz", "Menadzer", 1000, "JANUSZ I SPOLKA");
        CEO ceo = new CEO("Szef", "Szef i spolka", 20000, "Board", 100);

        Employee employee1 = manager;
        Manager person = ceo;

        employee1.doWork();
        employee1.printInfo();









    }
}
