package com.exercises.accessmodifiers;

class Birds{
    private int birdcount = 2;               //private

    private void show(){
        System.out.println("BIRDS:"+birdcount);
    }
    public void display(){
        Birds b1 = new Birds();
        b1.show();
    }
}
public class PrivateEx1 extends Birds {
    public static void main(String[] args) {
        System.out.println("PRIVATE EXAMPLE 1");
        PrivateEx1 px1 = new PrivateEx1();
        px1.display();
    }
}
