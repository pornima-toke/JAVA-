//Q8. Write a java program to calculate the sum of even or odd numbers.
import java.util.Scanner;

public class SumEvenOddArray {
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

        // Step 3: Calculate sum of even and odd numbers
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {   // even
                evenSum += arr[i];
            } else {                 // odd
                oddSum += arr[i];
            }
        }

        // Step 4: Display results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

/*
Explanation

Take array size and elements from user.

Use two variables evenSum and oddSum.

For each element:

If divisible by 2 → add to evenSum.

Else → add to oddSum.

Print both sums.