package com.assignment3;

class employee
{
    static String name;       //Static Variable
    int id;              //Instance Variable

    void disp1()        //Instance Method
    {
        int age = 30;         //Local Variable
        name = "AAA";
        id = 20;
        System.out.println("Parent Class Instance Method");
        System.out.println("Employee Name= " + name );
        System.out.println("Employee id = " + id);
        System.out.println("Employee age = " +age);
    }

    static void disp2()     //Static Method
    {
        employee e1 = new employee();
        int age = 60;         //Local Variable
        e1.name = "BBB";
        e1.id = 50;
        System.out.println("Parent Class Static Method");
        System.out.println("Employee Name= " + e1.name );
        System.out.println("Employee id = " + e1.id);
        System.out.println("Employee age = " +age);

    }


    {                                                                            //Instance Block
        System.out.println("Parent Class Instance Block");
    }

    static{                                                                        //Static Block
        System.out.println("Parent Class Static Block");
    }

    employee()
    {
        System.out.println("Parent Class Constructor");
    }
}

class employee1 extends employee
{
    static String name;       //Static Variable
    int id;              //Instance Variable

    void disp3()        //Instance Method
    {
        int age = 22;         //Local Variable
        name = "CCC";
        id = 200;
        System.out.println("Child Class Instance Method");
        System.out.println("Employee Name= " + name );
        System.out.println("Employee id = " + id);
        System.out.println("Employee age = " +age);
    }

    static void disp4()     //Static Method
    {
        employee1 e2 = new employee1();
        int age = 60;         //Local Variable
        e2.name = "DDD";
        e2.id = 500;
        System.out.println("Child Class Static Method");
        System.out.println("Employee Name= " + e2.name );
        System.out.println("Employee id = " + e2.id);
        System.out.println("Employee age = " +age);
    }

    {                                                                            //Instance Block
        System.out.println("Child Class Instance Block");
    }

    static{                                                                     //Static Block
        System.out.println("Child Class Static Block");
    }

    employee1()                                                         // constructor
    {
        System.out.println("Child Class Constructor");
    }
}


public class MultilevelInheritance extends employee1 {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        employee e1 = new employee();
        employee1 e2 = new employee1();
        e1.disp1();
        employee.disp2();
        e2.disp3();
        employee1.disp4();


    }
}