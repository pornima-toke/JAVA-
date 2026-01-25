/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])*/

public class SubMaxArr
{
	public static void main(String x[])
	{
	int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
	int max = arr [0];
	for (int i = 1; i < 9; i++)
	{ 
        int sum = 0;
        for(int j = i; j < arr.length; j++)
        {
                sum = sum + arr[j];

                if(sum > max)
                {
                    sum = sum;
                }
        }
    }

        System.out.println("Maximum Subarray Sum = " + max);
    }
}

