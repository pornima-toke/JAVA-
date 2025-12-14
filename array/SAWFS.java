//Example: with source code 
import java.util.*;
public class SAWFS
{   public static void main(String x[])
	{  
	/*Scanner xyz  = new Scanner(System.in);
	   int a[]=new int[9];
	   int k=3;
	   System.out.println("Enter values in array\n");
	   for(int i=0; i<a.length;i++)
	   { a[i]=xyz.nextInt();
	   }
	   int max=Integer.MIN_VALUE;
	   int sum=0;
	   for(int i=0; i<k; i++)
	   {  sum=sum+a[i];
	   }
	   for(int i=k; i<a.length; i++)
	   {
		     sum =sum + a[i]-a[i-k];
			 if(sum>max)
			 { max=sum;
			 }
	   }
	   System.out.printf("Max value is %d\n",max);

	}	
}
*/

/*
Example: WAP to create array of size 5 and rotate by in clock wise direction using specified size

		
	  import java.util.*;   // Importing utility package to use Scanner for input

public class CAAPP   // Class declaration
{
    public static void main(String x[])   // Main method: program execution starts here
    {
        Scanner xyz  = new Scanner(System.in);   // Scanner object to take input from user

        int a[]=new int[5];   // Declare integer array of size 5

        System.out.println("Enter values in first array");   // Prompt user
        for(int i=0; i<a.length; i++)   // Loop to read 5 values
        {
            a[i]=xyz.nextInt();   // Store user input into array
        }

        System.out.println("\nOriginal Array\n");   // Print original array message
        for(int i=0; i<a.length; i++)   // Loop to print array
        {
            System.out.printf("%d\t",a[i]);   // Print each element with tab space
        }

        // Step 1: Reverse the entire array
        int start=0, end=(a.length-1);   // Pointers at first and last index
        while(start<=end)   // Run until both meet
        {
            int temp=a[start];   // Swap logic
            a[start]=a[end];
            a[end]=temp;
            start++;   // Move start forward
            end--;     // Move end backward
        }

        System.out.println("\nArray after reverse");   // Message after first reverse
        for(int i=0; i<a.length; i++)   // Print array
        {
            System.out.printf("%d\t",a[i]);
        }

        int k=2;   // Rotation size (number of positions to rotate right/clockwise)

        // Step 2: Reverse the first k elements
        start=0;    
        end=k-1;    // End pointer at k-1 index
        while(start<=end)
        {
            int temp=a[start];   // Swap logic
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        System.out.println("\nArray after reverse");   // Message after reversing first k
        for(int i=0; i<a.length; i++)   // Print array
        {
            System.out.printf("%d\t",a[i]);
        }

        // Step 3: Reverse the remaining n-k elements
        start=k;   // Start pointer from index k
        end=(a.length-1);   // End pointer at last index
        while(start<=end)
        {
            int temp=a[start];   // Swap logic
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        System.out.println("\nArray after reverse");   // Final rotated array message
        for(int i=0; i<a.length; i++)   // Print array
        {
            System.out.printf("%d\t",a[i]);
        }
    }
}
*/