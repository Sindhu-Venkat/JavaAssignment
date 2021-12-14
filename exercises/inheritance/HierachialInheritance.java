package com.exercises.inheritance;

class Employee{
    float salary = 50000;
    void displaysalary(){
        System.out.println("THE EMPLOYEE SALARY IS :"+salary);
    }
}
class PermanentEmployee extends Employee{
    double hike = 0.35;
    void incrementsalary(){
        System.out.println("THE PERMANENT EMPLOYEE SALARY IS :"+super.salary * hike);
    }
}
class TemporaryEmployee extends Employee{
    double hike = 0.5;
    void incrementsalary(){
        System.out.println("THE TEMPORARY EMPLOYEE SALARY IS :"+super.salary * hike);
    }
}
public class HierachialInheritance {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displaysalary();
        PermanentEmployee pe = new PermanentEmployee();
        pe.incrementsalary();
        TemporaryEmployee te = new TemporaryEmployee();
        te.incrementsalary();
    }
}
