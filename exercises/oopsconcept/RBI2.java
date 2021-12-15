package com.exercises.oopsconcept;

class RBI2 {
    float amount = 1000;
    float RPercentageInterest = 2;
    float timeperiod = 3;
           float interest(float interestrate) {
        float RbiInterest = interestrate+(amount*RPercentageInterest*timeperiod)/100;
        return RbiInterest;
    }
}
   class SBI2 extends RBI2 {
       float amount = 2000;
       float RPercentageInterest = 3;
       float timeperiod = 4;
             float interest( float interestrate) {
        float SbiInterest = interestrate+(amount*RPercentageInterest*timeperiod)/100;
        return SbiInterest;
    }
}
    class HDFC2 extends RBI2 {
        float amount = 5000;
        float RPercentageInterest = 4;
        float timeperiod = 5;
             float interest(float interestrate) {
            float HdfcInterest = interestrate+(amount*RPercentageInterest*timeperiod)/100;
            return  HdfcInterest;
        }
    }
        class ICICI2 extends RBI2 {
            float amount = 4000;
            float RPercentageInterest = 5;
            float timeperiod = 6;
                  float interest(float interestrate) {
                float IciciInterest =interestrate +(amount*RPercentageInterest*timeperiod)/100;
                return IciciInterest;
            }
    public static void main(String args[]) {
        System.out.println("<---INTEREST FOR THE UPCOMING YEAR 2022 !!--->");

        RBI2 R = new RBI2();
        SBI2 S = new SBI2();
        HDFC2 H = new HDFC2();
        ICICI2 I = new ICICI2();
        float RbiInterest = R.interest(2)/100;
        System.out.println("RBI INTEREST :"+RbiInterest);
        float SbiInterest = S.interest(3)/100;
        System.out.println("SBI INTEREST :"+SbiInterest);
        float HdfcInterest = H.interest(4)/100;
        System.out.println("HDFC INTEREST :"+HdfcInterest);
        float IciciInterest = I.interest(5)/100;
        System.out.println("ICICI INTEREST :"+IciciInterest);

        System.out.println("<---------THANK YOU FOR CHOOSING OUR BANK-------->");

    }
}



