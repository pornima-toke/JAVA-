//Minimum Sum Subarray of Size K Find the minimum sum of a subarray with size k.
import java.util.*;
public class MinSumSubarraySizeK {
    public static int minSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Compute sum of first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;  // Initial minimum sum

        // Step 2: Slide the window across the array
        for (int i = k; i < n; i++) {
            // Subtract the element going out, add the element coming in
            windowSum += arr[i] - arr[i - k];
            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = minSumSubarray(arr, k);
        System.out.println("Minimum sum of subarray of size " + k + " = " + result);
    }
}
