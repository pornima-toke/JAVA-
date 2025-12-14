//Reverse an Array In-Place Reverse an array using the two-pointer technique.
import java.util.*;
public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArrays(arr);

        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArrays(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
