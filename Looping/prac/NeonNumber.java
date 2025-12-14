/*Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.  */
		
import java.util.*;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		
		int num = sc.nextInt();
		        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
