//13. Write program to create array of size 5 and input search key value and search value in array
//and if value found return its index and return -1
import java.util.*;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        // Input array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input search key
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        // Search logic
        int index = -1;   // default value if not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;   // store index
                break;       // stop after first match
            }
        }

        // Output result
        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("-1 (Value not found)");
        }
    }
}
