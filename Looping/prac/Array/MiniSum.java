//Minimum Sum Subarray of Size K Find the minimum sum of a subarray with size k.
import java.util.*;

public class MiniSum {
    // Method to find minimum sum subarray of size k
    public static int minSumSubarray(int[] arr, int k) {
        int n = arr.length;   // FIX 1: define n
        int windowSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;
 
        // Sliding window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            minSum = Math.min(minSum, windowSum); // FIX 2: Math.min
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = minSumSubarray(arr, k);  // FIX 3: match method name
        System.out.println("Minimum sum of subarray of size " + k + " = " + result);
    }
}
