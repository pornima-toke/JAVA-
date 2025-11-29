/*9. Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2*/

public class Array18{
	public static void main(String x[]){
	int a[] = {2,1,3,4,1,2};
	int sum=0, k=3; double avg=0;
	int count=0;
	for(int i=0;i<a.length;i++){
		sum = sum + a[i];
		if(i>=k-1){
			//System.out.println(sum);
			avg = (double)sum/k;
			
			if(avg>=2){
				count++;
			}
			sum = sum - a[i-(k-1)];
		}
		
		
	}
	System.out.println(count);
	
	
	}
}


