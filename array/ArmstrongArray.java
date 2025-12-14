//Q23. Write a java program to find the armstrong number of an array. 

import java.util.Scanner;

public class ArmstrongArray {
    // Function to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // number of digits

        while (num > 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);  // raise digit to the power of digits
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find Armstrong numbers
        System.out.println("Armstrong numbers in the array:");
        boolean found = false;
        for (int num : arr) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong number found");
        }
    }
}
