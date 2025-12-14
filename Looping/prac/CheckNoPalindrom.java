//Q4. Write a java program to check whether number is palindrome or not palindrome using ternary operators.  
import java.util.*;
public class CheckNoPalindrom
{
	public static void main(String x [])
	{
		Scanner sc = new Scanner (System.in);
		 System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
         if(num > 0) {
            int digit = num % 10;     
            reverse = reverse * 10 + digit; 
            num = num / 10;           
            System.out.println(originalNum + " is a Palindrome Number");
          
            System.out.println(originalNum + " is Not a Palindrome Number");
        }
    }
}
