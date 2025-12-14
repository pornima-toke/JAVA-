/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal. */
	
import java.util.*;
public class CompareTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
	    int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y)
            System.out.println(x + " is greater");
        else if(x < y)
            System.out.println(x + " is smaller");
        else
            System.out.println("Both are equal");
    }
}