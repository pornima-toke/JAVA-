//10. Find the Area of a Circle Create a class CircleArea with a method findArea that calculates the area //giventhe radius.

import java.util.*;
class CircleArea {
	public double findArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter radius of the circle:");
		double radius = sc.nextDouble();

		CircleArea circle = new CircleArea();
		double area = circle.findArea(radius);

		System.out.println("Area of the circle with radius" + radius + " = " +area);
	}
}