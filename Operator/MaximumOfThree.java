//Q41. Write a java program to find maximum between three numbers.
import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Maximum is: " + c);
        }
    }
}
