/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/

import java.util.*;
public class TripletsZeroSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        findTriplets(arr);
    }

    static void findTriplets(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort array
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;      // Pointer after nums[i]
            int right = n - 1;     // Last index

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    System.out.println("(" + nums[i] + ", " + nums[left] + ", " + nums[right] + ")");
                    
                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++; // Need bigger number
                }
                else {
                    right--; // Need smaller number
                }
            }
        }
    }
}
