//Maximum element in array
public class MaximumArr
{
   public static void main(String x[])
    {
       int a [] = {3,7,2,9,5};
	   int max = a[0];
	   for(int i = 1; i < 5; i++)
	   {
	    if(a[i] > max)
		  max = a[i];
	   }
	   System.out.println(max);
	}
}	