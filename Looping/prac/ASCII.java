//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCII {
	public static void main(String x []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " = " + (char)i);
        }
    }
}