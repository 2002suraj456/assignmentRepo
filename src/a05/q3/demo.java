package a05.q3;
import a05.q3.specialnumber.specialNumber;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        specialNumber num = new specialNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check whether it is specialnumber or not : ");

        int number = sc.nextInt();
        if(num.isSpecial(number))
            System.out.println(number + " is a specialnumber ");
        else
            System.out.println(number + " is not a specialnumber ");
        sc.close();
    }

}
