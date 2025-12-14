//Q13. Write a java program to calculate the compound intrest.
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate amount using compound interest formula
        double amount = principal * Math.pow((1 + rate / 100), time);

        // Calculate compound interest
        double interest = amount - principal;

        // Output results
        System.out.println("Compound Interest = " + interest);
        System.out.println("Total Amount = " + amount);
    }
}
