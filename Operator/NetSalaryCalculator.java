//Q28. Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %, DA %, and tax %.
import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input basic salary and percentages
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA percentage: ");
        double hraPercent = sc.nextDouble();

        System.out.print("Enter DA percentage: ");
        double daPercent = sc.nextDouble();

        System.out.print("Enter Tax percentage: ");
        double taxPercent = sc.nextDouble();

        // Calculate HRA and DA amounts
        double hra = (hraPercent / 100) * basic;
        double da = (daPercent / 100) * basic;

        // Calculate gross salary
        double grossSalary = basic + hra + da;

        // Calculate tax amount
        double taxAmount = (taxPercent / 100) * grossSalary;

        // Calculate net salary
        double netSalary = grossSalary - taxAmount;

        // Output
        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax Deducted: ₹" + taxAmount);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
