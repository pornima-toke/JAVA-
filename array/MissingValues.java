/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
import java.util.Scanner;
import java.util.Arrays;
*/
import java.util.*;
public class MissingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array (just in case user enters unsorted numbers)
        Arrays.sort(arr);

        // Find missing values
        System.out.println("Missing values:");
        for (int num = arr[0]; num <= arr[n - 1]; num++) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(num + " ");
            }
        }
    }
}
