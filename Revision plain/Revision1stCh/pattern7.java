/*
		1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/

public class pattern7{
	public static void main(String x[]){
	
	for(int i=1;i<=5;i++){
		int m = i, n=2;
		for(int j=1;j<=9;j++){
			if((j>=6-i && j<=4+i) || i==5){
				if(j<=5){
				System.out.print(m+ " ");
			m--;
			}
			else{
				System.out.print(n+ " ");
				n++;
			}
			}
			else{
				System.out.print("  ");
			}
		
	}
	System.out.println();
}
	}
}