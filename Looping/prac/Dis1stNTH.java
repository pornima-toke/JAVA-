//Q31. Write a java program to display 1 to nth Perfect Number.

import java.util.*;
public class PerfectSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many perfect numbers to display (n): ");
        int n = sc.nextInt();
        int count = 0, num = 1;

        while (count < n) {
            int sum = 0;
            int i = 1;
            while (i <= num / 2) {
                if (num % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
