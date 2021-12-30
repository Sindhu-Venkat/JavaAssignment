package com.exercises.datatypes;

/*5. Write a program to sum all positive number from the below given array?
	[-1,2,-3,4,-5,6,-7,8,-9,10,-11,12,-13,14,-15,16,-17,18,-19,20]*/

public class ControlStatement5 {
    public static void main(String[] args) {
        System.out.println(" ** SUM OF ALL POSITIVE NUMBERS FROM THE ARRAY ** ");
        int a[] = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14, -15, 16, -17, 18, -19, 20};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] %2 == 0)
            sum += a[i];
        }
        CCLogic cc = new CCLogic();
        int positiveSum = cc.show3(sum);
        System.out.println("SUM OF ALL POSITIVE NUMBERS IS :"+ positiveSum );
    }
}