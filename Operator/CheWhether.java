//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.*;
public class CheWhether
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);  // Scanner for user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read an integer from user

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is NOT divisible by both 5 and 11.");
        }
    }
}
