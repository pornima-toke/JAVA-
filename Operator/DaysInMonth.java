//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month number
        System.out.print("Enter month number (1 to 12): ");
        int month = sc.nextInt();

        // Determine number of days using if-else
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            System.out.println("This month has 31 days.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("This month has 30 days.");
        } else if (month == 2) {
            System.out.println("This month has 28 days (February - non-leap year).");
        } else {
            System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}
