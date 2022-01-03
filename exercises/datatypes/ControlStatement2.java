package com.exercises.datatypes;

/*2. Write a program to find to odd number from given array?
	[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]*/

public class ControlStatement2 {
    public static void main(String[] args) {
        System.out.println("**ODD NUMBERS FROM THE GIVEN ARRAY**");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int odd =0;
        for (int i  = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
                odd++;
            }
            }
        CCLogic cc = new CCLogic();
        int oddNumbers = cc.show2(odd++);
        System.out.println("Total Odd numbers :" + oddNumbers);
    }
}

