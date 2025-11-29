//7. Write a program to input numbers and check if the number is palindrome or not?

import java.util.*;
public class Q7{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	int rev =0, temp =n;
	while(n!=0){
		
	int a = n%10;
		
	rev = rev*10+a;
	
	n = n/10;
	
	}
	if(rev==temp){
		System.out.println("Palindrome");
	}
	else{System.out.println("Not Palindrome");}
	}
}