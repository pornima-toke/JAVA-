//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input week number
        System.out.print("Enter week number (1 to 7): ");
        int dayNumber = sc.nextInt();

        // Check and print corresponding day using if-else
        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
