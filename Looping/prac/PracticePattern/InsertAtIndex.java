import java.util.Scanner;

public class InsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input index and value
        System.out.print("Enter index to insert at: ");
        int index = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        // Create new array with +1 size
        int[] newArr = new int[n + 1];

        // Copy and insert value
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;  // insert at given index
            } else {
                newArr[i] = arr[j]; // copy from old array
                j++;
            }
        }

        // Print result
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
