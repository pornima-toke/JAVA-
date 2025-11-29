/*16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing. */
import java.util.*;
class MultiplicationTable {
	public void printTable(int number) {
		System.out.println("Multiplication Table of " + number + ":");
		for (int i =1; i <= 10; i++) {
			System.out.println(number + "x" + i + "=" + (number * i));
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();

		MultiplicationTable mt = new MultiplicationTable();
		mt.printTable(num);
	}
}