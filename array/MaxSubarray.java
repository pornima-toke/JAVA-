/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class MaxSumSubarray {
	public static void main(String x[]) {
		int [] nums = {-2, 1,  -3,   4,   -1,  2,  1, -5, 4};
		int n = nums.length;
		
		int maxsum = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			int currentSum = 0;
			
			for (intj=i; j<n; j++) {
				currentSum += nums [j];
				maxSum = math.max (maxSum, currentSum);
				  }
        }

        // Print the result
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
	