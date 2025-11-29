//Q21. Write a Java program to reverse a number without using loop Input a number: 123 Reverse number: 321

import java.util.*;
public class RevsApp{
	public static void main(String x[])
	{
		
		Scanner sc = new Scanner(System.in);
		int num , rem , rev=0;
		System.out.println("Enter the number");
		num = sc.nextInt();
	 
		
		rem = num%10;
		num =  num/10;
		rev = rev*10+rem;
		
		rem = num%10;
		num =  num/10;
		rev = rev*10+rem;
		
		rem = num%10;
		num =  num/10;
		rev = rev*10+rem;
		
		System.out.printf(" Rev %d\n " , rev);
		
		
		 }
}
