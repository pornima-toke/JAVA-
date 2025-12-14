/*Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not. */
	
import java.util.*;
public class Scholarship {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		 double attendance = sc.nextDouble();
        double marks = sc.nextDouble();

        if(attendance >= 75 && marks >= 80)
            System.out.println("Eligible for Scholarship");
        else
            System.out.println("Not Eligible");
    }
}