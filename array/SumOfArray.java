//Q2. Write a java program to calculate sum of array is size 5.
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];   // Array of size 5
        int sum = 0;

        // Input elements
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];  // Add each element to sum
        }

        // Display sum
        System.out.println("Sum of array elements = " + sum);
    }
}
