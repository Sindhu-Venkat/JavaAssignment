package com.exercises.datatypes.decexercises;

/* Write a program to convert a integer to decimal value
 Expected Result:
	i/p: 19
	o/p: 19.0 */

import com.exercises.datatypes.decexercises.ConversionLogic;

public class IntegerDecimal {
    public static void main(String[] args) {
        System.out.println("INTEGER TO DECIMAL ");
        ConversionLogic cl = new ConversionLogic();
        double decimalValue = cl.intdeci(19);
        System.out.println("DECIMAL VALUE :"+ decimalValue);
    }
}
