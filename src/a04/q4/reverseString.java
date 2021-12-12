/* w.a.p. to insert a string and find the length
 * and reverse of the string */
package a04.q4;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        
        String original,reverse="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String : ");
        original = in.nextLine();

        int length = original.length();

        System.out.println("Length of the string is : " + length);

        for(int i = length-1 ; i>=0 ;i--)
        {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of the string is : " + reverse);
        in.close();
    }
}
