package com.exercises.datatypes;

public class Average{

    double a = 10.5;                    //given double values
    double b = 15.4;
    double c = 24.1;

    public double display(){

        double averesult = (a+b+c)/3;        //average logic
        return averesult;                    // "averesult" variable result
    }

    public static void main(String[] args) {
        System.out.println("AVERAGE OF THREE DOUBLE NUMBERS :");
        Average a = new Average();   //obj creation
        double averesult = a.display(); //using obj reference calling the method display.
        System.out.println(" TOTAL AVERAGE :"+ averesult);
    }
}

