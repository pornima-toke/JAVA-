
/*Q4. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.*/

import java.util.*;

class FindMax {
    int arr[];  // instance variable

    // function to accept array
    void setArray(int a[]) {
        arr = a;
    }

    // function to find maximum value
    int getMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class FindMaxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMax f = new FindMax();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        f.setArray(a);  // pass array to class
        int result = f.getMax();  // find max

        System.out.println("Maximum value in array: " + result);
    }
}
