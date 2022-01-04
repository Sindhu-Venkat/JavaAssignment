package com.exercises.datatypes;


public class CCLogic {

    public int display(int temp){      //GreatestConditional;
        int c=0,b=0,a = 0;
        int result= c >(a>b?a:b)?c:((a>b)?a:b);
        return temp;
    }

    public int show(int n){                      //IntegerConditional
        if(n>0){
            System.out.println("INTEGER IS POSITIVE");
        }
        else if(n<0){
            System.out.println("INTEGER IS NEGATIVE");
        }
        else{
            System.out.println("INTEGER IS ZERO");
        }
        return n;
    }

    public int display2(String input){                      //ControlStatements1
        int count = 1;
        for(int i = 1; i < input.length(); i++){
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int show2(int odd){                                //ControlStatement2
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0 ; i< a.length; i++) {
            if (a[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    public int display2(int even){                       //ControlStatement3
        int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i = 1; i< a.length; i++){
            if(a[i] %2 == 0){
                even++;
            }
        }
        return even;
    }

    public int display3(int num){        //ControlStatement4
        int []a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < (a[i] / 2); j++) {
                if (a[i] % j == 0) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }

    public int show3(int sum){               //ControlStatement5
        int []a = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14, -15, 16, -17, 18, -19, 20};
        for (int i = 1; i < a.length; i++) {
            if(a[i] %2 == 0)
                sum = sum + a[i];
        }
        return sum;
    }
}

