//Q8. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//Formula :- fah = (cel * 9 / 5) + 32;
import java.util.*l;
public class TempCelFah
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter temperature in Celsius :");
		double cel = sc.nextDouble();
		double fah = (cel * 9 / 5) + 32;
		System.out.println("Temperature Fahrenheit" + fah);
	}
}