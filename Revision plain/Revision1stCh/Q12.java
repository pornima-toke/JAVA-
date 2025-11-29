//11. Write a program to create an array of size 5 and find max value?

import java.util.*;
public class Q12{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.println("Enter the values in Array:");
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	
	int max=0;
	for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
		System.out.println("Max is:"+max);
	
	}
} 
