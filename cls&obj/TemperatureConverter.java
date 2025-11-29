/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.*/
import java.util.*;
class TemperatureConverter {
	public double convertToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter temperature in Celsius:");
		double celsius = sc.nextDouble();

		TemperatureConverter converter = new TemperatureConverter();
		double fahrenheit = converter.convertToFahrenheit(celsius);

	      System.out.println(celsius + "°C = " + fahrenheit + "°F");
	}
}