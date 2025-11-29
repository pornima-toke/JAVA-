//11. Write a program to create an array of size 5 and find max value?
import java.util.*;

public class Maxarr
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];   // Array of size 5

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) 
		{
            arr[i] = sc.nextInt();
        }

        // Assume first element is max
        int max = arr[0];

        // Compare with other elements
        for (int i = 1; i < arr.length; i++)
		{
            if (arr[i] > max) 
			{
                max = arr[i];
            }
        }

        System.out.println("Maximum value = " + max);
    }
}
