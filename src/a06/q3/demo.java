package a06.q3;

import java.util.Scanner;

import a06.q3.mathutil.subtractionClass;

class demo {
    public static void main(String[] args) {
        subtractionClass sub = new subtractionClass(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number to subtract");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("result is " + sub.subtractInt(num1, num2));;
        sc.close();
    }
}
