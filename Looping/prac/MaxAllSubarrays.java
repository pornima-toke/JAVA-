/* Q9. Write a Java program to find the maximum of all subarrays of size k. 
  Example: 
    Input: arr = [1,3,-1,-3,5,3,6,7], k = 3 
    Output: [3,3,5,5,6,7] 
    Explanation: Each window gives a maximum →  
    [1,3,-1] → 3   
    [3,-1,-3] → 3   
    [-1,-3,5] → 5   
    [-3,5,3] → 5   
    [5,3,6] → 6   
    [3,6,7] → 7 */

import java.util.*;
public class MaxSumSubarray {
	public static void main(String x[]) {
		
        // Array of integers (example input)
		int [] nums = {1,3,-1,-3,5,3,6,7};
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
