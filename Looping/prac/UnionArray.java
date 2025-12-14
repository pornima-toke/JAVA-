//Q7. Write a java program to find union array & intersection array of a two array.

import java.util.*;
public class UnionArray {
	
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6}; //apply arr 2 
        int[] arr2 = {2, 4, 6, 8};

        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection: " + intersection);
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        // start loop
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++; // adding next
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
