package com.exercises.datatypes;

/* Write a program to convert a integer to decimal value
 Expected Result:
	i/p: 19
	o/p: 19.0 */

public class IntegerDecimal {
    public static void main(String[] args) {
        System.out.println("INTEGER TO DECIMAL ");
        ConversionLogic cl = new ConversionLogic();
        double decimalValue = cl.intdeci(19);
        System.out.println("DECIMAL VALUE :"+ decimalValue);
    }
}
