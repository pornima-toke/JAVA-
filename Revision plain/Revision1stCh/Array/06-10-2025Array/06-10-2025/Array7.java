//7. Sort an Array (Ascending Order)

import java.util.*;
public class Array7{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter the size in Array:");
	int n = sc.nextInt();
	int a[] = new int [n];
	
	System.out.println("Enter the value in Array:");
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();
	}
	System.out.println("Before Sorting Array:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+ " ");
	}
	
	for(int i=0 ;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	System.out.println("\nAfter Sorting Array:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+ " ");
	}
	}
}