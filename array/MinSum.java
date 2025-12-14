import java.util.*;
public class MiniSum
{
    public static int MiniSum(int[] arr, int k) {

    int windowSum = 0;
    for (int i = 0; i < k; i++)
    {
      windowSum += arr [i];
    }
     int minSum = windowSum;
     for(int i = k; i<n; i++) 
    {
      windowSum += arr[i] - arr[i - k];
      minSum = math.min(minSum, windowSum);
     }
      return minSum;
     }
    public static void main (String x[]) {
     int [] arr = {2, 1, 5, 1, 3, 2};
     int k = 3;

      int result = minSumSubarray(arr, k);
      System.out.println("Minimum sum of subarray of size " + k + " = " + result);
  }
}