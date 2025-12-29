package something;

import java.util.*;
class Mul
{
	int a , b;
	void setValue(int x, int y)
	{
		a = x;
		b = y;
	}
	void showMul()
	{
		System.out.printf("Multiplication is %d\n", a * b);
	}
}
public class UseRefObj
{
	public static void main(String x[])
	{
		Mul m1 = new Mul();
		m1.setValue(10,20); //20000.setValue(10, 20)
		m1.showMul(); //20000.showMul();
	}
}
