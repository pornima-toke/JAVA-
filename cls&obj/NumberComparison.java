/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
class NumberComparison
{
    //Method compared two method
    void compare(int a, int b)
	{
		//Equals
		if (a == b)
		{
			System.out.println(a + "and" + b + "are EQUAL");
		}
		//Gretter
		else if(a > b)
		{
			System.out.println(a + "is GREATTER than" + b);
		}
	    //otherwise b is greater
		else
		{
			System.out.println(a + "is LESS than" +b);
		}
	}
	//main method
	public static void main(String x[])
	{
		//create a object
		NumberComparison obj = new NumberComparison();
		
		//test value
		int num1 = 20;
		int num2 = 15;
		
		//call compare method
		obj.compare(num1, num2);
	}
}