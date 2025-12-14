//Sum of Two Numbers Equals Target
//Given a sorted array and a target, check if there are two numbers that sum up to the target.

import java.util.*;
	public class TwoSumSorted {
    public static boolean hasPair(int[] arr, int target) {
        int left = 0;                  // Start pointer
        int right = arr.length - 1;    // End pointer

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;  // Found pair
            } else if (sum < target) {
                left++;   // Increase sum
            } else {
                right--;  // Decrease sum
            }
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 8;

        if (hasPair(arr, target)) {
            System.out.println("Pair exists!");
        } else {
            System.out.println("No pair found.");
        }
    }
}
