/* Q8. Write a java program to find the total number of notes in a given 
amount.   
Enter the amount: 2528  
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1 */

import java.util.*;
public class FindTotalNo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int originalAmount = amount;
        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Breakdown of " + originalAmount + ":");

        for (int note : notes) {
            int count = amount / note;     
            amount = amount % note;       
            System.out.println(note + " = " + count);
			'
        }
    }
}

