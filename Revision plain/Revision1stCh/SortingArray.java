/*Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array*/
 
 import java.util.*;
 class SortArr{
 
 int x[];
 
	 void setArray(int a[]){
		x=a;
	 }
	 
	 int[] getSortArray(){
		for(int i=0;i<x.length-1;i++){
		for(int j=i+1;j<x.length;j++){
			if(x[i]>x[j]){
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
			
		}
		return x;
	 }
 }

public class SortingArray{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		
	SortArr s1 = new SortArr();
	
	System.out.println("Enter the  size of Array:");
	int n = sc.nextInt();
	int b[] = new int [n];
	
	System.out.println("Enter the value in array:");
	for(int i=0;i<n;i++){
		b[i] = sc.nextInt();
	
	}
	
	s1.setArray(b);
	int res[] = s1.getSortArray();
	
	System.out.println("Sorted Array is: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
	}
}