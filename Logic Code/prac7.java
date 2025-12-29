//Take three numbers and print the largest
import java.util*;
public class prac6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		if(a >= b && a >= c)
		{
			System.out.println("Largest number is: " +
		
		
		
		
		  if(a >= b && a >= c)
        {
            System.out.println("Largest number is: " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("Largest number is: " + b);
        }
        else
        {
            System.out.println("Largest number is: " + c);
        }
    }
}