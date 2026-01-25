import java.util.*;
public class StrongNo
{ 
   public static void main(String x[])
   { Scanner sc = new Scanner(System.in);    
   System.out.println("Enter the number");
	  int n = sc.nextInt();
	  int sum = 0;
	  int temp = n;	
	  //int a = n;
	  while( n != 0)
	  {
	     int digit = n % 10;
		  int fact = 1;
        	 
	  
	  while(digit != 0)
	  { 
	     fact = fact * digit;
		digit--;
	  }
	  sum = sum + fact;
	  n = n / 10;
	  }
   
      if ( sum == temp)
   {
   System.out.println("Strong No");
   } else
   {
   System.out.println("Not Strong No");
   }
   }
}