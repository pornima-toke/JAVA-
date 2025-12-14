//Q18. Write a Java program to convert days to years, month and week.
import java.util.*;
public class ConvDayMonth
{
	public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);

        // Input number of days
        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        // Convert days into years
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        // Convert remaining days into months
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        // Convert remaining days into weeks
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Output the result
        System.out.println("Years : " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks : " + weeks);
        System.out.println("Days  : " + days);
    }
}
