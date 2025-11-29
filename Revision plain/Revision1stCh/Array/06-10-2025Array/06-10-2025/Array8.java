//8. Count Even and Odd Numbers in an Array

import java.util.*;
public class Array8{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	
	
	System.out.println("Enter the value in Array:");
	for(int i=0;i<a.length;i++){
		a[i] = sc.nextInt();
	}
	int even=0 ,  odd = 0;
	
	for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
			even++;
		}
		else{
				odd++;
		}
	}
	System.out.println("Even count is:"+even);
	System.out.println("Odd count is:"+odd);
	
	}
}