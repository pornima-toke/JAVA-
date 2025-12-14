/*Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of
 digits gives the number itself. For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers 
 and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more. */

import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        int digits = String.valueOf(num).length();

        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong Number.");
        else
            System.out.println(num + " is Not an Armstrong Number.");
    }
}

