/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
public class ArrSort
{
	public static void main(String x[])
	{
		int [] arr = { 1,2,2,3,4};
		int n = 5;
		
		boolean isSorted = true;
		for(int i = 1; i < n; i++)
		{
			if(arr[i] < arr[i - 1])
			{
				isSorted = false;
				break;
			}
		}
		System.out.println(isSorted);
	}
}