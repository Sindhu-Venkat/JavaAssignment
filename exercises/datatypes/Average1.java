package com.exercises.datatypes;

/*Write a program to find the average of the given 3 double values?
	a=10.5, b=15.4, c=24.1
 Condition: Average logic must be in a method and result of the average must be stored in variable result and displayed.*/

public class Average1 {
    public static void main(String[] args) {
        System.out.println("AVERAGE OF THREE DOUBLE NUMBERS :");
        AverageLogic a1 = new AverageLogic();
        double averageResult = a1.display(10.5, 15.4 , 24.1);
        System.out.println("TOTAL AVERAGE :"+ averageResult);

    }
}


