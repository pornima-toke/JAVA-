/*Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6. */

import java.util.*;
public class PrintArrEleEvenIndices
{
	public static void main(String x[])
	{
		int[] arr = {4, 9, 7, 11, 6};

        System.out.println("Array elements at even indices:");
        for (int i = 0; i < arr.length; i += 2) {   // step = 2 → only even indices
            System.out.print(arr[i] + " ");
        }
    }
}