/*Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/

import java.util.Scanner;

public class SecondHighest {
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

        // Initialize highest and second highest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;   // update second highest
                first = arr[i];   // update highest
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];  // update second highest
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest value found!");
        } else {
            System.out.println("Second highest value = " + second);
        }
    }
}
