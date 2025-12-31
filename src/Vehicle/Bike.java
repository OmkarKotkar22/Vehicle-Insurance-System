package Vehicle;

public class Bike extends Vehicle{
	boolean abs;
	Bike(String brand, String model, double basePrice, boolean abs)
	{
		super(brand, model, basePrice);
		this.abs = abs;
	}
	
	double calculatePremium()
	{
		double basePrice = super.calculatePremium();
		if(abs)
		{
			return basePrice + (basePrice *0.08);
		}
		else
		{
			return basePrice + (basePrice *0.03);
		}
	}
}
