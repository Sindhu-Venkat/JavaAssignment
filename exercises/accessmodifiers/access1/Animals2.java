package com.exercises.accessmodifiers.access1;
import com.exercises.accessmodifiers.access1.*;

public class Animals2 extends Animals{
    public static void main(String[] args) {
        System.out.println("Protected modifier");
        Animals2 a2 = new Animals2();
        a2.animaltype();
    }
}
