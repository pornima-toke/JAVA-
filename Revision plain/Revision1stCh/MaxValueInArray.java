/*Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.*/
 
 import java.util.*;
 class FindMax{
 
 int x[];
 
	void setArray(int a[]){
		x = a;
	}
	
	int  getMax(){
		int max =0;
	
		for(int i=0;i<x.length;i++){
			if(x[i]>max){
			
			max = x[i];
			
			}
		}
		return max;
	}
 }

public class MaxValueInArray{

	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
	FindMax f1 = new FindMax();
	
	System.out.println("Enter the size of Array:");
	int n = sc.nextInt();
	int b[] = new int[n];
	
	System.out.println("Enter the value in array:");
	for(int i=0;i<n;i++){
		b[i]=sc.nextInt();
	}
	
	f1.setArray(b);
	int res = f1.getMax();
	
	System.out.println("Max is :"+ res);
	
	}

}