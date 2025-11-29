/*
	A
   A  A
  A    A
 A      A
A        A
 A      A
  A    A
   A  A
    A
	
*/
public class Pattern13{
	public static void main(String x[]){
	for(int i=1;i<=9;i++){
		int n=65;
		for(int j=1;j<=9;j++){
		
		if(j==6-i || j==4+i || j==i-4 || j==14-i){
			
			System.out.print((char)n+ " ");
		
		}else{
			System.out.print("  ");
		}
	}
	System.out.println();
	}
}
}