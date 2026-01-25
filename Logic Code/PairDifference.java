/* 3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
public class PairDifference 
{
    public static void main(String[] args) 
	{
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        int n = arr.length;
        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                if (i != j && Math.abs(arr[i] - arr[j]) == k)
				{
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                } 
            }
        }
    }
}
