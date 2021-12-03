package com.assignment5;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                int G=i+j;
                System.out.println(i+"+"+j+"="+G);
            }
            System.out.println();
        }
    }
}

