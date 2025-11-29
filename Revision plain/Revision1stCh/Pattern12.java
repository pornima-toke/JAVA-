

public class pattern12{
	public static void main(String x[]){
	
	for(int i=1;i<=5;i++){
		int n=65;
		for(int j=1;j<=9;j++){
			if((j>=6-i && j<=4+i) || i==5){
				if(j<=5){
				System.out.print((char)(n+i)+ " ");
				
			}
			else{
				System.out.print((char)n+ " ");
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