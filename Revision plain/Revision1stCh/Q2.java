//2. Write a program to input numbers using Scanner class and reverse it?

import java.util.*;
public class Q2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	int rev=0,rem;
	
	rem=num%10;
	rev=rev*10+rem;
	num = num/10;
	
	rem=num%10;
	 rev=rev*10+rem;
	num = num/10;
	
	rem=num%10;
	rev=rev*10+rem;
	num = num/10;
	
	System.out.println(rev);
	}
}