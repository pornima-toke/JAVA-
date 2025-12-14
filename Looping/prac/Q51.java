 /*
Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.*/


import java.util.*;
public class Q51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			     System.out.println("31 days"); break;
			case 4: case 6 : case 9: case 11:
			     System.out.println("30 days");
			case 2:
			   if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				   System.out.println("28 days");
			 break;
			 default:
			 System.out.println("Invalid month");
        }
    }
} 
