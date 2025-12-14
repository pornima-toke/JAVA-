//Count Pairs with Given Sum
//Count how many pairs in an unsorted array sum up to a target using two pointers.

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        System.out.println("Count of pairs = " + countPairs(arr, target));
    }

    public static int countPairs(int[] arr, int target) {
        Arrays.sort(arr); // Step 1: Sort array
        int left = 0, right = arr.length - 1;
        int count = 0;

        // Step 2: Use two pointers
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                count++;
                left++;
                right--;  // Move both pointers inward
            } 
            else if (sum < target) {
                left++;  // Need bigger sum
            } 
            else {
                right--; // Need smaller sum
            }
        }
        return count;
    }
}
