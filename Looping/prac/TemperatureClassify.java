/*Q40. Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type. */

import java.util.*;
public class TemperatureClassify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("Enter the number");
		int num = sc.nextInt();
		if(temp < 0)
            System.out.println("Freezing");
        else if(temp <= 20)
            System.out.println("Cold");
        else if(temp <= 34)
            System.out.println("Warm");
        else
            System.out.println("Hot");
    }
} */

int temp = sc.nextInt();

        if(temp < 0)
            System.out.println("Freezing");
        else if(temp <= 20)
            System.out.println("Cold");
        else if(temp <= 34)
            System.out.println("Warm");
        else
            System.out.println("Hot");
    }
}

