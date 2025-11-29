/*Q5. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int[] getSortArray(): this function can perform sorting on array and return sorted array*/

import java.util.*;

public class ReturnSortArr
 {
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        SortArr s = new SortArr();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
		{
            a[i] = sc.nextInt();
        }

        s.setArray(a);  // pass array to SortArr class
        int sortedArray[] = s.getSortArray();  // get sorted array

        System.out.println("Sorted Array:");
        for (int val : sortedArray)
		{
            System.out.print(val + " ");
        }
    }
}

class SortArr
{
    int arr[];

    // function to accept array
    void setArray(int a[]) 
	{
        arr = a;
    }
	
    int[] getSortArray() 
	{
        // simple ascending order bubble sort
        for (int i = 0; i < arr.length - 1; i++) 
		{
            for (int j = i + 1; j < arr.length; j++) 
			{
                if (arr[i] > arr[j]) 
				{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}