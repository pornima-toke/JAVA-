//Q13. Write a java program to copy one array to another array.

import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        // Input elements of first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Create second array and copy elements
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        // Display copied array
        System.out.println("Elements of second array (copied):");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
