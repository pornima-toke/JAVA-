/* Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category. */

import java.util.*;
public class AgeCategory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		
        if(age >= 0 && age <= 12)
            System.out.println("Child");
	 else if(age >= 13 && age <= 19)
		    System.out.println("Teenager");
		if(age >= 20 &&  age <= 59)
		    System.out.println("Adult");
	 else if (age >= 60 )
		    System.out.println("Senior");
		else 
			System.out.println("Invalid Age");
			
	}
}