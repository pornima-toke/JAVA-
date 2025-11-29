/*2. Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]*/

   
public class Array11{
	public static void main(String x[]){
	int a [] = {1,1,2,2,3};
	
	int start=0 ,end = 1;
	while(end<a.length){
		if(a[start]==a[end]){
			a[end] = -1;
			end++;
			
			}else{
				start = end;
				end++;
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=-1)
		System.out.println(a[i]+ " ");
		}
	}
	
	}

