//Q16. Write a java program to find a minimum between three numbers.
import java.util.Scanner;

public class MinimumBetweenThreeDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Compare the numbers to find the minimum
        int min;

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.println("Minimum number is: " + min);

        sc.close();
    }
}
