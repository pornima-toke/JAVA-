/*5. Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]*/

public class ReverseArr
{
	public static void main(String x[])
	{
		int a[] = {1,2,3,4,5};
		int s = 0, e = a.length;
		
		while ( s < e)
		{
			a[s] = a[s] + a[e];
			a[e] = a[s] - a[e];
			a[s] = a[s] - a[e];
			
			s++;
			e--;
		}
		for(int i = 0; i <a.length; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}