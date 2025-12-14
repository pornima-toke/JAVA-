//Q31. Write a Java program to check whether a number is even or odd. 
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Check if number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
