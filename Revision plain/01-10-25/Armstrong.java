//8. Write a program to input numbers and check if the number is cccor not?
import java.util.*;
public class Armstrong
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
        int n = sc.nextInt(), temp=n, sum=0, d=String.valueOf(n).length();
		
        while(n>0)
		{ sum+=Math.pow(n%10,d);
     	n/=10; }
        if(sum==temp) 
		System.out.println("Armstrong");
        else
		System.out.println("Not Armstrong");
    }
}
