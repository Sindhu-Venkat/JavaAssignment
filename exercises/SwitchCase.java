package com.exercises;

public class SwitchCase {
    public static void main(String[] args) {

        String str = "GGG";
        String str1 = "EEE";

        switch (str) {
            case "aaa":
                System.out.println("A");
                break;
            case "bbb":
                System.out.println("B");
                break;
            case "GGG":
                System.out.println("S");
                break;
            case "ddd":
                System.out.println("D");
                break;

            default:
                System.out.println("String  not found");
        }

        switch (str1) {
            case "aaa":
                System.out.println("A");
                break;
            case "bbb":
                System.out.println("B");
                break;
            case "GGG":
                System.out.println("S");
                break;
            case "ddd":
                System.out.println("D");
                break;

            default:
                System.out.println("String  not found");
        }
    }
}

