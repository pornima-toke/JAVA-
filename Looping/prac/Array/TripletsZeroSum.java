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
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);  // Step 1: Sort array
        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Fix one number and use two pointers
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;  // skip duplicates

            int left = i + 1, right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // skip duplicates for left and right
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;   // need bigger sum
                } else {
                    right--;  // need smaller sum
                }
            }
        }

        // Step 3: Print result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
/*
✅ Explanation

After sorting, input becomes: [-4, -1, -1, 0, 1, 2].

Fix -4: left = -1, right = 2 → sum not zero.

Fix -1 (first): left = -1, right = 2 → sum = 0 ✅ → (-1, -1, 2)

Still with -1: left = 0, right = 1 → sum = 0 ✅ → (-1, 0, 1)

Other indices don’t give new triplets.
*/