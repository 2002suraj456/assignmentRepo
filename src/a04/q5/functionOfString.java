/* w.a.p. to enter a string and displays five function of the string*/
package a04.q5;
import java.util.Scanner;

public class functionOfString {
    public static void main(String[] args) {
        
        String original;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String : ");
        original = in.nextLine();

        // length function
        int length = original.length();
        System.out.println("length of the string is " + length );
        // lowerCase
        String lowerCase = original.toLowerCase();
        System.out.println("lower case version of original string is : " + lowerCase);
        // upperCase
        String upperCase = original.toUpperCase();
        System.out.println("Upper case version of original string is : " + upperCase);
        // concat
        String concatenatedString = original.concat(" extra string");
        System.out.println("string with concatenation "+ concatenatedString );
        // indexOf
        int indexOf = original.indexOf('e');
        System.out.println("Index of e in the index "+ indexOf);
    }
}
