package com.exercises.interfaces;

interface Feature{
    void dialing();
    void audiocalling();
}
interface Addons{
    void vcalling();
    void mms();
}
abstract class FeaturedPhone implements Feature{
    public void dialing(){
        System.out.println("THE FEATUREDPHONE IS DIALING.....");
    }
    public void audiocalling(){
        System.out.println("FEATUREDPHONE MAKING AUDIO CALL....");
    }
}
abstract class SmartPhone implements Feature, Addons{
    public void dialing(){
        System.out.println("SMARTPHONE IS DIALING....");
    }
    public void audiocalling(){
        System.out.println("SMARTPHONE MAKING AUDIOCALLING....");
    }
    public void vcalling(){
        System.out.println("SMARTPHONE MAKING VIDEOCALLING....");
    }
    public void mms(){
        System.out.println("SMARTPHONE IS RECEIVING A INCOMING MMS...");
    }
}

 class Mobile extends SmartPhone{   // class to class so using "extends" keyword
    public static void main(String[] args) {
        System.out.println("INTERFACE EXAMPLE 2");
       Mobile m = new Mobile();
       m.dialing();
       m.audiocalling();
       m.vcalling();
       m.mms();
    }
}
















public class Example2 {
}
