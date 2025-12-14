/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.*;
public class CheckArrIsSorted
{
	public static void main(String x[])
	{
        int[] arr = {1, 2, 2, 3, 4};
        
        boolean isSorted = true;  // assume sorted initially
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {  // if any element is greater than next
                isSorted = false;       // array is not sorted
                break;                  // exit loop early
            }
        }
        
        System.out.println(isSorted);
    }
}
/*
Explanation of Code

boolean isSorted = true;
→ We assume the array is sorted at first.

Loop:

for (int i = 0; i < arr.length - 1; i++)


Runs from first element to second last element (because we compare with i+1).

Condition:

if (arr[i] > arr[i+1])


If any element is greater than the next one, then it breaks the sorted order.

Action:

If condition is true → set isSorted = false and break the loop (no need to check further).

Print Result:

Finally, System.out.println(isSorted); prints true or false.
*/