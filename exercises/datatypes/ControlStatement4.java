package com.exercises.datatypes;

/*4.Write a program to find to prime number from given array?
	[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]*/

public class ControlStatement4 {
    public static void main(String[] args) {
        System.out.println("** PRIME NUMBERS FROM THE GIVEN NUMBERS **");
        CCLogic cc = new CCLogic();
        int num=0;
        int primeNumbers = cc.display3(num);
        System.out.println("Total prime numbers :"+ primeNumbers);
    }
    }

