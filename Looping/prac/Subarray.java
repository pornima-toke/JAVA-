/*Q8. Write a Java program to find the maximum sum of any contiguous subarray of size k from a 
given array. 
Concept tested: Fixed-size sliding window for subarray sums. 
 Input: arr = [2, 1, 5, 1, 3, 2], k = 3 
 Output: 9 
 Explanation: Subarray [5,1,3] has the maximum sum = 9 */
 
 import java.util.*;
public class Subarray {
	 public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        //  sum of first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum; // Initial maximum sum

        // Slide the window across the array
        for (int i = k; i < n; i++) {
			
            // Subtract the element going out, add the element coming in
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " = " + result); // condition is a print 
    }
}
