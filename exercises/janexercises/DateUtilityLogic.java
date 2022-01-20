package com.exercises.janexercises;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtilityLogic {

    static int date;   //11
    static Date dateformat;  //12

    static void display(){
        LocalDate date = LocalDate.now();   //11
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //12
        Date d = new Date();
        dateformat = d;
        System.out.println("Converted to given pattern:"+sdf.format(dateformat));

    }

  }

