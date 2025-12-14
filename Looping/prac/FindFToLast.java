//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FindFToLast {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int last = num % 10;
        int first = num;

        while (first >= 10) {
            first /= 10;
        }

        System.out.println("First Digit: " + first);
        System.out.println("Last Digit: " + last);
    }
}
