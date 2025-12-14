import static java.lang.System.out;
public class Example
{
	public static void main(String x[])
  {
	int n=4;
	for(int i = 1; i <= n; i++)
	{
		for(int j=1; j<=n-i; j++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	 }
  }
}			