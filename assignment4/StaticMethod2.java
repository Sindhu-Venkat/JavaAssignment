package com.assignment4;

public class StaticMethod2 {

    void employee1(){
        System.out.println("INSTANCE METHOD");
        int id = 500;
        String name = "GGG";
        float salary = 30000;
        System.out.println("Employee Id1 :"  +id+ "Employee Name1 :" +name+   "Employee Salary1 :" +salary);
    }

    static void employee2(){
        StaticMethod2 S2 = new StaticMethod2();
        S2.employee1();
        System.out.println("STATIC METHOD");
        int id = 400;
        String name = "SSS";
        float salary = 40000;
        System.out.println("Employee Id2 :" +id+ "Employee Name2 :" +name+  "Employee Salary2 :" +salary);
    }

    public static void main(String[] args) {
        employee2();
    }
}
