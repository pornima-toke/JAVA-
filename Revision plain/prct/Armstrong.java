//8. Write a program to input numbers and check if the number is Armstrong or not?
import java.util.*;
public class Armstrong
{
   public static void main(String x[])
   {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	int sum=0;
	int OriginalNum = n;
	
	int temp = n;
	int digit = 0;
	
	while(temp!=0)
	{
		temp=temp/10;
		digit++;
	}
	
	temp = n;
	
	while(temp!=0)
	{
		int a = temp%10;
		int power =1;
	
	for(int i=1;i<=digit;i++)
	{
		power = power * a;
	}
	
	
	sum = sum + power;
	temp = temp/10;
	}
	
	if(sum == OriginalNum)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println(" Not Armstrong");
	}
	}
}