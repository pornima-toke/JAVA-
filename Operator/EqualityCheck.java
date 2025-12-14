//Q43. Write a java program to accept two integers and check whether they are equal or not.
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();  // Read first number

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();  // Read second number

        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }
}
