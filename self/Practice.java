import java.util.*;
public class Practice
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		int p = 1;
		
		while( n != 0)
		{
			int digit = n % 10;
		//	System.out.println(digit);
			sum = sum + digit;
			p = p * digit;
			n = n / 10;
		}
		if( sum == p)
		{
			System.out.println( "yes");
		}
		else{
			System.out.println("no");
		}
		
		//char ch = sc.next().charAt(0);
		
		//if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		//	System.out.println("It is Vowel");
		//}else{
	   // System.out.println(" Not Vowel");}
//or
	/*	switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
		       System.out.println("It is Vowel");
		      break;
			  default:
	             System.out.println(" Not Vowel");
		}*/
		
	
		/*
		System.out.println("Enter the character :");
	    char ch = sc.next().charAt(0);
	    System.out.printf("%c :%d", ch, (int)ch);*/
		
		
		/*
		System.out.println("Cost Price");
		int cp = sc.nextInt();
		
		System.out.println("Selling Price");
		int sp = sc.nextInt();
		
		if (sp > cp)
		{
            System.out.println("Profit = " + (sp - cp));
		}else if (sp < cp)
		{
            System.out.println("Loss = " + (cp - sp));
        }else{
            System.out.println("No Profit No Loss");
        }*/
		
		/*if( n % 5 == 0 && n % 11 == 0)
		{
			System.out.println("divisible by 5 and 11 ");
		} else{
			System.out.println("Not divisible by 5 and 11 ");
		}*/
		
		/*if(n > 0)
		{
			System.out.println("Positive Number");
		}
	    else if (n < 0)
			{
				System.out.println("Negative Number");
			}
			else
			{
				System.out.println("Zero");
			}*/
		
		
		/*int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//if(a+b>c && a+c>b && b+c>a)
        // if (a + b + c == 180 && a > 0 && b > 0 && c > 0) //Equilateral Triangle
		//if(a == b || b == c || a == c) //Isoscale Triangle
		 if (a != b && b != c && a != c) //Scalene Triangle
		{
            System.out.println("yes");
        } else {
            System.out.println("Not");
        }*/
		
		/*
		int n = sc.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("Even");
		}else{
			System.out.println("odd");
		*/
		
		/*
		if(n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("Multiply 3 and 5");
		}else{
			System.out.println("Not Multiply ");
		}*/
		
		/*
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Toggled case: " + (char)(ch ^ 32));
        } else {
            System.out.println("Not an alphabet character");
        }*/
		/*
		System.out.println("Enter a numbers:");
        int n = sc.nextInt();
		
		int sum = 0;
		int product = 1;
		
		while( n != 0 )
		{
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;
		}
		if( sum == product)
		{
			System.out.println("Spy Number:");
		} else {
			System.out.println("Not Spy Number");
		}*/
		
		/*
		int lastDigit = n % 10;
	    int firstDigit = n / (int) Math.pow(10, (int)Math.log10(n));

        int sum = firstDigit + lastDigit;

        System.out.println("Sum = " + sum);
		
		*/
		/*
		int sum = 0;
		int square = n * n;
		int temp = square;
		
		while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        if (sum == n)
		{
            System.out.println("Neon Number");
        }else
		{
            System.out.println("Not a Neon Number");
		} */
    }
}
		//int rev = 0;
	
		//for(int i=0;i<n;i++){
			//int digit = n%10;
		/*	
		while( n > 0)
			{
				int digit = n % 10;
				rev = rev * 10 + digit;
			      n = n/10;
			}
		
		System.out.println("Ans:-" + rev);
		*/
		/*
		System.out.println("Enter a radius of a circle");
		double cel = sc.nextDouble();
		
		double fah = (cel * 9 / 5) + 32;

		//double cel = (fah - 32) * 5 / 9;
		
		System.out.println("value:-" + fah);
		*/
		/*double diameter = 2 * radius;
		double circumference = 2 * 3.14 * radius;
		double area = 3.14 * radius * radius;
		
		
		System.out.println("Diameter:- " + diameter);
		System.out.println("Circumference:- " + circumference);
		System.out.println("Area:- " + area); */
	