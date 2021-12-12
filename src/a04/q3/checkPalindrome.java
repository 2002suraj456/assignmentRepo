package a04.q3;
import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        String str , revStr = "";


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        str = sc.nextLine();

        int length = str.length();

        for(int i = length -1 ; i>= 0 ; i--)
            revStr = revStr + str.charAt(i);

        if(str.equals(revStr))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not  a palindrome");
    }
}
