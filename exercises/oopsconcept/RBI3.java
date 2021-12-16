package com.exercises.oopsconcept;

class RBI3{
    int amount = 1000;
    int RPercentage = 2;
    int interest(int interestrate){
        int RbiInterest = (amount * RPercentage)*interestrate;
        return RbiInterest;
    }
}
class SBI3 extends RBI3{
    int SPercentage = 3;
    int interest(int interestrate){
        int SbiInterest = (super.amount * SPercentage)*interestrate;
        return SbiInterest;
    }
}
class HDFC3 extends RBI3{
    int HPercentage = 4;
    int interest(int interestrate){
        int HdfcInterest = (super.amount * HPercentage)*interestrate;
        return HdfcInterest;
    }
}
class ICICI3 extends RBI3{
    int IPercentage = 5;
    int interest( int interestrate){
        int IciciPercentage = (super.amount * IPercentage)*interestrate;
        return IciciPercentage;
    }
    public static void main(String[] args) {
        System.out.println("****FOLLOWING ARE THE BANK INTERESTS****");

        RBI3 R = new RBI3();
        SBI3 S = new SBI3();
        HDFC3 H = new HDFC3();
        ICICI3 I = new ICICI3();

        System.out.println("<--RBI BANK-->");
        int RbiInterest = R.interest(1);
        System.out.println("1.RBI INTEREST PERCENT :"+R.RPercentage);
        System.out.println("2.BEFORE AMOUNT: "+ R.amount);
        System.out.println("3.AFTER AMOUNT:"+RbiInterest);

        System.out.println("<--SBI BANK-->");
        int SbiInterest = S.interest(2);
        System.out.println("1.SBI INTEREST PERCENT :"+S.SPercentage);
        System.out.println("2.BEFORE AMOUNT :"+R.amount);
        System.out.println("3.AFTER AMOUNT :"+SbiInterest);

        System.out.println("<--HDFC BANK-->");
        int HdfcInterest = H.interest(2);
        System.out.println("1.HDFC INTEREST PERCENT :"+H.HPercentage);
        System.out.println("2.BEFORE AMOUNT :"+R.amount);
        System.out.println("3.AFTER AMOUNT:"+HdfcInterest);

        System.out.println("<--ICICI BANK-->");
        int IciciInterest = I.interest(4);
        System.out.println("1.ICICI INTEREST PERCENT :"+I.IPercentage);
        System.out.println("2.BEFORE AMOUNT :"+R.amount);
        System.out.println("3.AFTER AMOUNT :"+IciciInterest);

        System.out.println("***THANK YOU FOR CHOOSING OUR BANK***");
    }
}