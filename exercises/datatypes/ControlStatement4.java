package com.exercises.datatypes;

/*4.Write a program to find to prime number from given array?
	[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]*/

public class ControlStatement4 {
    public static void main(String[] args) {
        System.out.println("** PRIME NUMBERS FROM THE GIVEN NUMBERS **");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int num = 0;
        int i;
        for (i = 1; i < a.length; i++) {
            num = 0;
            for (int j = 2; j < (a[i] / 2); j++) {
                if (a[i] % j == 0) {
                    num++;
                    break;
                }
            }
            if (num == 0) {
                System.out.println(a[i]);
            }
        }
        CCLogic cc = new CCLogic();
        int primeNumbers = cc.display3(i);
        System.out.println("Prime numbers are :"+ i);
    }
    }

