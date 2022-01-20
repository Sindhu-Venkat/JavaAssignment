package com.exercises.datatypes.decexercises;

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

    public int character1(String input) {                      //ControlStatements1 //charCount
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
            int totalOdd = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.print(a[i] + " ");
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
            for (int i = 0; i < a.length; i++){
                 boolean isPrime = true;
                if(a[i]==1)
                    isPrime= false;
                else
                for (int j = 2; j < (a[i] / 2); j++) {
                    if (a[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                            System.out.print(a[i]+" ");
                        }
                    }
                }


        public int positive( int totalSum){               //ControlStatement5
            int[] a = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14, -15, 16, -17, 18, -19, 20};
            int sum=0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] % 2 == 0)
                    sum = sum + a[i];
            }
            return sum;
        }
    }

