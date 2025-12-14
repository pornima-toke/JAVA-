//Remove Duplicates from Sorted Array
//Remove duplicates from a sorted array using two pointers and return new length.
import java.util.*;

 public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        
        int newLength = removeDuplicates(arr);
        
        System.out.println("New length: " + newLength);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // place unique element
            }
        }
        return i + 1; // new length
    }
}
