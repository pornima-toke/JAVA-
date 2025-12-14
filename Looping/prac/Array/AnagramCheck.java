//Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
//Check if two strings are anagrams using sorting and comparing via two pointers.
import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Convert to char array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Step 3: Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare using two pointers
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] != arr2[j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
