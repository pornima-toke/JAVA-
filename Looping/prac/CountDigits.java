//10.Write a C program to count the number of digits in a number.


import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(), count = 0;

        if (num == 0) count = 1;
        else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Total digits: " + count);
    }
}













public class Q10_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(), count = 0;

        if (num == 0) count = 1;
        else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Total digits: " + count);
    }
}
