package com.exercises.datatypes;

/* Write a program to convert a decimal value to integer
	Expected Result:
	i/p: 19.9
	o/p: 19 */

public class DeciamlInteger {
    public static void main(String[] args) {
        System.out.println("DECIMAL TO INTEGER");
        ConversionLogic cl = new ConversionLogic();
        int integerValue = cl.deci(19.9);
        System.out.println("INTEGER VALUE :"+ integerValue);
    }
}


