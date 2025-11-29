/*
1    2
 3  4
  5
 6  7
8    9
*/

public class Pattern11{
	public static void main(String x[]){
		
		int n=1;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		
		if(i==j || j==6-i){
			
			System.out.print(n+ " ");
			n++;
		}
		else{
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	}
}