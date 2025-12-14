//Q6. Write a java program to enter length in centimeter and convert into meter and kilometer.
import java.util.*;
public class LengthCon
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(String.in);
		//Input from user
		System.out.println("Enter length in centimeters: ");
		double cm = sc.nextDouble();
        // Conversion logic
        double meters = cm / 100;       // 1 meter = 100 centimeters
        double kilometers = cm / 100000; // 1 kilometer = 100,000 centimeters

        // Output results
        System.out.println("Length in meters: " + meters);
        System.out.println("Length in kilometers: " + kilometers);
    }
}
