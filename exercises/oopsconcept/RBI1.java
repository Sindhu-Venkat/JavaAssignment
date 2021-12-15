package com.exercises.oopsconcept;
    class RBI {               // method overriding
        int RPercentageInterest = 2;
        int interest(int InterestRate) {
            int RbiInterest = RPercentageInterest + InterestRate;
            return RbiInterest;
        }
    }
    class SBI extends RBI {
        int interest(int InterestRate) {
            return super.RPercentageInterest + InterestRate;
        }
    }
    class HDFC extends RBI {
        int interest(int InterestRate) {
            return super.RPercentageInterest + InterestRate;
        }
    }
    class ICICI extends RBI {
        int interest(int InterestRate) {
            return super.RPercentageInterest + InterestRate;
        }
    public static void main(String args[]) {
        RBI R = new RBI();
        SBI S = new SBI();
        HDFC H = new HDFC();
        ICICI I = new ICICI();
        int RbiInterest = R.interest(2);
        int SbiInterest = S.interest(3);
        int HdfcInterest = H.interest(4);
        int IciciInterest = I.interest(5);
        System.out.println("RBI INTEREST :" + RbiInterest);
        System.out.println("SBI INTEREST :" + SbiInterest);
        System.out.println("HDFC INTEREST :" + HdfcInterest);
        System.out.println("ICICI INTEREST :" + IciciInterest);

    }
}


