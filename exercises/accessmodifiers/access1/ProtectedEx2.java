package com.exercises.accessmodifiers.access1;
import com.exercises.accessmodifiers.*;

public class ProtectedEx2 extends ProtectedEx1 {

    public static void main(String[] args) {
        System.out.println("PROTECTED EXAMPLE 2");
        ProtectedEx2 Pex2 =  new ProtectedEx2();
        Pex2.display();            // from previous ProtectedEx1 method
    }
}
