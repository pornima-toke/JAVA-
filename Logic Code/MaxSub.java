/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1, -5,  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class MaxSub
{
	public static void main(String[] args)
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            int currentSum = 0;

            for(int j = i; j < arr.length; j++)
            {
                currentSum += arr[j];

                if(currentSum > maxSum)
                {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
