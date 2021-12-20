package com.exercises.interfaces;

interface Aadhar{
    void a();
}
interface Pancard {
    void b();
}
interface Voterid{
    void c();
}
class Passport implements Aadhar,Pancard {
    public void a() {
        String name = "Person 1";
        int aadharnumber = 1234567890;
        String address = "XXX Street , YYY Nagar";
        System.out.println("ENTER THE A DETAILS :");
        System.out.println("NAME :" + name + "AADHAR NUMBER :" + aadharnumber + "ADDRESS :" + address);
    }

    public void b() {
        String name = "PERSON 2";
        int Pancardnumber = 987654321;
        String gender = "FEMALE";
        System.out.println("ENTER THE B DETAILS :");
        System.out.println("NAME :" + name + "PANCARD NUMBER :" + Pancardnumber + "GENDER :" + gender);
    }

    public void c() {
        String name = "PERSON 3";
        int Voteridnumber = 3456789;
        System.out.println("ENTER C DETAILS :");
        System.out.println("NAME :" + name + "VOTER ID NUMBER :" + Voteridnumber);
    }
}
public abstract class Example4 implements Voterid {
    public static void main(String[] args) {
        System.out.println("INTERFACE EXAMPLE 2");
        Passport p = new Passport();
        p.a();
        p.b();
        p.c();

    }
}

