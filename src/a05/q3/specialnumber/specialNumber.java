package a05.q3.specialnumber;

public class specialNumber {

    /*
     * this function takes and int and returns
     * the factorial of the given number
     */
    int getFactorial(int number) {
        int fact = 1;

        do {
            fact = fact * number;
        } 
        while (number-- > 1);

        return fact;
    }

    /*
     * this function will take number as an input
     * and return a boolean true or false on whether the number
     * is special or not
     */
    public boolean isSpecial(int number) {

        int sumOfFact = 0;
        int tempNumber = number;
        while(tempNumber > 0)
        {
            int lsb = tempNumber % 10;
            sumOfFact = sumOfFact + getFactorial(lsb);
            tempNumber = tempNumber / 10;
        }

        if(sumOfFact == number)
            return true;
        else
            return false;
    }
}
