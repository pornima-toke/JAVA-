//Move Zeros to End
//Move all 0s to the end of the array while maintaining the order of non-zero elements.
import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeros(int[] arr) {
        int pos = 0; // slow pointer

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
    }
}
