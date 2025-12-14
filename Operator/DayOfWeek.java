//Q54.Given a number 1–7, print the day name.
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a number (1 to 7): ");
        int day = sc.nextInt();  // Read the day number

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Th
