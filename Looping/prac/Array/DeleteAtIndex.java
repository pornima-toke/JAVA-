/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/
import java.util.Scanner;

public class DeleteAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input index to delete
        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        // Validate index
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
            return;
        }

        // New array of size n-1
        int[] newArr = new int[n - 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Copy elements after index (shift left)
        for (int i = index + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }

        // Print result
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
