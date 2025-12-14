/* Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus. */
//double is 8byte and 64 bit


import java.util.*;
public class BonusEligibility {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
        int serviceYears = sc.nextInt();
        double salary = sc.nextDouble();

        if(serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: Rs. " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}

