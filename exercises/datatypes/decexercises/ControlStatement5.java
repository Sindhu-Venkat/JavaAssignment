package com.exercises.datatypes.decexercises;

/*5. Write a program to sum all positive number from the below given array?
	[-1,2,-3,4,-5,6,-7,8,-9,10,-11,12,-13,14,-15,16,-17,18,-19,20]*/

import com.exercises.datatypes.decexercises.CCLogic;

public class ControlStatement5 {
    public static void main(String[] args) {
        System.out.println(" ** SUM OF ALL POSITIVE NUMBERS FROM THE ARRAY ** ");
        CCLogic cc = new CCLogic();
        int totalSum = 0;
        int positiveSum = cc.positive(totalSum);
        System.out.println("SUM OF ALL POSITIVE NUMBERS IS :"+ positiveSum );
    }
}
