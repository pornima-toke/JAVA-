/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
public class InsertAtIndex
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Input size of array
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//Input Elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input index and value
        System.out.print("Enter index to insert value: ");
        int index = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        // Create new array with +1 size
        int[] newArr = new int[n + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert new value
        newArr[index] = value;

        // Copy remaining elements
        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print result
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
