//Find Maximum of Two Numbers Write a function findMax(int a, int b) that returns the maximum of two numbers. Call this function in main() and print the result.

import java.util.*;
public class FindMaxNumber {
	    // Function to return maximum of two numbers
	public static int findMax(int a, int b) {
		if(a > b) {
			return a; // return a if it is greater
		} else {
			return b; // otherwise return b
		}
	}
	//main methon
	public static void main(String x []) {
		int num1 = 25;
		int num2 = 40;
		// call the function
		int max = findMax(num1, num2);
		
		//print result
		System.out.println("The maximum number is : " + max);
	}
}