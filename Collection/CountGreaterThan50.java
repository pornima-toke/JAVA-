/*Q2. Create a Vector of integers.
Store 10 numbers and count how many numbers are greater than 50.
Iteration
Logical comparison: num > 50
Counter concept


Explanation
Use a counter that increases each time the number is greater than 50.
*/
import java.util.*;

public class CountGreaterThan50 {
    public static void main(String[] args) {

        // 1. Create a Vector of Integer
        Vector<Integer> v = new Vector<>();

        // 2. Adding 10 integers into the Vector
        v.add(12);
        v.add(75);
        v.add(40);
        v.add(90);
        v.add(33);
        v.add(58);
        v.add(61);
        v.add(22);
        v.add(85);
        v.add(49);

        // 3. Counter to count numbers > 50
        int count = 0;

        // 4. Iterate over the vector and check condition
        for (int num : v) {
            if (num > 50) {   // logical comparison
                count++;     // increase counter
            }
        }

        // 5. Display result
        System.out.println("Numbers greater than 50: " + count);
    }
}
