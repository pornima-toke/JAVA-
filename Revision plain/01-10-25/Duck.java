//6. Write a program to input numbers and check if the number is duck or not?
import java.util.*;
public class Duck
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        if(s.charAt(0)!='0' && s.contains("0"))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
