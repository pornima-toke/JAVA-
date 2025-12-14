/*Q10. Write a Java program to find all unique triplets in the array whose sum is zero using the two 
pointer technique. 
 
  Example: 
   Input: arr = [-1, 0, 1, 2, -1, -4]   
   Output: [[-1, -1, 2], [-1, 0, 1]]  */
   
import java.util.*;
public class TripletsZeroSum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array:");
	int n= sc.nextInt();
	
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0; i<n ; i++){
	 a[i] = sc.nextInt();
	}
	
	// Outer loop: choose starting index
	
	for(int i=0 ; i<a.length ; i++){
		
	    for(int j=i+1; j<=a.length-1;j++){
		  
			for(int k=j+1 ; k<=a.length-2;k++){
				if(a[i]+a[j]+a[k]==0){
					System.out.print("("+a[i] +","+a[j]+","+a[k]+")");
				}
			}	
		}	
	}
  }
}