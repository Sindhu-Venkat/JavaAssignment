package com.exercises.datatypes;

import java.util.Scanner;

class Avg2{
    double result;

    Avg2(int a[],int n) {
        result = 0;
        for (int i = 0; i < n; i++)
            result = result + a[i];
    }
}
public class Average2 {
    public static void main(String[] args) {
        System.out.println("AVERAGE OF N NUMBERS");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TOTAL NUMBERS TO GET CALCULATE AVERAGE : ");
        n=sc.nextInt();     //"nextInt()" to get the next integer value from the user.
        int a[]=new int[n];  //allocating new space for upcoming values
        System.out.println("ENTER "+n+" NUMBERS");
        for(int i =0;i<n;i++)
            a[i]= sc.nextInt();
        Avg2 av = new Avg2(a,n);
        System.out.println("TOTAL AVERAGE ="+av.result);


    }
}
