//Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
//Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double hra, da, grossSalary;

        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;  // 20%
            da = 0.80 * basicSalary;   // 80%
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;  // 25%
            da = 0.90 * basicSalary;   // 90%
        } else {
            hra = 0.30 * basicSalary;  // 30%
            da = 0.95 * basicSalary;   // 95%
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary = " + grossSalary);
    }
}
