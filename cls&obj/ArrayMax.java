/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max.*/
import java.util.Scanner;

class ArrayMax {
    int arr[];
    int size;

    // function to take input
    void inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // function to find maximum element
    int findMax() {
        int max = arr[0]; // assume first element is max
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
        }
        return max;
    }

    // function to find minimum element
    int findMin() {
        int min = arr[0]; // assume first element is min
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i]; // update min
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayMax obj = new ArrayMax();
        obj.inputArray();

        System.out.println("Maximum Element = " + obj.findMax());
        System.out.println("Minimum Element = " + obj.findMin());
    }
}
