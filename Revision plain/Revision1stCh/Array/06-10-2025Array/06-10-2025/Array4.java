//4. Search for an Element in an Array

import java.util.*;
public class Array4{
	public static void main(String x[]){
	Scanner sc = new  Scanner(System.in);
	
	System.out.println("Enter the Size of Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	
	System.out.println("Enter the value in Array:");
	for(int i=0;i<a.length;i++){
		a[i] =  sc.nextInt();
	}
	System.out.println("Enetr the  search key:");
	int searchkey = sc.nextInt();
	
	//boolean f = false;
	for(int i=0;i<a.length;i++){
		if(a[i]==searchkey){
			//f=true;
			//break;
		System.out.println("Element is"+a[i]);
			
		}else{
			
			System.out.println("Element is not  found");
		}
	}
	/*if(f){
		System.out.println("Element is found");
	}
	else{System.out.println("Element is not found");
	}*/
	}
}
