package a03.q3;

class electricity{
    int currentReading,
        previousReading;

    electricity(int pr,int cr) {
        currentReading = cr;
        previousReading = pr;
    }

    void calculateBill(){

        int unit,
            totalBill;

        unit = currentReading - previousReading;
        totalBill = unit * 5;
        System.out.println("Unit Consumed   : " + unit );
        System.out.println("Total Bill      : " + totalBill );
    }
}
