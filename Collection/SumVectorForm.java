/* Q3. Store any 7 integers in a Vector.
 Calculate and print the sum of all elements.
Addition operation
Looping through Vector
Explanation
Keep a variable sum initially 0, then add each element.
*/

import java.util.*;
public class SumVectorForm
{
	public static void main(String x[])
	{
		Vector<Integer> v = new Vector <>();
		//adding each element
		// 2. Adding 7 integers to the Vector
        v.add(10);
        v.add(25);
        v.add(7);
        v.add(40);
        v.add(18);
        v.add(9);
        v.add(31);

        // 3. Variable to store the sum
        int sum = 0;

        // 4. Loop to add each element of the vector
        for (int num : v) 
		{
            sum = sum + num;   // or sum += num;
        }

        // 5. Display the total sum
        System.out.println("Sum of all Vector elements = " + sum);
    }
}