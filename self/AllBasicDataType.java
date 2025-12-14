//Q2. Write a java program to input all basic data types and print its output.

import java.util.*;
public class AllBasicDataType
{
	public static void main(String x[])
	{
    int var = Integer.SIZE;
	int str = Character.SIZE;
	float fl = Float.SIZE;
	long lg = Long.SIZE;
	short sh = Short.SIZE;
	double d = Double.SIZE;
	byte b = Byte.SIZE;
	
	System.out.println("Integer = " + var/8);
	System.out.println("String = " + str/8);
	System.out.println("Float = " + fl/8);
	System.out.println("Long = " + lg/8);
	System.out.println("Short = " + sh/8);
	System.out.println("Double = " + d/8);
	System.out.println("Byte = " + b/8);
	
    }
}
