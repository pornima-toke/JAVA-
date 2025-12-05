/*Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05
Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%
Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.
Concepts Used			
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array
*/

import java.util.*;
class Vehicle{
	private String brand;
	private String model;
	private int basePrice;
	
	Vehicle(String brand,String model,int basePrice){
	
		this.brand = brand;
		this.model =model;
		this.basePrice = basePrice;	
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel(){
		return model;
	}
	public int getBaseprice(){
		return basePrice;
	}
	
	public double calculatePremium(){
		int bs = getBaseprice();
			return bs*0.5;
	}
	
	public String toString(){
		
		return brand + " " + model + "(Base Price:" +basePrice +" ) ";
	}
}
class Car extends Vehicle{
	private boolean airbag;
	
	Car(String brand, String model , int basePrice, boolean airbag){
		super(brand , model, basePrice);
		this.airbag = airbag;
		
	}
	public double calculatePremium(){
		if(airbag){
			
			return getBaseprice()*0.12;
		}
		else{
			return getBaseprice()*0.05;
		}
		
	}

}
class Bike extends Vehicle{
	
	private boolean Abs;
	
	Bike(String brand, String model , int basePrice, boolean Abs){
		super(brand , model, basePrice);
		this.Abs = Abs;
		
	}
	public double calculatePremium(){
		if(Abs){
			
			return getBaseprice()*0.08;
		}
		else{
			return getBaseprice()*0.03;
		}
		
	}
}


public class PremiumCalculation{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
	Vehicle v[] = new Vehicle[5];
	
	for(int i=0;i<v.length;i++){
		System.out.println("Enter the type of vehicle (1.Car 2. Bike:)");
		int type = sc.nextInt();
	System.out.println("Enter the 1.Brand, 2.Model , 3.BasePrice of Vehicle:");
	String br = sc.next();
	String mo = sc.next();
	int bp = sc.nextInt();
	
	if(type == 1){
		System.out.println("Car Having Airbag:");
		boolean ar = sc.nextBoolean();
		
		v[i] = new Car(br , mo , bp, ar);
	}
	
	else{
		System.out.println("Bike Having Abs:");
		boolean abs = sc.nextBoolean();
		
		v[i] = new Bike(br , mo , bp, abs);
	}
		
}

	Vehicle maxvehicle = v[0];
	
	double maxPremium = v[0].calculatePremium();
	
	for(int i=0; i<v.length;i++){
		
		double premium = v[i].calculatePremium();
		
		if(premium>maxPremium){
			
			maxvehicle = v[i];
			
			maxPremium = premium;
		}
}
	
	System.out.println("------------------------------------------------");
	System.out.println(maxvehicle);
	
	System.out.println("Premium: " +maxPremium);
	
	}
}