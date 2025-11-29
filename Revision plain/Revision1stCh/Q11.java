//11. Write a program to create an array of size and arrange all values in ascending order?

import java.util.*;
public class Q11{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array:");
	int n =sc.nextInt();
	int a[]=new int[n];
	
	System.out.println("Enter the values in Array:"+n);
	
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
		
	System.out.println("Array in ascending order:");
	for(int i=0;i<n;i++){
		
		System.out.println(a[i]+ " " );
	}
}
		
	
}

