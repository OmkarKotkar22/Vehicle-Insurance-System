package Vehicle;

public class Vehicle {
	String brand;
	String model;
	double basePrice;
	
	Vehicle(String brand, String model, double basePrice){
		this.brand = brand;
		this.model = model;
		this.basePrice = basePrice;
	}
	
	double calculatePremium()
	{
		return basePrice * 0.05;
	}
}
