package com.exercises.controlflow;

public class Foreachloop {

    public static void main(String[] args) {

        System.out.println("FOR EACH LOOP VALUES:");

        int arr[] = {12, 23, 44, 56, 78};

        for (int i : arr)                //syntax : for(datatype_type variable : array name)
        {
            System.out.println(i);
        }
    }
}