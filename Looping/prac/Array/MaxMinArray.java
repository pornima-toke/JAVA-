//Q3. Write a java program to find maximum and minimum number in array.
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Take array input
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Assume first element as both max and min
        int max = arr[0];
        int min = arr[0];

        // Step 4: Traverse array to find max and min
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];   // update max
            }
            if(arr[i] < min) {
                min = arr[i];   // update min
            }
        }

        // Step 5: Display results
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
    }
}

/*

📖 Explanation:

int[] arr = new int[n]; → creates an array of size n.

arr[0] is assumed as both max and min initially.

Loop starts from index 1:

If arr[i] > max → update max.

If arr[i] < min → update min.

Finally print max and min values.
*/