/*Q1. Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0


Explanation
Even numbers are divisible by 2, so we check each number using modulus operator.
*/

import java.util.*;
public class EvenNumberFromVector
{
	public static void main(String x[])
	{
	 // 1. Creating a Vector of Integer type
        Vector<Integer> v = new Vector<>();

     // 2. Adding 5 integers into the Vector
	 v.add(12);
	 v.add(7);
	 v.add(20);
	 v.add(33);
	 v.add(8);
	 
	 
	 // 3. Displaying all even numbers
	 System.out.println("EvenNumber from Vector");
	 for(int num : v)
	 {
		 if (num % 2 == 0) //Logical check for even
		 {
			 System.out.println(num);
		 }
	 }
	}
}