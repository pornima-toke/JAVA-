//12. Write a program to create an array of size and arrange all values in ascending order?
import java.util.*;

public class AscendArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of size 5
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting in ascending order
        Arrays.sort(arr);

        // Display sorted array
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
