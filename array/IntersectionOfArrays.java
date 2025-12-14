//Find Intersection of Two Sorted Arrays
//Return the intersection of two sorted arrays using two pointers.


import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection: " + intersection);
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
