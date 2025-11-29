//10. Remove Duplicate Elements from Array

import java.util.*;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the values in Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {
            boolean f = false;
           
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    f = true;
                    break;
                }
            }
            
            if (!f) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
