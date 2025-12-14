Q1. Input & Display Array
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

Q2. Sum of Array
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum = " + sum);
    }
}

Q3. Max & Min
public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 20};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}

Q4. Even & Odd Numbers
public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40};

        System.out.print("Even: ");
        for (int n : arr) if (n % 2 == 0) System.out.print(n + " ");
        
        System.out.print("\nOdd: ");
        for (int n : arr) if (n % 2 != 0) System.out.print(n + " ");
    }
}

Q5. Positive & Negative
public class PosNegArray {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -15, 30};
        
        System.out.print("Positive: ");
        for (int n : arr) if (n >= 0) System.out.print(n + " ");
        
        System.out.print("\nNegative: ");
        for (int n : arr) if (n < 0) System.out.print(n + " ");
    }
}

Q6. Search Element
public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int n : arr) {
            if (n == key) { found = true; break; }
        }
        System.out.println(found ? "Element found" : "Not found");
    }
}

Q7. Reverse Array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

Q8. Sum of Even & Odd
public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int evenSum = 0, oddSum = 0;
        for (int n : arr) {
            if (n % 2 == 0) evenSum += n;
            else oddSum += n;
        }
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}

Q9. Merge Two Arrays
public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = new int[a.length + b.length];
        
        int k = 0;
        for (int n : a) c[k++] = n;
        for (int n : b) c[k++] = n;

        System.out.print("Merged: ");
        for (int n : c) System.out.print(n + " ");
    }
}

Q10. Check Palindrome Array
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean isPal = true;
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            if (arr[i] != arr[n-1-i]) {
                isPal = false;
                break;
            }
        }
        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}

Q11. Print Elements at Even Indices
public class EvenIndices {
    public static void main(String[] args) {
        int[] arr = {4,9,7,11,6};
        System.out.print("Even indices: ");
        for (int i=0;i<arr.length;i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}

Q12. Find Missing Values
import java.util.*;

public class MissingValues {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,11,15};
        int max = arr[arr.length-1];
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);

        System.out.print("Missing: ");
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) System.out.print(i + " ");
        }
    }
}

Q13. Copy Array
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];

        for (int i=0;i<a.length;i++) b[i] = a[i];

        System.out.print("Copied: ");
        for (int n : b) System.out.print(n + " ");
    }
}

Q14. Insert at Index
public class InsertArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 2, val = 200;
        int[] newArr = new int[arr.length+1];

        for (int i=0,j=0;i<newArr.length;i++) {
            if (i==index) newArr[i]=val;
            else newArr[i]=arr[j++];
        }

        for (int n:newArr) System.out.print(n+" ");
    }
}

Q15. Delete at Index
public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 2;
        int[] newArr = new int[arr.length-1];

        for (int i=0,j=0;i<arr.length;i++) {
            if (i==index) continue;
            newArr[j++]=arr[i];
        }

        for (int n:newArr) System.out.print(n+" ");
    }
}

Q16. Second Highest Value
import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {10,30,50,20,40};
        Arrays.sort(arr);
        System.out.println("Second highest = " + arr[arr.length-2]);
    }
}

Q17. Majority Element

(More than n/2 times)

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,3,4,2,3,3,5};
        int n = arr.length, majority=-1;

        for (int i=0;i<n;i++) {
            int count=0;
            for (int j=0;j<n;j++) {
                if (arr[i]==arr[j]) count++;
            }
            if (count>n/2) { majority=arr[i]; break; }
        }
        System.out.println(majority==-1 ? "No Majority" : "Majority element = "+majority);
    }
}

Q18. Remove Duplicates
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int n:arr) set.add(n);

        System.out.println("Without duplicates: " + set);
    }
}

Q19. Prime Numbers in Array
public class PrimeArray {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,11,15};
        System.out.print("Primes: ");
        for(int n:arr) if(isPrime(n)) System.out.print(n+" ");
    }
}

Q20. Perfect Numbers in Array
public class PerfectArray {
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++) if(n%i==0) sum+=i;
        return sum==n;
    }
    public static void main(String[] args) {
        int[] arr = {6,28,12,15};
        System.out.print("Perfect numbers: ");
        for(int n:arr) if(isPerfect(n)) System.out.print(n+" ");
    }
}

Q21. Duck Numbers (contains 0 but not starting with 0)
public class DuckArray {
    static boolean isDuck(int n){
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0)!='0';
    }
    public static void main(String[] args) {
        int[] arr = {120,305,7,80,25};
        System.out.print("Duck numbers: ");
        for(int n:arr) if(isDuck(n)) System.out.print(n+" ");
    }
}

Q22. Strong Numbers (sum of factorial of digits = number)
public class StrongArray {
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    static boolean isStrong(int n){
        int sum=0,temp=n;
        while(n>0){
            sum+=fact(n%10);
            n/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        int[] arr = {145,2,123,40585};
        System.out.print("Strong numbers: ");
        for(int n:arr) if(isStrong(n)) System.out.print(n+" ");
    }
}

Q23. Armstrong Numbers
public class ArmstrongArray {
    static boolean isArmstrong(int n){
        int sum=0,temp=n,digits=String.valueOf(n).length();
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,digits);
            n/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        int[] arr = {153,370,371,407,100};
        System.out.print("Armstrong numbers: ");
        for(int n:arr) if(isArmstrong(n)) System.out.print(n+" ");
    }
}