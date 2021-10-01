package com.assignment3;

class A {

    String name;
    static float age;

    void student1(){
        System.out.println("Class A Instance Method");
        int dob = 2000;
        name = "XXX";
        age = 21;
        System.out.println("Student 1 : ");
        System.out.println("Name = " + name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }

    static void student2()      //Static Method
    {
        A stu1 = new A();
        int dob = 1999;
        stu1.name = "YYY";
        age = 22;
        System.out.println("Class A Static Method");
        System.out.println("Student 2 : ");
        System.out.println("Name = " +stu1.name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }

    {
        System.out.println("Class A Instance Block");       //Instance Block
    }

    static{
        System.out.println("Class A Static Block");       //static block
    }

    A()
    {
        System.out.println("Class A Constructor");         // constructor
    }

}

class B extends A {

    String name;          //Instance Variable
    static float age;   //Static Variable

    void student3()          //Instance Method
    {
        int dob = 1998;
        name = "ZZZ";
        age = 23;
        System.out.println("Class B Instance Method");
        System.out.println("Student 3 : ");
        System.out.println("Name = " + name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }


    static void student4()      //Static Method
    {
        B stud2 = new B();
        int dob = 1997;
        stud2.name = "AAA";
        age = 24;
        System.out.println("Class B Static Method");
        System.out.println("Student 4 : ");
        System.out.println("Name = " + stud2.name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }


    {           //Instance Block
        System.out.println("Class B Instance Block");
    }

    static{     //Static Block
        System.out.println("Class B Static Block");
    }

    B() {
        System.out.println("Class B Constructor");
    }
}

class C extends A {

    String name;          //Instance Variable
    static float age;   //Static Variable

    void student5()          //Instance Method
    {
        int dob = 1996;
        name = "BBB";
        age = 25;
        System.out.println("Class C Instance Method");
        System.out.println("Student 5 : ");
        System.out.println("Name = " + name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }

    static void student6()      //Static Method
    {
        C stud3 = new C();
        int dob = 1995;
        stud3.name = "CCC";
        age = 26;
        System.out.println("Class C Static Method");
        System.out.println("Student 6 : ");
        System.out.println("Name = " + stud3.name);
        System.out.println("DOB = "+ dob);
        System.out.println("Age =" +age);
    }



    {           //Instance Block
        System.out.println("Class C Instance Block");
    }

    static{     //Static Block
        System.out.println("Class C Static Block");
    }
    C()         //Constructor
    {
        System.out.println("Class C Constructor");
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {
        A stud1 = new A();
        B stud2 = new B();
        C stud3 = new C();

        stud1.student1();
        A.student2();

        stud2.student1();
        B.student2();
        stud2.student3();
        B.student4();

        stud3.student1();
        C.student2();
        stud3.student5();
        C.student6();

    }
}





