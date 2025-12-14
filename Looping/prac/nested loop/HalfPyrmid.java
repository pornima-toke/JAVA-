import static java.lang.System.out;
public class HalfPyrmid
{ 
   public static void main(String x[])
   {
	   int n = 5; // Number of rows
	   for (int i =1; i<=n; i++) {
       for (int j = 1; j <= i; j++) {
		System.out.print(j +  " ");
	   }
       System.out.println();
	   }
   }
}   