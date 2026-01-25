class Demo {

    // 1️⃣ Instance Variable
    int a = 10;

    // 2️⃣ Class Variable (Static Variable)
    static int x = 100;

    // 5️⃣ Instance Initializer
    {
        System.out.println("Instance Initializer Block");
        a = a + 5;
    }

    // 6️⃣ Static Initializer
    static {
        System.out.println("Static Initializer Block");
        x = x + 50;
    }

    // 4️⃣ Constructor
    Demo() {
        System.out.println("Constructor Called");
    }

    // 3️⃣ Method
    void show() {
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }

    // 7️⃣ Nested Class (Inner Class)
    class Inner {
        void display() {
            System.out.println("Inside Inner Class");
            System.out.println("a = " + a);
        }
    }
}

public class Extra {
    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.show();

        Demo d2 = new Demo();
        d2.show();

        Demo.Inner obj = d1.new Inner();
        obj.display();
    }
}



/*class Calculator {
	int add (int a, int b)
	{
		return a + b;
	}
 	double add(double a, double b)
	{
		return a + b;
	}
	int add (int a, int b, int c)
	{
		return a + b + c;
	}
}
public class Extra
{
	public static void main(String x[])
	{
        Calculator c = new  Calculator();
		System.out.println(c.add (2,3)); // int version
		System.out.println(c.add (2.5, 3.5));
		System.out.println(c.add (1,2,3));
    }	
}	
*/







/*public class Extra
{
	public static void main(String x[])
	{ 
	int arr [] = {1,5,7,-1,5};
	int sum = 6;
	int count  = 0;
	for(int i = 0 ; i < 5; i++)
	{
		for(int j = i + 1; j < 5; j++)
		{
			if(arr[i] + arr[j] == sum)
			{
				count++;
			}
		}
	}
	System.out.println(count);*/
	
	
	/*int arr [] = {3,7,2,5,9};
	int max = arr[4];
	for(int i = 1; i < 5; i++)
	{
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	System.out.println(max);*/
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	int sum = 0;
	int temp = n;
	
        while (temp > 0) 
		{
            int digit = temp % 10;
            int fact = 1;
            int i = 1;

            while (i <= digit) 
			{
                fact = fact * i;
                i++;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n)
		{
            System.out.println("Strong Number");
		} else{
            System.out.println("Not a Strong Number");
		} 
		*/
		 
	
	/*Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c)
		{
			System.out.println("Equilateral Triangle");
		}else if(a == b || b == c || a == c)
		{
			System.out.println("Isoscale Triangle");
		}
		else if (a != b && b != c && a != c)
		{
			System.out.println("Scalene triangle");
		}
		else{
			System.out.println("none");
		}*/
		
		/*System.out.println("Enter a day");
		int n = sc.nextInt();
		
		if (n % 2 == 0 && n % 3 == 0) 
		{
            System.out.println("Even & Div by 3");
        }
        else if (n % 2 == 0) 
		{
            System.out.println("Even");
        }
        else if (n % 3 == 0) 
        {
            System.out.println("Div by 3");
        }
        else {
            System.out.println("No Day");
        }*/
		
		
		/*System.out.println("Enter the cost price");
		int cp = sc.nextInt();
		
		System.out.println("Enter the Selling price");
		int sp = sc.nextInt();
		
		if(sp > cp)
		{
			System.out.println("Profit" + (sp - cp));
		} 
		else if(sp < cp)
		{
			System.out.println("Loss" + (cp - sp));
		}
		else{
			System.out.println("No Profit No Loss");
		}*/