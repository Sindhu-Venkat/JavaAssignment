package com.assignment5;

public class LogicalOperators {
    public static void main(String[] args) {

        int a = 5, b = 5;
        System.out.println("AND Operator");
        if (a == b && b == a) {
            System.out.println("&& satisfied");
        } else {
            System.out.println("&& not satisfied");
        }
        int x = 100, y = 100, z = 900;
        System.out.println("OR Operator");
        if (x == y || y == z || z == x) {
            System.out.println("|| satisfied");
        } else {
            System.out.println(" || Not satisfied");
        }
        int l = 11, m = 11;
        System.out.println("NOT Operator");
        if (!(l == m)) {
            System.out.println("! satisfied");
        } else {
            System.out.println("! not satisfied");

        }
    }
}
