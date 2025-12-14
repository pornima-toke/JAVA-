//Q26. Write a java program to Check Number Is Neon Number or Not.
//Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.

import java.util.*;
public class NeonNumber26 {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        int num = sc.nextInt();
        int square = num * num, sum = 0;

        while(square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if(sum == num)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is Not a Neon Number.");
    }
}
