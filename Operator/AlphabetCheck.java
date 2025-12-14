//Q36. Write a Java program to check whether character is alphabetic or not.
import java.util.*;
public class AlphabetCheck
{
	public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read a single character

        // Check if character is in alphabet range
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }
    }
}
