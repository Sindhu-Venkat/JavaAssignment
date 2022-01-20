package com.exercises.datatypes.decexercises;

/* Write a program to convert a decimal value to integer
	Expected Result:
	i/p: 19.9
	o/p: 19 */

import com.exercises.datatypes.decexercises.ConversionLogic;

public class DeciamlInteger {
    public static void main(String[] args) {
        System.out.println("DECIMAL TO INTEGER");
        ConversionLogic cl = new ConversionLogic();
        int integerValue = cl.deci(19.9);
        System.out.println("INTEGER VALUE :"+ integerValue);
    }
}


