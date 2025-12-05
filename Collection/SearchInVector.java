/*Q4. Take a Vector and add 8 integers.
 Accept a number from the user and check if it exists in the Vector.
Searching using loop
Logical condition:
 if (vector.get(i) == searchValue)
Explanation
Compare each element with the search number.
 If matched, set a boolean flag to true.
*/

import java.util.*;

public class SearchInVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Create a Vector of integers
        Vector<Integer> v = new Vector<>();

        // 2. Add 8 integers
        v.add(12);
        v.add(45);
        v.add(78);
        v.add(23);
        v.add(90);
        v.add(56);
        v.add(11);
        v.add(34);

        // 3. Accept a number to search
        System.out.print("Enter number to search: ");
        int searchValue = sc.nextInt();

        // 4. Flag for checking whether number exists
        boolean found = false;

        // 5. Search using a loop
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == searchValue) {   // logical comparison
                found = true;
                break;
            }
        }

        // 6. Output result
        if (found) {
            System.out.println(searchValue + " found in the Vector.");
        } else {
            System.out.println(searchValue + " not found in the Vector.");
        }
    }
}
