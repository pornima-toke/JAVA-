//Q7. Write a java program to display the reverse array.
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // array declaration

        // Step 2: Take input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)	{
            arr[i] = sc.nextInt();
        }

        // Step 3: Display reverse array
        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Explanation

Input size of the array.

Store elements into arr[].

Reverse loop → start from arr.length - 1 (last element) and go down to 0.

Print each element in reverse order.
*/