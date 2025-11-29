//14. Write a program to create an array of size 10 and find occurrences of every element in the array?


import java.util.*;

public class Q14 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int a[] = new int[n];

        System.out.println("Enter 10 values in the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Occurrences of each element:");

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean printed = false;

            // Check if this element was already printed
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    printed = true;
                    break;
                }
            }

            if (!printed) {
                // Count occurrences
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
                System.out.println(a[i] + " occurs " + count + " times.");
            }
        }

       
    }
}
