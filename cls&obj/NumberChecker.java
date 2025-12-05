/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
class NumberChecker
{
	void isEven(int num)
	{
		//condition check 
		if (num % 2 == 0)
		{
			System.out.println(num + "is even");
		}
		else
		{
			System.out.println(num + "is odd");
		}
	}
	// Main method
	public  static void main(String x[])
	{
		//create object
		NumberChecker obj = new NumberChecker();
		 //test value
		 int number = 3;
		//call method
		obj.isEven(number);
	}
}