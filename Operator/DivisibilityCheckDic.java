//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;

public class DivisibilityCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Decision-making using if-else
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is NOT divisible by both 5 and 11.");
        }
    }
}
