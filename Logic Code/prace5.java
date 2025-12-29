//Take two numbers and print the larger 
import java.util.*;
public class prace5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println("Larger number is: " + a);
        }
        else if(b > a)
        {
            System.out.println("Larger number is: " + b);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}