1.Write program to input two values using command line argument and perform its swapping?

//Q2. Write a java program swap two number without using third variable. 
import java.util.*;
public class SwapNo
{
	public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
