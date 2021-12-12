package a04.q1;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {

        int numberOfElements;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        numberOfElements = sc.nextInt();

        int array[] = new int [numberOfElements];
        System.out.println("Enter the elements of the array : ");

        for(int i = 0; i<numberOfElements; i++)
        {
            array[i]= sc.nextInt();
        }

        System.out.println("Array elements are : ");

        for(int i = 0; i<numberOfElements; i++)
        {
            System.out.println(array[i]);
        }
        
    }
}
