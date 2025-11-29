/*18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.*/
import java.util.*;
class LeapYearChecker {
	public boolean isLeapYear(int year) {
		return(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        LeapYearChecker lyc = new LeapYearChecker();
        if (lyc.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
	}
}