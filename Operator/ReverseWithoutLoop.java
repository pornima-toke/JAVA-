//Q21. Write a Java program to reverse a number without using loop.
//Input a number: 123 Reverse number: 321

import java.util.Scanner;

public class ReverseWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert number to string
        String str = String.valueOf(number);

        // Reverse the string using StringBuilder
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Convert reversed string back to integer
        int reversedNumber = Integer.parseInt(reversedStr);

        // Output the result
        System.out.println("Reverse number: " + reversedNumber);
    }
}
