package com.exercises.datatypes;

import java.util.Scanner;

public class CCLogic {

    public int greatest(int tempValue) {                          //GreatestConditional
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        System.out.println("Enter third number:");
        c = sc.nextInt();
        int tempResult = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return tempResult;
    }

    public int show(int n) {                             //IntegerConditional
        if (n > 0) {
            System.out.println("INTEGER IS POSITIVE");
        } else if (n < 0) {
            System.out.println("INTEGER IS NEGATIVE");
        } else {
            System.out.println("INTEGER IS ZERO");
        }
        return n;
    }

    public int character(String input) {                      //ControlStatements1 //charCount
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int character2(String input) {           //wordCount
        int wordCount = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }

        public void odd() {                                //ControlStatement2
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.print(a[i]+" ");
                }
            }
        }

        public void even () {                       //ControlStatement3
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            for (int i = 1; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    System.out.print(a[i]+" ");
                }
            }
        }

        public void prime() {        //ControlStatement4
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            int num;
            for (int i = 1; i < a.length; i++) {
                num=0;
                for (int j = 2; j < (a[i] / 2); j++) {
                    if (a[i] % j == 0) {
                        num++;
                        break;
                    }
                        if (num == 0) {
                            System.out.println(a[i]);
                            break;
                        }
                    }
                }
            }


        public int positive( int sum){               //ControlStatement5
            int[] a = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14, -15, 16, -17, 18, -19, 20};
            for (int i = 1; i < a.length; i++) {
                if (a[i] % 2 == 0)
                    sum = sum + a[i];
            }
            return sum;
        }
    }

