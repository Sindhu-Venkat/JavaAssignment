package com.exercises.oopsconcept;

class Rbi {               // method overriding
    int RPercentageInterest = 2;
    int interest(int InterestRate) {
        int RbiInterest = RPercentageInterest+InterestRate;
        return RbiInterest;
    }
}
   class Sbi extends Rbi {
    int interest(int InterestRate) {
        return super.RPercentageInterest+InterestRate;
    }
}
    class Hdfc extends Rbi {
        int interest(int InterestRate) {
            return super.RPercentageInterest + InterestRate;
        }
    }
        class Icici extends Rbi {
            int interest(int InterestRate) {
                return super.RPercentageInterest + InterestRate;
            }
    public static void main(String args[]) {
        Rbi R = new Rbi();
        Sbi S = new Sbi();
        Hdfc H = new Hdfc();
        Icici I = new Icici();
        int RbiInterest = R.interest(2);
        int SbiInterest = S.interest(3);
        int HdfcInterest = H.interest(4);
        int IciciInterest = I.interest(5);
        System.out.println("RBI INTEREST :"+RbiInterest);
        System.out.println("SBI INTEREST :"+SbiInterest);
        System.out.println("HDFC INTEREST :"+HdfcInterest);
        System.out.println("ICICI INTEREST :"+IciciInterest);

    }
}



