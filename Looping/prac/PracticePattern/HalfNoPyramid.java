import static java.lang.System.out;
public class HalfNoPyramid
{
	/*
	public static void main(String x[])
	{
		int n = 5;ButterflyPattern
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
*/
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        System.out.print(sum);
		}
    }
}
