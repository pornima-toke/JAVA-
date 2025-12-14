import java.util.*;
public class SFAPP
{   public static void main(String x[])
	{ Scanner xyz  = new Scanner(System.in);
	   int no,p,temp,count=0,first,last;
	   System.out.println("Enter number from keyboard");
	   no=xyz.nextInt();
	   temp=no;
	   System.out.println("Before swap  "+no);
	   while(no!=0)
	   {
	     ++count;
		 no  = no /10;
	   }
	   no=temp;
	   last=no%10; //extarct last digit 
       p=(int)Math.pow(10,--count);	  //calcualte power 
	   first=no/p; //extact first digit 
	   no=no%p; //remove first digit
	   no = no/10; //remove last digit 
	   last= last*p; 
	   no =no*10;
	   no=  last+no+first;
	   System.out.printf("AFter swap %d\n",no);
	}
}
