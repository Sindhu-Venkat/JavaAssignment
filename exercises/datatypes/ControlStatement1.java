package com.exercises.datatypes;

// 1.write a program to find the number of characters from the given i/p string.

import java.util.Scanner;

public class ControlStatement1 {
    public static void main(String[] args) {
        System.out.println("**NUMBER OF CHARACTERS**");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = sc.nextLine();
        CCLogic cc = new CCLogic();
        int totalCount1 = cc.character1(input);
        int totalCount2 = cc.character2(input);
        System.out.println("THE TOTAL NUMBER OF CHARACTERS IN THE GIVEN STRING INPUT IS :"+totalCount1);
        System.out.println("THE TOTAL WORD COUNT IN THE GIVEN STRING INPUT IS :"+totalCount2);
    }
}
