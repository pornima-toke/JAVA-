//Q4. Write a java program to find even and odd number in array.
import java.util.Scanner;

public class EvenOddArray {
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

        // Step 3: Find even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {   // divisible by 2 → even
                System.out.print(arr[i] + " ");
            }
        }

        // Step 4: Find odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   // not divisible by 2 → odd
                System.out.print(arr[i] + " ");
            }
        }
    }
}
