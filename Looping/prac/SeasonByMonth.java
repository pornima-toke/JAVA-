/*Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season. */
	
import java.util.*;
public class SeasonByMonth {
	 public static void main(String [] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the number");
		int month = sc.nextInt();

        if(month == 12 || month == 1 || month == 2)
            System.out.println("Winter");
        else if(month >= 3 && month <= 5)
            System.out.println("Spring");
        else if(month >= 6 && month <= 8)
            System.out.println("Summer");
        else if(month >= 9 && month <= 11)
            System.out.println("Autumn");
        else
            System.out.println("Invalid Month");
    }
}

