/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        int arr[] = {10, 15, 22, 33, 44, 55};

        // Step 1: Convert array → ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr) {
            list.add(num); // Auto-boxing: int → Integer
        }

        // Step 2: Remove even numbers using Iterator
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            int n = itr.next();
            if(n % 2 == 0) {   // Check even number
                itr.remove();  // Safe removal
            }
        }

        // Step 3: Print updated list
        System.out.println("Updated List (Odd numbers only): " + list);
    }
}
