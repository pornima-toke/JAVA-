/*Q17. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*
*/
public class Pattern12
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 9; i++)
        {
            for(int j = i; j < 5; j++)
            {
                System.out.print("\t");
            }

            // print stars
            for(int k = 1; k <= i; k++)
            {
                if(k == 1 || k == i || i == 9)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	
}
