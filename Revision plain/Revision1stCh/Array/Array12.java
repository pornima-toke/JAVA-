/*3. Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]*/


public class Array12{
	public static void main(String x[]){
	
	int a[] = {0,1,0,3,12};
	
	int s = 0 , e=1;
	
	while(e<a.length){
		if(a[e]!=0){
		   int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			
			s++;
		}
		e++;
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]+ " ");
	}
	}
}


