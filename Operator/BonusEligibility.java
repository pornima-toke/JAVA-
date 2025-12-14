/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
*/
import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int service = sc.nextInt();

        // Check bonus eligibility
        if (service > 5) {
            double bonus = salary * 0.05; // 5% of salary
            System.out.printf("You are eligible for a bonus of ₹%.2f\n", bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        sc.close();
    }
}
