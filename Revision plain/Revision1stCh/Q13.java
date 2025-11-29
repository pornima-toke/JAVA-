/*13. Write program to create array of size 5 and input search key value and search value in array
and if value found return its index and return -1*/

import java.util.*;
public class Q13{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Array: ");
	int n = sc.nextInt();
	
	int a[] = new int[n];
	
	
	System.out.println("Enter the value in Array:"+n);
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the search key:");
	int searchkey = sc.nextInt();
	
	int index = -1;
	for(int i=0;i<n;i++){
		if(a[i]==searchkey){
			 index = i;
			 break;
		}
		
	}
	
	System.out.println("index:"+index);
	
	}
} 
