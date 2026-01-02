/* 1.input nums = [3,0,1]  
   2.input nums[0,3]
   3.input nums[0,1,2,4,3,5,9,7,6]
*/
import java.util.*;
public class MissingNo
{
	public static void main(String x[])
	{
	    int[] nums = {0, 1, 3};   // input array
        int n = nums.length;

        int sum = n * (n + 1) / 2;
        int actSum = 0;

        for (int num : nums) {
            actSum += num;
        }

        int missing = sum - actSum;
        System.out.println("Missing number is: " + missing);
    }
}