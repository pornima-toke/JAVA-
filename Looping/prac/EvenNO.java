//4.Write a C program to print all even numbers between 1 to 100. - using while loop

/*
import java.util.*;
public class EvenNO {
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number");
		
		int i = 2;  // Even no 
		
		while (i <= 100) {
			System.out.println( i + " ");
			i++;
		}
	}
}
*/

public class EvenNo {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
