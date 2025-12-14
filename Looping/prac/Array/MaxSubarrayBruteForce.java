/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.Scanner;
public class MaxSubarrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE; // start with very small number

        // Step 1: Generate all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];  // add current element
                // Step 2: Update max sum
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

		
	/*
	int maxSum = Integer.MIN_VALUE;   // 1) best seen so far
for (int i = 0; i < arr.length; i++) {   // 2) choose start index
    int currentSum = 0;                   // 3) sum of subarray arr[i..j]
    for (int j = i; j < arr.length; j++) { // 4) extend end index
        currentSum += arr[j];             // 5) add next element
        if (currentSum > maxSum) {        // 6) update answer
            maxSum = currentSum;
        
		What each step does

maxSum = -∞ (actually Integer.MIN_VALUE)
Start with the smallest possible so even all-negative arrays work.

Pick a start i (0 to n−1)
We’ll evaluate every subarray that starts at i.

currentSum = 0
Fresh running sum for this start index.

Move end j from i to n-1
This generates all subarrays arr[i..j].

Accumulate
currentSum += arr[j] equals the sum of arr[i] + arr[i+1] + … + arr[j].

Update best
If currentSum beats maxSum, remember it.

Dry run (key moments)

We only note points where maxSum improves.

i = 0
j=0: sum = -2 → maxSum = -2
j=1: sum = -1 → maxSum = -1
j=3: sum = 0 → maxSum = 0
j=5: sum = 1 → maxSum = 1
j=6: sum = 2 → maxSum = 2

i = 1 (reset currentSum=0)
j=5: sum from 1..5 = 3 → maxSum = 3
j=6: sum from 1..6 = 4 → maxSum = 4

i = 3 (start at the 4)
j=3: sum = 4 → maxSum stays 4
j=5: sum = 5 → maxSum = 5
j=6: sum = 6 ✅ → maxSum = 6 (subarray [4, -1, 2, 1])

No later start beats 6, so the final answer is 6.

Complexity

Time: O(n²) (we try every i..j pair)

Space: O(1)

If you’d like, I can show the Kadane’s Algorithm version (O(n)) and also track the exact start/end indices.
*/
