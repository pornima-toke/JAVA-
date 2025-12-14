//Q1. Write a java program to take input from array of size 5 and display it.
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];   // Array of size 5
		

        // Input elements
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display elements
        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
