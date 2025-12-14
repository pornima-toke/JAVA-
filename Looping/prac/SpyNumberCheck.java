//Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function recursion.

import java.util.Scanner;
public class SpyNumberCheck {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0, prod = 1;
		
		// process each digit using while loop
		
        while (num > 0) {
            int digit = num % 10; 
            sum += digit;   
            prod *= digit; 
            num /= 10; 
        }
		// check spy no condition
        if (sum == prod)
            System.out.println("Spy Number"); 
        else
            System.out.println("Not a Spy Number");
    }
}
