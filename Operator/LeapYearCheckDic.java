//Q8. Write a Java program to check whether a year is a leap year or not.
import java.util.Scanner;

public class LeapYearCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year check using decision making
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
