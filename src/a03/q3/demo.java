/* W.A.P. to initialize the instance variable of electricity class
 * using parameterized constructor. Calculate bill. */
package a03.q3;
import java.util.Scanner;

class demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter previous reading");
        int previousReading = sc.nextInt();

        System.out.println("Enter current reading");
        int currentReading = sc.nextInt();
        electricity e = new electricity(previousReading,currentReading);
        e.calculateBill();
    }
}
