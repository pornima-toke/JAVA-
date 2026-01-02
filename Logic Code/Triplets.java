/*2. Check for Triplets with Zero Sum Problem:
 Check if any three elements in the array sum to 0. Example: 
Input: [-1, 0, 1, 2, -1, -4]
Output: (-1, 0, 1), (-1, -1, 2)*/
public class Triplets
{
	public static void main(String x[])
	{
		int[] arr = {-1,0,1,2,-1,-4};
		
		int n = 5;
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				for(int k = j + 1; k < n; k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println("(" + arr [i] + ", " + arr[j]  + ", " + arr[k] + ")");
					}
				}
			}
		}
	}
}