/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/

import java.util.*;
public class MaxSumSubarray {
	public static void main(String x[]) {
		
        // Array of integers (example input)
		int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = nums.length;   // Store the size of array

        int maxSum = Integer.MIN_VALUE;  
        // Initialize maxSum to the smallest possible value
        // (so that even negative sums can be compared)

        // Outer loop: choose starting index of subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0;   // Reset sum for each new start

            // Inner loop: choose ending index of subarray
            for (int j = i; j < n; j++) {
                currentSum += nums[j];   // Add nums[j] to current sum
                // Update maxSum if currentSum is larger
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        // Print the result
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

/*
Iterations

i = 0 (subarrays starting from index 0):

[-2] → sum = -2 → maxSum = -2

[-2, 1] → sum = -1 → maxSum = -1

[-2, 1, -3] → sum = -4 → maxSum = -1

… continues

i = 3 (subarrays starting from index 3 → value = 4):

[4] → sum = 4 → maxSum = 4

[4, -1] → sum = 3 → maxSum = 4

[4, -1, 2] → sum = 5 → maxSum = 5

[4, -1, 2, 1] → sum = 6 → maxSum = 6 ✅

[4, -1, 2, 1, -5] → sum = 1 → maxSum = 6

[4, -1, 2, 1, -5, 4] → sum = 5 → maxSum = 6

So the best subarray is [4, -1, 2, 1] with sum = 6.

✅ Final Output
Maximum Subarray Sum = 6

🔹 Time Complexity

O(n²) because for each starting index i, we loop till the end j.

Works fine for small arrays.
*/