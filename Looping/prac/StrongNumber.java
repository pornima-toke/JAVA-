//Q24. Write a java program to Check Number Is Strong Number or Not.
//Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,

import java.util.*;
public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if(sum == num)
            System.out.println(num + " is a Strong Number.");
        else
            System.out.println(num + " is Not a Strong Number.");
    }
}
