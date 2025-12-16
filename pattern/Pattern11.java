/*Q16. Write a java program to print this pattern.

	*	*	*	*	*
	*			*
	*		*
	*	*
	*
*/

public class Pattern11
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1;j<= 6 - i; j++)
			{
				if(i==1 || j==1 || j== 6 - i)
				{
			  System.out.print("*  ");
				}else
				{
				System.out.print("   ");
				}
			}
			System.out.print("\n");
		}
	}
}