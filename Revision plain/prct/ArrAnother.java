//6. Copy One Array into Another
import java.util.*;
public class ArrAnother
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the values in Array:");
        for (int i = 0; i < n; i++)
		{
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];

        
        for (int i = 0; i < n; i++) 
		{
            b[i] = a[i];
        }

        System.out.println("\nBefore Copy (Array A):");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i] + " ");
        }

        System.out.println("\nAfter Copy (Array B):");
        for (int i = 0; i < b.length; i++) 
		{
            System.out.print(b[i] + " ");
        }
    }
}