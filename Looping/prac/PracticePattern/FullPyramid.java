import static java.lang.System.out;
public class FullPyramid
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 6; i++)  // Outer loop for rows
        {
            boolean flag = true; //alternate between printing * and a space inside the star range
            for(int j = 1; j <= 11; j++)  // Inner loop for columns
            {
                if(j >= 7 - i && j <= 5 + i && flag)
					//j>=7-i =left limit or j<=5+i = right limit
                {
                    System.out.printf("*");
                    flag = false;
                }
                else
                {
                    System.out.printf(" ");
                    flag = true; //set flag = false so next character become space
                }
            }
            System.out.printf("\n");
        }
    }
}
