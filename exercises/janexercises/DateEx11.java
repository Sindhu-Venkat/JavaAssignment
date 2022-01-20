package com.exercises.janexercises;

//11.Method to return current date.


import java.time.LocalDate;

public class DateEx11 {

    public static void main(String[] args) {
        System.out.println("WELCOME");
        DateUtilityLogic dl = new DateUtilityLogic();
        System.out.println("CURRENT DATE:"+ LocalDate.now());

    }

}
