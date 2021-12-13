package com.exercises.oopsconcept;

public class Calculator {

    int add(int num1, int num2) {
        return (num1 + num2);
    }

    short add(short num1, short num2) {
        return (short) (num1 + num2);
    }

    byte add(byte num1, byte num2) {
        return (byte) (num1 + num2);
    }

    long add(long num1, long num2) {
        return (long) (num1 + num2);
    }

    float add(float num1, float num2) {
        return (float) (num1 + num2);
    }

    double add(double num1, double num2) {
        return(num1+num2);
    }
    int sub(int num1, int num2) {
        return num1 - num2;
    }

    short sub(short num1, short num2) {
        return (short) (num1 - num2);
    }

    byte sub(byte num1, byte num2) {
        return (byte) (num1 - num2);
    }

    long sub(long num1, long num2) {
        return (long) (num1 - num2);
    }

    float sub(float num1, float num2) {
        return (float) (num1 - num2);
    }

    double sub(double num1, double num2) {
        return(num1-num2);
    }
    int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    short multiply(short num1, short num2) {
        return (short) (num1 * num2);
    }

    byte multiply (byte num1, byte num2) {
        return (byte) (num1 * num2);
    }

    long multiply(long num1, long num2) {
        return (long) (num1 * num2);
    }

    float multiply(float num1, float num2) {
        return (float) (num1 * num2);
    }

    double multiply(double num1, double num2) {
        return(num1*num2);
    }
    int div(int num1, int num2) {
        return (num1 / num2);
    }

    short div(short num1, short num2) {
        return (short) (num1 / num2);
    }

    byte div(byte num1, byte num2) {
        return (byte) (num1 / num2);
    }

    long div(long num1, long num2) {
        return (long) (num1 / num2);
    }

    float div(float num1, float num2) {
        return (float) (num1 / num2);
    }

    double div(double num1, double num2) {
        return(num1/ num2);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("ADDITION OPERATIONS");
        int iresult = calc.add(2,2);
        System.out.println("int result ="+iresult);
        short sresult = (short) calc.add(2,2);
        System.out.println("short result="+sresult);
        byte bResult = (byte) calc.add(2,2);
        System.out.println("byte result ="+bResult);
        long lresult = (long) calc.add(2,2);
        System.out.println("long result ="+lresult);
        float fresult = (float) calc.add(2,2);
        System.out.println("float result ="+fresult);
        double dresult = (double) calc.add(2,2);
        System.out.println("double result ="+dresult);

        System.out.println("SUBTRACTION OPERATIONS");
        int intresult = calc.sub(2,2);
        System.out.println("int result ="+intresult);
        short shortresult = (short) calc.sub(2,2);
        System.out.println("short result="+shortresult);
        byte byteResult = (byte) calc.sub(2,2);
        System.out.println("byte result ="+byteResult);
        long longresult = (long) calc.sub(2,2);
        System.out.println("long result ="+longresult);
        float floatresult = (float) calc.sub(2,2);
        System.out.println("float result ="+floatresult);
        double doubleresult = (double) calc.sub(2,2);
        System.out.println("double result ="+doubleresult);

        System.out.println("MULTIPLICATION OPERATIONS");
        int miresult = calc.multiply(2,2);
        System.out.println("int result ="+miresult);
        short msresult = (short) calc.multiply(2,2);
        System.out.println("short result="+msresult);
        byte mbResult = (byte) calc.multiply(2,2);
        System.out.println("byte result ="+mbResult);
        long mlresult = (long) calc.multiply(2,2);
        System.out.println("long result ="+mlresult);
        float mfresult = (float) calc.multiply(2,2);
        System.out.println("float result ="+mfresult);
        double mdresult = (double) calc.multiply(2,2);
        System.out.println("double result ="+mdresult);

        System.out.println("DIVISION OPERATIONS");
        int diresult = calc.div(2,2);
        System.out.println("int result ="+diresult);
        short dsresult = (short) calc.div(2,2);
        System.out.println("short result="+dsresult);
        byte dbResult = (byte) calc.div(2,2);
        System.out.println("byte result ="+dbResult);
        long dlresult = (long) calc.div(2,2);
        System.out.println("long result ="+dlresult);
        float dfresult = (float) calc.div(2,2);
        System.out.println("float result ="+dfresult);
        double ddresult = (double) calc.div(2,2);
        System.out.println("double result ="+ddresult);

        System.out.println("-----PRESS EXIT-----");

    }
}
