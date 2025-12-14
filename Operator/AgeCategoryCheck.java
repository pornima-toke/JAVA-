/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/
import java.util.Scanner;

public class AgeCategoryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        // Input age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check and display age category
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        } else if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age < 20) {
            System.out.println("You are a Teenager.");
        } else if (age < 60) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior.");
        }
    }
}
*/

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