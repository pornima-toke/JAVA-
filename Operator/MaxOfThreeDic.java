//Q11. Write a java program to find a maximum between three numbers.
import java.util.Scanner;

public class MaxOfThreeDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Check which one is maximum
        if (a >= b && a >= c) {
            System.out.println("Maximum number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum number is: " + b);
        } else {
            System.out.println("Maximum number is: " + c);
        }
    }
}
