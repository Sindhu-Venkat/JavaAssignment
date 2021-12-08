package com.exercises;

class Rbi {

    int diff;

    int RateOfInterest(int newInterest) {
        int oldInterest = 3;
        diff = newInterest - oldInterest;
        return diff;
    }
}
class Sbi extends Rbi {

    int RateOfInterest(int newInterest) {
        int interest = newInterest + super.diff;
        return interest;
    }
    public static void main(String args[]) {
        Rbi R = new Rbi();
        Sbi S = new Sbi();
        int RbiInterest = R.RateOfInterest(5);
        int SbiInterest = S.RateOfInterest(RbiInterest);
        System.out.println("RBI INTEREST :"+RbiInterest);
        System.out.println("SBI INTEREST :"+SbiInterest);
    }
}



