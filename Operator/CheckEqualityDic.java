//Q13. Write a java program to accept two integers and check whether they are equal or not.
import java.util.Scanner;

public class CheckEqualityDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if numbers are equal
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }
}
