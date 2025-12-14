//Q12. Write a java program to calculate the simple intrest. 
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double interest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("Simple Interest = " + interest);
    }
}
