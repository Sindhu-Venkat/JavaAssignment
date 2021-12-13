package com.exercises.accessmodifiers;

public class PublicEx1 {

    int animals = 2;
    public void Animalcount() {
        System.out.println("ANIMAL COUNT :" + animals);
    }
    public static void main(String[] args) {
        System.out.println("PUBLIC EXAMPLE");
        PublicEx1 Px = new PublicEx1();
        Px.Animalcount();
    }
}
