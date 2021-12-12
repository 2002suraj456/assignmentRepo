package a04.q2;
import java.util.Scanner;

public class arrMinMax {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = inp.nextInt();
        int arr[] = new int[size];

        for(int i =0 ; i<size ;i++){
            System.out.println("Enter : ");
            arr[i] = inp.nextInt();
        }

        int max = arr[0], min = arr[0];


        for(int i =0 ;i<size ;i++){

            if(arr[i]>max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);

        inp.close();
    }
}
