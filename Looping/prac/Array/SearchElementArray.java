//Q6. Write a java program to search element in array , its element found or not.import java.util.Scanner;
import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // array declaration

        // Step 2: Take input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Take search element
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 4: Search element
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {   // check element
                found = true;
                break;  // stop searching once found
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println(key + " is found in the array.");
        } else {
            System.out.println(key + " is NOT found in the array.");
        }
    }
}


/*
Explanation

Input array size and elements.

Take key (element to search).

Loop through array using if (arr[i] == key) to compare.

Boolean flag (found) is used to mark if element exists.

Finally, print whether element was found or not.
*/