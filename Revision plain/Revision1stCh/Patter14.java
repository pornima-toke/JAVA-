/*A B C D E F G H I
  A B C D E F G
    A B C D E
      A B C
        A
      A B C
    A B C D E
  A B C D E F G
A B C D E F G H I*/

public class Patter14{
	public static void main(String x[]){
	
	int n=9;
	for(int i=1;i<=n;i++){
	int m=65;
		for(int j=1;j<=n;j++){
		  //if((i<=(n+1)/2 && j>=i && j<=(n+1)-i)||(i>=(n+3)/2 && j>=(n+1)-i && j<=i))
			  if((i<=5 && j>=i && j<=10-i) || (i>=6 && j>=10-i && j<=i))
		  { 
		    System.out.print((char)m+ " ");
			m++;
		  }
		  else
		  {
		   System.out.print("  ");
		  }
		}
		System.out.println();
	}
	
	}
}