//Q5. Write a java program to find positive and negative number in array.
import java.util.Scanner;

public class PositiveNegativeArray {
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

        // Step 3: Find positive numbers
        System.out.print("Positive numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {   // greater than 0 → positive
                System.out.print(arr[i] + " ");
            }
        }

        // Step 4: Find negative numbers
        System.out.print("\nNegative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {   // less than 0 → negative
                System.out.print(arr[i] + " ");
            }
        }
    }
}
/*
Explanation

Input: User enters the size of array and its elements.

Check positive → If number is > 0.

Check negative → If number is < 0.

Zero is ignored because it is neither positive nor negative (but we can handle it separately if needed).
*/