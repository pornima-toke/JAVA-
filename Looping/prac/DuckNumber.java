/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers. */

import java.util.*;
public class  DuckNumber {
	public static void main (String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		String num = sc.next();
		if(num.charAt(0) =='0') {
			System.out.println("Not a duck Number (Leading zero found)");
		} else if (num.contains("0")) {
			System.out.println(num = " is a Duck Number");
		}else {
			System.out.println(num + "is Not a Duck Number");
        }
    }
}
