/*13. Find Power of a Number Create a class PowerCalculator with a method power that calculates base raised to an exponent.Explanation: Demonstrates looping or recursion. */
import java.util.*;
	public void PowerCalculator
Example with source code 
class A
{
	private int value;
  void setValue(int value)
  {this.value=value;
  }
  int getValue()
  { return value;
  }
}
class B 
{ void setA(A a1)
  { a1.setValue(a1.getValue()*10);
  }
}
public class ABAPP
{   public static void main(String x[])
    {  A a1 = new A();
	   a1.setValue(10);
	   new B().setA(a1);
	   System.out.println("Result is "+a1.getValue());
	}
}

