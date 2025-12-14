//Q11. Write a java program to enter marks of five subjects and calculate total marks and percentage.
import java.util.*;
public class FivesubCal
{
	public static void main(String x[])
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks of Subject 1:");
			int sub1 = sc.nextInt();
			
			System.out.println("Enter marks of Subject 2:");
			int sub2 = sc.nextInt();
			
			System.out.println("Enter marks of Subject 3:");
			int sub3 = sc.nextInt();
			
			System.out.println("Enter marks of Subject 4:");
			int sub4 = sc.nextInt();
			
			System.out.println("Enter marks of Subject 5:");
			int sub5 = sc.nextInt();
			
			int total = sub1 + sub2 + sub3 + sub4 + sub5;
			
            double percentage = total / 500 * 100;
          	System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage + "%");
    }
}		 
/*

        Scanner sc = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int sub5 = sc.nextInt();

        // Calculate total marks
        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculate percentage
        double percentage = (total / 500.0) * 100;

        // Output the result
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
*/