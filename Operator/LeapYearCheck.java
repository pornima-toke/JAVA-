//Q38. Write a Java program to check whether a year is leap year or not.
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a year: ");
        int year = sc.nextInt();  // Read year input

        // Leap year condition:
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}
