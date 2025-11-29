/*8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods. */

import java.util.*;
class SquareFinder {
	public int square(int num) {
		return num * num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :");
		int number = sc.nextInt();
		
		 SquareFinder sf = new SquareFinder();
        int result = sf.square(number);


		System.out.println("Square of " + number + "is:" + result);
	}
}