//14. Write a program to create an array of size 10 and find occurrences of every element in the array?
import java.util.*;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        // Input array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // To mark visited elements
        boolean visited[] = new boolean[arr.length];

        System.out.println("Occurrences of elements:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])  // already counted
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }
            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }
}
