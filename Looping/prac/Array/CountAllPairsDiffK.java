/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import java.util.*;
public class CountAllPairsDiffK
{
	public static void main(String x[])
	{
		/*
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && Math.abs(arr[i] - arr[j]) == k) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
*/

        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (set.contains(num + k)) {
                System.out.println("(" + num + "," + (num + k) + ")");
            }
            if (set.contains(num - k)) {
                System.out.println("(" + num + "," + (num - k) + ")");
            }
        }
    }
}
 