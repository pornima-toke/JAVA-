//Example: WAP to create 3 x 3 matrix and calculate sum of left and  right diagonal of element 
import java.util.*;
public class matrix
{   public static void main(String x[])
	{ Scanner xyz = new Scanner(System.in);
	   int a[][]=new int[3][3];
	   System.out.println("Enter values");
	   for(int i=0; i<a.length; i++)
	   {
	     for(int j=0; j<a[i].length; j++)
		 {
		     a[i][j]=xyz.nextInt();
		 }
	   }
	   int lds=0,rds=0;
	   for(int i=0; i<a.length; i++)
	   { for(int j=0; j<a[i].length; j++)
		 {
		      if(i==j)
			  { lds=lds+a[i][j];
			  }
			  if(j==2-i)
			  { rds=rds+a[i][j];
			  }
			  System.out.printf("%d\t",a[i][j]);
		 }
		 System.out.printf("\n");
	   }
	   System.out.println("Sum of  left diagonal is  "+lds);
	   System.out.println("Sum of right diagonal is  "+rds);
	}
}

