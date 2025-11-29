//3. Write program to character from keyboard and check character is alphabet digit or special symbols?

import java.util.*;
public class CharCheck
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a character:");
		        
		char ch = sc.next().charAt(0);
		
        if(Character.isLetter(ch))
			
            System.out.println("Alphabet");
			
        else if(Character.isDigit(ch))
			
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
	}
}