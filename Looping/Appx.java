
public class Appx
{
public static void main(String args[])
    {
		
		int i=11;
		while(i<=20)//outer loop //i=14
		{
			System.out.println("outer while i:"+i); //i=14
             	
		int j=1;
			   while(j<=5)//inner loop
			   {
		         System.out.println("inner  while j:"+j);			    
					j++;
					 if(j==2)
					{
						break;// break the inner loop ie while(j<=5)
					}
			   }	
              				   
			  i++;//i=15
			 
		}
		System.out.println("last line of main");
	}
}