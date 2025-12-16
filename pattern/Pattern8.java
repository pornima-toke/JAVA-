/*Q12. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#
*/

public class Pattern8
{
	public static void main(String x[])
	{
        int rows = 5;

        for(int i = rows; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                if(i % 2 == 1)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
	}
}