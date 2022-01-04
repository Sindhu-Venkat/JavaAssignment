package com.exercises.datatypes;

/*3. Write a program to find to even number from given array?
	[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]*/

public class ControlStatement3 {
    public static void main(String[] args) {
        System.out.println("**EVEN NUMBERS FROM THE GIVEN ARRAY**");
        int even =0;
        CCLogic cc = new CCLogic();
        int evenNumbers = cc.display2(even);
        System.out.println("Total even numbers :"+evenNumbers);
    }
}
