//Q1. Write a Java program to convert seconds to hours, minutes and seconds.  

import java.util.*;
public class ConSecHrMin
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter total seconds");
		int totalSeconds = sc.nextInt();
		
		int hours = totalSeconds / 3600;  //1hr = 3600   
		int reamainingSeconds = totalSeconds % 3600;
		
		int minutes = reamainingSeconds / 60;  //1min = 60sec
		int seconds = reamainingSeconds % 60;
		System.out.println("Time: " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");
    }
}