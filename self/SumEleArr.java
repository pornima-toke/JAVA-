//Find the sum of all elements in an array
import java.util.*;
public class SumEleArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		int [] arr = new int[n];
        int sum = 0;                   

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();  
            sum = sum + arr[i];        
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
