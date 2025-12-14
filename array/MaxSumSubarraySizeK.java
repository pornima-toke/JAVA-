//Maximum Sum Subarray of Size K Find the maximum sum of a subarray with size k.
import java.util.*;
public class MaxSumSubarraySizeK {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Compute sum of first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum; // Initial maximum sum

        // Step 2: Slide the window across the array
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
        System.out.println("Maximum sum of subarray of size " + k + " = " + result);
    }
}
