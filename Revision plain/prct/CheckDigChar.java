//3. Write program to character from keyboard and check character is alphabet digit or special symbols?
import java.util.*;
public class CheckDigChar
{
   public static void main(String x[])
   {
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter the character from keyboard:");
	int ch = sc.next().charAt(0);
	
	String res = ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ? 
	"Alphabet" : ch >= '0' && ch <= '9' ?"Digit" : "Special Character";
	
	System.out.println(res);
	}
}