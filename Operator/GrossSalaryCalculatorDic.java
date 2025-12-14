/*Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;

public class GrossSalaryCalculatorDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input basic salary
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra, da, gross;

        // Decision-making logic
        if (basic <= 10000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
        } else if (basic <= 20000) {
            hra = 0.25 * basic;
            da = 0.90 * basic;
        } else {
            hra = 0.30 * basic;
            da = 0.95 * basic;
        }

        // Calculate gross salary
        gross = basic + hra + da;

        // Output
        System.out.println("Gross Salary = " + gross);
    }
}
