//Q9. Write java program to merge two array and display it.
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Step 2: Input size of second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Step 3: Merge arrays
        int[] merged = new int[n1 + n2];
        int index = 0;

        // Copy first array into merged
        for (int i = 0; i < n1; i++) {
            merged[index++] = arr1[i];
        }

        // Copy second array into merged
        for (int i = 0; i < n2; i++) {
            merged[index++] = arr2[i];
        }

        // Step 4: Display merged array
        System.out.print("Merged array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}

/*
Explanation

Take input for first array and second array.

Create a new array merged of size (n1 + n2).

Copy elements of arr1 and then arr2 into merged.

Print the merged array.
*/
