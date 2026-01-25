/*5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3  */
public class MissingNo1toN
{
	public static void main(String x[])
	{
		int [] arr = {1,2,4,5};
		int N = 5;
		
		int totalSum = N * (N + 1) / 2;
		int arrSum  = 0 ;
		for(int i = 0 ; i < 4; i++)
		{
			arrSum = arrSum + arr[i];
		}			
		int missing = totalSum - arrSum;
		System.out.println(missing);
	}
}