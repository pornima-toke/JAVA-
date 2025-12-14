import java.util.Scanner;

public class SmallestElement {

    // Function to find the smallest element in the array
    public static int findMin(int arr[]) {
        int min = arr[0];  // assume first element is the smallest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // update min if a smaller element is found
            }
        }
        return min;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        int smallest = findMin(arr);

        // Display result
        System.out.println("Smallest element in the array: " + smallest);

        sc.close();
    }
}
