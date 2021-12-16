package com.exercises.interfaces;

interface employee1{           //nested interface
    void salary();
    void id();

    interface employee2{
        void address();
    }
}
//class to interface so using "implements" keyword
public class Nestedinterface implements employee1,employee1.employee2{
    public static void main(String[] args) {

        System.out.println("<----NESTED INTERFACE---->");

       new Nestedinterface().id();               //nameless approach
       new Nestedinterface().salary();
       new Nestedinterface().address();
    }
    @Override
    public void salary() {
        int salary = 20000;
        System.out.println("EMPLOYEE 1 SALARY :"+salary);
    }
    @Override
    public void id() {
        int id = 123;
        System.out.println("EMPLOYEE 1 ID :"+id);
    }
    @Override
    public void address() {
        String address = " NO:12 , XXX STREET , YYY NAGAR .";
        System.out.println("EMPLOYEE 2 ADDRESS :"+address);
    }
}