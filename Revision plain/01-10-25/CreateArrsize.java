//10. Write a program to create an array of size 5 and display its value?
import java.util.*;

public class CreateArrsize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of size 5
        int arr[] = new int[5];

        // Accept values from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display values
        System.out.println("The array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
